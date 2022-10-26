package Formulario;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class FormController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> Cobertura;

    @FXML
    private ChoiceBox<String> Poliza;

    @FXML
    private ChoiceBox<String> Prima;

    @FXML
    void initialize() {
        assert Cobertura != null : "fx:id=\"Cobertura\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert Poliza != null : "fx:id=\"Poliza\" was not injected: check your FXML file 'Formulario.fxml'.";
        assert Prima != null : "fx:id=\"Prima\" was not injected: check your FXML file 'Formulario.fxml'.";

        Cobertura.getItems().addAll("Básica","Limitada","Amplia","Amplia Plus");
        Cobertura.setValue("Básica");
        
        Poliza.getItems().addAll("Coche","Moto","Hogar","Vida", "Salud", "Responsabilidad civil");
        Poliza.setValue("Seleccionar");
        
        Prima.getItems().addAll("Trimestrales","Semestrales","Anuales");
        Prima.setValue("Trimestrales");
    }
}
