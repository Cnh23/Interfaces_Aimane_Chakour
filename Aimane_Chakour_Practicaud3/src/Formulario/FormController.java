package Formulario;

import java.net.URL;
import java.util.ResourceBundle;

import Datos.Persona;
import application.Utilidades;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

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
    private TableView<Persona> tablaPersonas;

    @FXML
    private TextField telField;

    @FXML
    private RadioButton termsRB;
    // Este componente será un diálogo. Campos auxiliares para su gestión

    private Persona persona;
    private boolean InsertarClicked = false; 
    
    @FXML
    void initialize() {
        assert ApellidosField != null : "fx:id=\"ApellidosField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert correoField != null : "fx:id=\"correoField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert cpField != null : "fx:id=\"cpField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert direccionField != null : "fx:id=\"direccionField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert dniCol != null : "fx:id=\"dniCol\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert dniField != null : "fx:id=\"dniField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert fechanacField != null : "fx:id=\"fechanacField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert nombreField != null : "fx:id=\"nombreField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert nyaCol != null : "fx:id=\"nyaCol\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert tablaPersonas != null : "fx:id=\"tablaPersonas\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert telField != null : "fx:id=\"telField\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert termsRB != null : "fx:id=\"termsRB\" was not injected: check your FXML file 'Formulario.fxml'.";
    }
    
    public void setPersona(Persona persona) {
    	this.persona = persona;
    	
    	nombreField.setText(persona.getSNombre());
    	ApellidosField.setText(persona.getSApellidos());
    	dniField.setText(persona.getSDni());
    	correoField.setText(persona.getSCorreo());
    	fechanacField.setText(Utilidades.format(persona.getSfechanac()));
    	cpField.setText(Integer.toString(persona.getIcPostal()));
    	direccionField.setText(persona.getSdireccion());
    	telField.setText(Integer.toString(persona.getItelefono()));
    }
    
    public boolean isOkClicked() {
        return InsertarClicked;
    }
    
    private void InsertarClick() {
        if (isInputValid()) {
            persona.setSNombre(nombreField.getText());
            persona.setSApellidos(ApellidosField.getText());
            persona.setSDni(dniField.getText());
            persona.setSCorreo(correoField.getText());
            persona.setSfechanac(Utilidades.parse(fechanacField.getText()));
            persona.setIcPostal(Integer.parseInt(cpField.getText()));
            persona.setSdireccion(direccionField.getText());
            persona.setItelefono(Integer.parseInt(telField.getText()));

            InsertarClicked = true;
        }
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

    
}
