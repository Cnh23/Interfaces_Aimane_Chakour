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
    	    new Persona("Pepe Fernandez", "Coche", "Semestrales", "Limitada", "Pepe@ejemplo.ejemplo", "23/05/1987", 28001, "Calle ejemplo 1", 123456789),
    	    new Persona("Jose Luis García", "Hogar", "Trimestrales", "Básica", "Jose@ejemplo.ejemplo", "10/02/1969", 28000, "Calle ejemplo 2", 987654321),
    	    new Persona("Carlos Pérez", "Hogar", "Semestrales", "Amplia", "Carlos@ejemplo.ejemplo", "05/05/1999", 28002, "Calle ejemplo 3", 456789123),
    	    new Persona("Andrea Casado", "Moto", "Semestrales", "Básica", "Andrea@ejemplo.ejemplo", "11/10/1995", 28003, "Calle ejemplo 4", 678912345),
    	    new Persona("Lionel Messi", "Coche", "Anuales", "Amplia Plus", "Leo@ejemplo.ejemplo", "10/10/1985", 28004, "Calle ejemplo 5", 234567890)
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