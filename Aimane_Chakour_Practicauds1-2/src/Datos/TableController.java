package Datos;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Persona> Table1;
    
    @FXML
    private TableColumn<Persona, String> colcobertura;

    @FXML
    private TableColumn<Persona, String> colcorreo;

    @FXML
    private TableColumn<Persona, Integer> colcp;

    @FXML
    private TableColumn<Persona, String> coldireccion;

    @FXML
    private TableColumn<Persona, String> colfechanac;

    @FXML
    private TableColumn<Persona, String> colnombre;

    @FXML
    private TableColumn<Persona, String> colpoliza;

    @FXML
    private TableColumn<Persona, String> colprima;

    @FXML
    private TableColumn<Persona, Integer> coltlf;
    
    private ObservableList<Persona> data = FXCollections.observableArrayList(
    	    new Persona("Jacob", "Smith", "jacob.smith@example.com", null, null, null, 30, null, 0),
    	    new Persona("Isabella", "Johnson", "isabella.johnson@example.com", null, null, null, 40, null, 0),
    	    new Persona("Ethan", "Williams", "ethan.williams@example.com", null, null, null, 50, null, 0),
    	    new Persona("Emma", "Jones", "emma.jones@example.com", null, null, null, 61, null, 0),
    	    new Persona("Michael", "Brown", "michael.brown@example.com", null, null, null, 34, null, 0)
    	);
    @FXML
    void initialize() {
        // Asociamos cada columna del TableView a una propiedad de la clase Person 
    	colnombre.setCellValueFactory(new PropertyValueFactory<Persona,String>("sNombreyApellidos"));
    	colpoliza.setCellValueFactory(new PropertyValueFactory<Persona,String>("sPoliza"));
    	colprima.setCellValueFactory(new PropertyValueFactory<Persona,String>("sPrima"));
    	colcobertura.setCellValueFactory(new PropertyValueFactory<Persona,String>("sCobertura"));
    	colcorreo.setCellValueFactory(new PropertyValueFactory<Persona,String>("sCorreo"));
    	colfechanac.setCellValueFactory(new PropertyValueFactory<Persona,String>("sfechanac"));
    	colcp.setCellValueFactory(new PropertyValueFactory<Persona,Integer>("icPostal"));
    	coldireccion.setCellValueFactory(new PropertyValueFactory<Persona,String>("sdireccion"));
    	coltlf.setCellValueFactory(new PropertyValueFactory<Persona,Integer>("itelefono"));
    	
        // Se rellena la tabla con objetos de la clase Person
    	Table1.setItems(data);  
    }

}