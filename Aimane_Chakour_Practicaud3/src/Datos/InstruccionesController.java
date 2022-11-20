package Datos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class InstruccionesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button preguntaCinco;

    @FXML
    private Button preguntaCuatro;

    @FXML
    private Button preguntaDos;

    @FXML
    private Button preguntaTres;

    @FXML
    private Button preguntaUno;

    @FXML
    void respuestaCinco(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("¿Cómo puedo eliminar los datos de un cliente?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Para eliminar a un cliente habría que seleccionar al cliente que queremos"
				+ " eliminar y hacer click en el botón Borrar");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaCuatro(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("¿Cómo puedo modificar los datos de un cliente?´");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Para modificar a un cliente deberemos seleccionarlo en la tabla, "
				+ "los campos se rellenarán con sus datos. Una vez modificados esos datos solo "
				+ "faltaría hacer click en el botón Modificar. (Usando esta función también podemos ver los datos del cliente)");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaDos(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("¿Cómo puedo introducir los datos de un nuevo cliente?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Una vez accedes al formulario con el usuario y la contraseña\nfacilitados, "
				+ "deberás rellenar los datos y, a continuación, hacer\nclick en el botón Insertar");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaTres(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("¿Porqué no puedo crear un usuario nuevo?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Este programa está todavía en proceso de realización\ny aún no se ha implementado"
				+ " la función de crear usuarios.");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaUno(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("¿Cuál es el usuario y la contraseña de acceso?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("El usuario es: admin. Y la contraseña es: 12345");
		Infoalerta.showAndWait();
    }

    @FXML
    void initialize() {

    }

}
