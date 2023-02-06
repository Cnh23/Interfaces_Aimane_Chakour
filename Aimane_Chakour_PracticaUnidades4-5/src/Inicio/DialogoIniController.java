package Inicio;

import java.net.URL;
import java.util.ResourceBundle;

import application.MenuController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class DialogoIniController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField contraField;

    @FXML
    private TextField usuarioField;

    // Este componente ser� un di�logo. Campos auxiliares para su gesti�n
    private Stage dialogStage;
    
    private MenuController menuc;
    
    @FXML
    void initialize() {
        assert contraField != null : "fx:id=\"contraField\" was not injected: check your FXML file 'DialogoInicio.fxml'.";
        assert usuarioField != null : "fx:id=\"usuarioField\" was not injected: check your FXML file 'DialogoInicio.fxml'.";


    }
    
    public void setMenuController(MenuController menuc) {
    	this.menuc = menuc;
    }
    
    @FXML
    void AccesoForm(ActionEvent event) {
    	
    	if(usuarioField.getText().equals("admin") && contraField.getText().equals("12345")) {
    	this.menuc.abrirFormulario();
    	this.dialogStage.close();
    	}
    	else {
        	// Se muestra un alert si no se puede eliminar la fila
    		Alert errorAlert = new Alert(AlertType.ERROR);
        	
    		errorAlert.setTitle("ERROR DE ACCESO");
    		errorAlert.setHeaderText("Usuario o contrase�a incorrectos");
    		errorAlert.setContentText("Por favor, introduzca correctamente los datos");
    		
    		errorAlert.showAndWait();
    	}
    }

    @FXML
    void AccesoRegistro(ActionEvent event) {

    }
    /**
     * M�todo set de la propiedad dialogStage
     * 
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }



}

