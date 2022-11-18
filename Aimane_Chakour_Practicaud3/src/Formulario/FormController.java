package Formulario;

import java.net.URL;
import java.util.ResourceBundle;

import Datos.Persona;
import application.Utilidades;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
	
    
    @FXML
    void initialize() {
    	// Se inicializan las columnas firstName y lastName
    	nyaCol.setCellValueFactory(cellData -> cellData.getValue().sNombreProperty());
    	apeCol.setCellValueFactory(cellData -> cellData.getValue().sApellidosProperty());
    	dniCol.setCellValueFactory(cellData -> cellData.getValue().sDniProperty());
    	
    }
    
    public void setPersona(Persona persona) {
    	
    	nombreField.setText(persona.getSNombre());
    	ApellidosField.setText(persona.getSApellidos());
    	dniField.setText(persona.getSDni());
    	correoField.setText(persona.getSCorreo());
    	fechanacField.setText(Utilidades.format(persona.getSfechanac()));
    	cpField.setText(Integer.toString(persona.getIcPostal()));
    	direccionField.setText(persona.getSdireccion());
    	telField.setText(Integer.toString(persona.getItelefono()));


    }
    
	
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
            
            setPersona(pers);
            
            if(!personaData.contains(pers)) {
            getPersonData().add(pers);
            tablaPersonas.setItems(getPersonData());
            }
            
            restablecerFrom();
        }
   }
    
    
    private void restablecerFrom() {
        nombreField.setText(null);
        ApellidosField.setText(null);
        dniField.setText(null);
        correoField.setText(null);
        fechanacField.setText(null);
        cpField.setText(null);
        direccionField.setText(null);
        telField.setText(null);
    }
    
    
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
        } 
        
        if (direccionField.getText() == null || direccionField.getText().length() == 0) {
            errorMessage += "El campo Dirección está vacío\n";     
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
                errorMessage += "El campo birthday no es válido. Usa el formato dd/mm/yyyy\n";
            }
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
    
	public ObservableList<Persona> getPersonData() {
		return personaData;
	}

    
}
