package ch.makery.adress.view;

import java.net.URL;
import java.util.ResourceBundle;

import ch.makery.adress.model.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
public class FormController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    private TextField ApellidosField;

    @FXML
    private TextField correoField;

    @FXML
    private TextField cpField;

    @FXML
    private TextField direccionField;

    @FXML
    private TableColumn<Persona, String> dniCol;
    
    @FXML
    private ChoiceBox<String> poliChoice;

    @FXML
    private ChoiceBox<String> primaChoice;

    @FXML
    private ChoiceBox<String> coberturaChoice;
    
    @FXML
    private TextField dniField;

    @FXML
    private TextField fechanacField;

    @FXML
    private TextField nombreField;

    @FXML
    private TableColumn<Persona, String> nyaCol;
    
    @FXML
    private TableColumn<Persona, String> apeCol;

    @FXML
    private TableView<Persona> tablaPersonas;

    @FXML
    private TextField telField;

    @FXML
    private RadioButton termsRB;
    // Este componente será un diálogo. Campos auxiliares para su gestión

	// Listado de personas de la aplicación
	private ObservableList<Persona> personaData = FXCollections.observableArrayList();
	
	
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void initialize() {
    	
    	coberturaChoice.getItems().addAll("Básica","Limitada","Amplia","Amplia Plus");
    	poliChoice.getItems().addAll("Coche","Moto","Hogar","Vida", "Salud", "Responsabilidad civil");
    	primaChoice.getItems().addAll("Trimestrales","Semestrales","Anuales");
   	
		if(personaData.isEmpty()) {
			personaData.add(new Persona("ClienteUno","Uno", "12345678A", "Trimestrales", "Coche", "Amplia", "Clienteuno@cliente.com", Utilidades.parse("12/12/2000"), 28001, "Calle uno", 666666661));
			personaData.add(new Persona("ClienteDos","Dos", "12345678B", "Semestrales", "Salud", "Limitada", "Clientedos@cliente.com", Utilidades.parse("12/12/2001"), 28002, "Calle dos", 666666662));
			personaData.add(new Persona("ClienteTres","Tres",  "12345678D", "Trimestrales", "Coche", "Básica", "Clientetres@cliente.com", Utilidades.parse("12/12/2002"), 28003,"Calle tres", 666666663));
			personaData.add(new Persona("ClienteCuatro","Cuatro", "12345678E", "Semestrales", "Vida", "Amplia", "Clientecuatro@cliente.com", Utilidades.parse("12/12/2003"), 28004,"Calle cuatro", 666666664));
			personaData.add(new Persona("ClienteCinco","Cinco", "12345678F", "Trimestrales", "Salud", "Limitada", "Clientecinco@cliente.com", Utilidades.parse("12/12/2004"), 28005,"Calle cinco", 666666665));
			personaData.add(new Persona("ClienteSeis","Seis", "12345678G", "Anuales", "Moto", "Básica", "Clienteseis@cliente.com", Utilidades.parse("12/12/2005"), 28006,"Calle seis", 666666666));
		}
		  tablaPersonas.setItems(personaData);
    	
    	
    	// Se inicializan las columnas firstName y lastName
    	nyaCol.setCellValueFactory(cellData -> cellData.getValue().sNombreProperty());
    	apeCol.setCellValueFactory(cellData -> cellData.getValue().sApellidosProperty());
    	dniCol.setCellValueFactory(cellData -> cellData.getValue().sDniProperty());
    	
    	
    }
    
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    private void InsertarClick(ActionEvent event) {
        if (isInputValid()) {
        	
            Persona pers = new Persona(null, null, null, null, null, null, null, null, 0, null, 0);
            
            pers.setSNombre(nombreField.getText());
            pers.setSApellidos(ApellidosField.getText());
            pers.setSDni(dniField.getText());
            pers.setSCorreo(correoField.getText());
            pers.setSfechanac(Utilidades.parse(fechanacField.getText()));
            pers.setIcPostal(Integer.parseInt(cpField.getText()));
            pers.setSdireccion(direccionField.getText());
            pers.setItelefono(Integer.parseInt(telField.getText()));
            pers.setSCobertura(coberturaChoice.getValue());
            pers.setSPrima(poliChoice.getValue());
            pers.setSPoliza(primaChoice.getValue());
            
	        // Carga la persona en el controlador
            
            if(!personaData.contains(pers)) {
            getPersonData().add(pers);
            tablaPersonas.setItems(getPersonData());
            }
            restablecerFrom();
        }
   }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void vaciarForm(ActionEvent event) {
    	restablecerFrom();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void seleccionar(MouseEvent event) {
    	Persona selecpersona = this.tablaPersonas.getSelectionModel().getSelectedItem();
    	if(selecpersona!=null) {
        	nombreField.setText(selecpersona.getSNombre());
        	ApellidosField.setText(selecpersona.getSApellidos());
        	dniField.setText(selecpersona.getSDni());
        	correoField.setText(selecpersona.getSCorreo());
        	fechanacField.setText(Utilidades.format(selecpersona.getSfechanac()));
        	cpField.setText(Integer.toString(selecpersona.getIcPostal()));
        	direccionField.setText(selecpersona.getSdireccion());
        	telField.setText(Integer.toString(selecpersona.getItelefono()));
        	coberturaChoice.setValue(selecpersona.getSCobertura());
        	poliChoice.setValue(selecpersona.getSPoliza());
        	primaChoice.setValue(selecpersona.getSPrima());
    	}
    	
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void restablecerFrom() {
        nombreField.setText(null);
        ApellidosField.setText(null);
        dniField.setText(null);
        correoField.setText(null);
        fechanacField.setText(null);
        cpField.setText(null);
        direccionField.setText(null);
        telField.setText(null);
        termsRB.setSelected(false);
        coberturaChoice.setValue(null);
        primaChoice.setValue(null);
        poliChoice.setValue(null);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Se llama cuando el usuario hace click en el botón "Delete"
     */
    @FXML
    private void borrarPersona(ActionEvent event) {
       	int selectedIndex = tablaPersonas.getSelectionModel().getSelectedIndex();
    	
    	// Si no hay ningún campo seleccionado, se muestra un alert
    	if (selectedIndex >= 0) {
    		// Si se ha seleccionado una fila, se muestra un pop up de confirmación
    		Alert confirm = new Alert(AlertType.CONFIRMATION);
        	
    		confirm.setTitle("Confirmación para eliminar");
    		//errorAlert.setHeaderText("Va a eliminar la fila seleccionada");
    		confirm.setContentText("¿Está seguro de que desea eliminar al cliente seleccionado?");
    		    	    		
    		// Si el usuario acepta, entonces se lleva a cabo la acción correspondiente
    		confirm.showAndWait().ifPresent(response -> {
    			if (response == ButtonType.OK) {
    				tablaPersonas.getItems().remove(selectedIndex);
    		    }
    		});
    	} else {
    		// Se muestra un alert si no se puede eliminar la fila
    		Alert errorAlert = new Alert(AlertType.ERROR);
        	
    		errorAlert.setTitle("Error al eliminar");
    		errorAlert.setHeaderText("Se ha producido un error");
    		errorAlert.setContentText("No se puede eliminar porque no ha seleccionado una fila o la tabla está vacía");
    		
    		errorAlert.showAndWait();
    	}    	
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void ModificarDatos(ActionEvent event) {
    	Persona personaseleccionada = this.tablaPersonas.getSelectionModel().getSelectedItem();
    	
    	if (personaseleccionada == null) {
    		Alert alert = new Alert(Alert.AlertType. ERROR);
    		alert.setHeaderText(null);

    		alert.setTitle("Error");

    		alert.setContentText("Desbes seleccionar una persona");
    		alert. showAndWait();
    	}	else {
            if (isInputValid()) {
            	
                Persona pers2 = new Persona(null, null, null, null, null, null, null, null, 0, null, 0);
                pers2.setSNombre(nombreField.getText());
                pers2.setSApellidos(ApellidosField.getText());
                pers2.setSDni(dniField.getText());
                pers2.setSCorreo(correoField.getText());
                pers2.setSfechanac(Utilidades.parse(fechanacField.getText()));
                pers2.setIcPostal(Integer.parseInt(cpField.getText()));
                pers2.setSdireccion(direccionField.getText());
                pers2.setItelefono(Integer.parseInt(telField.getText()));
                pers2.setSCobertura(coberturaChoice.getValue());
                pers2.setSPrima(poliChoice.getValue());
                pers2.setSPoliza(primaChoice.getValue());
                
                if(!this.personaData.contains(pers2)) {
                	personaseleccionada.setSNombre(pers2.getSNombre());
                	personaseleccionada.setSApellidos(pers2.getSApellidos());
                	personaseleccionada.setSDni(pers2.getSDni());
                	personaseleccionada.setSCorreo(pers2.getSCorreo());
                	personaseleccionada.setSfechanac(pers2.getSfechanac());
                	personaseleccionada.setIcPostal(pers2.getIcPostal());
                	personaseleccionada.setSdireccion(pers2.getSdireccion());
                	personaseleccionada.setItelefono(pers2.getItelefono());
                	personaseleccionada.setSCobertura(pers2.getSCobertura());
                	personaseleccionada.setSPrima(pers2.getSPrima());
                	personaseleccionada.setSPoliza(pers2.getSPoliza());
                	this.tablaPersonas.refresh();
                }
                else {
                	Alert alert = new Alert (Alert.AlertType. ERROR);
                		alert.setHeaderText (null);
                		alert.setTitle("Error");

                		alert.setContentText("La persona existe");
                		alert.showAndWait();
                		
                }
                restablecerFrom();
            }
         }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    private boolean isInputValid() {
        String errorMessage = "";

        if (nombreField.getText() == null || nombreField.getText().length() == 0) {
            errorMessage += "El campo Nombre está vacío\n"; 
        }
        if (ApellidosField.getText() == null || ApellidosField.getText().length() == 0) {
            errorMessage += "El campo Apellido está vacío\n"; 
        }
        if (dniField.getText() == null || dniField.getText().length() == 0) {
            errorMessage += "El campo DNI está vacío\n"; 
        }
        else {
        	if (!Utilidades.validarDni(dniField.getText())) {
        		errorMessage += "El campo DNI no es válido\n";
			}
        }

        if (correoField.getText() == null || correoField.getText().length() == 0) {
            errorMessage += "El campo Correo está vacío\n";     
        } else {
        	if(!Utilidades.validarCorreo(correoField.getText())) {
        		errorMessage += "El correo no sigue el patrón correcto\n";
        	}
        }
        
        if (direccionField.getText() == null || direccionField.getText().length() == 0) {
            errorMessage += "El campo Dirección está vacío\n";     
        } 
        if(cpField.getText().length() != 5) {
        	errorMessage += "El código postal es incorrecto\n";   
        }
        if(telField.getText().length() != 9) {
        	errorMessage += "El teléfono es incorrecto\n";   
        }

        
        else {
            // Se intenta convertir el Código postal y el tlf en entero y si da un error se muestra un mensaje
            try {
                Integer.parseInt(cpField.getText());
                Integer.parseInt(telField.getText());
            } catch (NumberFormatException e) {
                errorMessage += "Código postal o Teléfono no válido. Debe ser un número entero\n"; 
            }
        }


        if (fechanacField.getText() == null || fechanacField.getText().length() == 0) {
            errorMessage += "El campo Fecha de Nacimiento está vacío\n";
        } else {
            if (!Utilidades.validDate(fechanacField.getText())) {
                errorMessage += "El campo fecha de nacimiento no es válido. Usa el formato dd/mm/yyyy\n";
            }
        }
        if(poliChoice.getValue() == null) {
        	errorMessage += "Seleccione una póliza\n";   
        }
        if(primaChoice.getValue() == null) {
        	errorMessage += "Seleccione una prima\n";   
        }
        if(coberturaChoice.getValue() == null) {
        	errorMessage += "Seleccione una cobertura\n";   
        }
        if(termsRB.isSelected()==false){
        	errorMessage += "Debes aceptar los términos y condiciones\n";
        }
        
        if (errorMessage.length() == 0) {
            return true;
        } else {
        	// Se muestra un alert si no se puede eliminar la fila
    		Alert errorAlert = new Alert(AlertType.ERROR);
        	
    		errorAlert.setTitle("Hay campos incorrectos");
    		errorAlert.setHeaderText("Por favor, rellena correctamente los campos");
    		errorAlert.setContentText(errorMessage);
    		
    		errorAlert.showAndWait();
            return false;
        }

    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
	public ObservableList<Persona> getPersonData() {
		return personaData;
	}

    
}
