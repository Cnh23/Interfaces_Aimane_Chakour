package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MenuController {


 // Pantalla principal en la que se añade o quita contenido
 	private BorderPane rootLayout;
   
     @FXML
     private void initialize() {
         
     }
     
     @FXML
     private void abrirFormulario(ActionEvent event) {    	
     	try {
 			// Cargamos el archivo Controles Dinámicos
 			FXMLLoader loader = new FXMLLoader();
 			loader.setLocation(MenuController.class.getResource("/Formulario/Formulario.fxml"));
 			AnchorPane listadoControles = (AnchorPane) loader.load();

 			// Se sitúa en el centro del diseño principal
 			rootLayout.setCenter(listadoControles);
 			
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }
     
     @FXML
     private void abrirInicio(ActionEvent event) {    	
     	try {
 			// Cargamos el archivo Controles Dinámicos
 			FXMLLoader loader = new FXMLLoader();
 			loader.setLocation(MenuController.class.getResource("/Inicio/InicioAnchor.fxml"));
 			AnchorPane listadoControles = (AnchorPane) loader.load();

 			// Se sitúa en el centro del diseño principal
 			rootLayout.setCenter(listadoControles);
 			
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }
     
     @FXML
     private void abrirDatos(ActionEvent event) {    	
     	try {
 			// Cargamos el archivo Controles Dinámicos
 			FXMLLoader loader = new FXMLLoader();
 			loader.setLocation(MenuController.class.getResource("/Datos/Datos.fxml"));
 			AnchorPane listadoControles = (AnchorPane) loader.load();

 			// Se sitúa en el centro del diseño principal
 			rootLayout.setCenter(listadoControles);
 			
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
     }
     
     @FXML
     private void abrirInstrucciones(ActionEvent event) {    	
     	try {
 			// Cargamos el archivo Controles Dinámicos
 			FXMLLoader loader = new FXMLLoader();
 			loader.setLocation(MenuController.class.getResource("/Final/Final.fxml"));
 			AnchorPane listadoControles = (AnchorPane) loader.load();

 			// Se sitúa en el centro del diseño principal
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
