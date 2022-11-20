package Datos;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TableController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Persona> Table1;

    @FXML
    private TableColumn<Persona, String> colApellidos;

    @FXML
    private TableColumn<Persona, String> colDni;

    @FXML
    private TableColumn<Persona, String> colNombre;

    @FXML
    private TableColumn<Persona, String> colcobertura;

    @FXML
    private TableColumn<Persona, String> colcorreo;

    @FXML
    private TableColumn<Persona, Integer> colcp;

    @FXML
    private TableColumn<Persona, String> coldireccion;

    @FXML
    private TableColumn<Persona, LocalDate> colfechanac;

    @FXML
    private TableColumn<Persona, String> colpoliza;

    @FXML
    private TableColumn<Persona, String> colprima;

    @FXML
    private TableColumn<Persona, Integer> coltlf;
	
	// Listado de personas de la aplicación
	private ObservableList<Persona> personaData = FXCollections.observableArrayList();
	
    @FXML
    void initialize() {
    	
    	colNombre.setCellValueFactory(cellData -> cellData.getValue().sNombreProperty());
    	colApellidos.setCellValueFactory(cellData -> cellData.getValue().sApellidosProperty());
    	colDni.setCellValueFactory(cellData -> cellData.getValue().sDniProperty());
    	colcobertura.setCellValueFactory(cellData -> cellData.getValue().sCoberturaProperty());
    	colcorreo.setCellValueFactory(cellData -> cellData.getValue().sCorreoProperty());
    	colcp.setCellValueFactory(cellData -> cellData.getValue().icPostalProperty().asObject());
    	coldireccion.setCellValueFactory(cellData -> cellData.getValue().sdireccionProperty());
    	colfechanac.setCellValueFactory(cellData -> cellData.getValue().sfechanacProperty());
    	colpoliza.setCellValueFactory(cellData -> cellData.getValue().sPolizaProperty());
    	colprima.setCellValueFactory(cellData -> cellData.getValue().sPrimaProperty());
    	coltlf.setCellValueFactory(cellData -> cellData.getValue().itelefonoProperty().asObject());
    	
        // Se rellena la tabla con objetos de la clase Person
    	//Table1.setItems(data);  
    }
    
    public void insertarPersona(Persona persona) {
    	
    }
    
	public ObservableList<Persona> getPersonData() {
		return personaData;
	}

}