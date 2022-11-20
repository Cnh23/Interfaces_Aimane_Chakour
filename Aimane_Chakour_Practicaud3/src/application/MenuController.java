package application;

import java.io.IOException;

import Inicio.DialogoIniController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController {


 // Pantalla principal en la que se a�ade o quita contenido
 	private BorderPane rootLayout;
   
 	private Stage primaryStage;
     @FXML
     private void initialize() {
     }
     

     @FXML
     void AbrirInstrucciones(ActionEvent event) {
  	    try {
	        // Cargamos el dise�o del di�logo desde un XML
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("/Datos/Instrucciones.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();

	        // Se crea un nuevo Stage para mostrar el di�logo
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("INSTRUCCIONES DEL PROGRAMA");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);
	        
	        // Muestra el di�logo y no contin�a el c�digo hasta que lo cierra el usuario
	        dialogStage.showAndWait();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
     }

     @FXML
     void dialogoInicio(ActionEvent event) {
 	    try {
	        // Cargamos el dise�o del di�logo desde un XML
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("/Inicio/DialogoInicio.fxml"));
	        AnchorPane page = (AnchorPane) loader.load();

	        // Se crea un nuevo Stage para mostrar el di�logo
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("Iniciar sesi�n o registrarse");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);
	        
	        // Carga la persona en el controlador
	        DialogoIniController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        controller.setMenuController(this);
	        // Muestra el di�logo y no contin�a el c�digo hasta que lo cierra el usuario
	        dialogStage.showAndWait();

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
     }
     
     @FXML
	public void abrirFormulario() {    	
     	try {
 			// Cargamos el archivo Controles Din�micos
 			FXMLLoader loader = new FXMLLoader();
 			loader.setLocation(MenuController.class.getResource("/Formulario/Formulario.fxml"));
 			AnchorPane listadoControles = (AnchorPane) loader.load();

 			// Se sit�a en el centro del dise�o principal
 			rootLayout.setCenter(listadoControles);
 			rootLayout.setBottom(null);
 			
 			
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }
     
     @FXML
     private void abrirInicio(ActionEvent event) {    	
     	try {
 			// Cargamos el archivo Controles Din�micos
 			FXMLLoader loader = new FXMLLoader();
 			loader.setLocation(MenuController.class.getResource("/Inicio/Inicio.fxml"));
 			AnchorPane listadoControles = (AnchorPane) loader.load();

 			// Se sit�a en el centro del dise�o principal
 			rootLayout.setCenter(listadoControles);
 			
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }
     
     
     
     @FXML
     private void cerrarListado(ActionEvent event) {    	
     	// Se elimina el contenido del nodo central
     	rootLayout.setCenter(null);	
     }
     

 	public BorderPane getRootLayout() {
 		return rootLayout;
 	}

 	public void setRootLayout(BorderPane rootLayout) {
 		this.rootLayout = rootLayout;
 	}	
     

}
