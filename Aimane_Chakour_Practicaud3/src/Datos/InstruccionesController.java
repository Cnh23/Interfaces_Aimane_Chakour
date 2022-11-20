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
    	
		Infoalerta.setTitle("�C�mo puedo eliminar los datos de un cliente?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Para eliminar a un cliente habr�a que seleccionar al cliente que queremos"
				+ " eliminar y hacer click en el bot�n Borrar");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaCuatro(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("�C�mo puedo modificar los datos de un cliente?�");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Para modificar a un cliente deberemos seleccionarlo en la tabla, "
				+ "los campos se rellenar�n con sus datos. Una vez modificados esos datos solo "
				+ "faltar�a hacer click en el bot�n Modificar. (Usando esta funci�n tambi�n podemos ver los datos del cliente)");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaDos(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("�C�mo puedo introducir los datos de un nuevo cliente?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Una vez accedes al formulario con el usuario y la contrase�a\nfacilitados, "
				+ "deber�s rellenar los datos y, a continuaci�n, hacer\nclick en el bot�n Insertar");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaTres(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("�Porqu� no puedo crear un usuario nuevo?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("Este programa est� todav�a en proceso de realizaci�n\ny a�n no se ha implementado"
				+ " la funci�n de crear usuarios.");
		Infoalerta.showAndWait();
    }

    @FXML
    void respuestaUno(MouseEvent event) {
    	// Se muestra un alert si no se puede eliminar la fila
		Alert Infoalerta = new Alert(AlertType.INFORMATION);
    	
		Infoalerta.setTitle("�Cu�l es el usuario y la contrase�a de acceso?");
		Infoalerta.setHeaderText("RESPUESTA:");
		Infoalerta.setContentText("El usuario es: admin. Y la contrase�a es: 12345");
		Infoalerta.showAndWait();
    }

    @FXML
    void initialize() {

    }

}
