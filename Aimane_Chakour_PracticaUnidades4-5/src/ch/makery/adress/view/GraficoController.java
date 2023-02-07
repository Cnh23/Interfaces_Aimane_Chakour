package ch.makery.adress.view;

import java.util.ResourceBundle;

import ch.makery.adress.model.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class GraficoController {
	private Stage dialogStage;
    @FXML
    private ResourceBundle resources;

    @FXML
    private PieChart PieChart;
    
	private ObservableList<PieChart.Data> chartPolizas;
	private ObservableList<PieChart.Data> chartPrimas;
	private ObservableList<PieChart.Data> chartCoberturas;

	private static ObservableList<Persona> listapers = FXCollections.observableArrayList();
	
    @FXML
    void initialize() {
    	listapers.addAll(FormController.getPersonData());
    	setPolizas(listapers);
    }
    
	public void setPolizas(ObservableList<Persona> persona) {
		chartPrimas = FXCollections.observableArrayList();
		
        for (Persona p : persona) {
            boolean found = false;
            for (PieChart.Data data : chartPrimas) {
                if (data.getName().equals(p.getSPoliza())) {
                    data.setPieValue(data.getPieValue() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
            	chartPrimas.add(new PieChart.Data(p.getSPoliza(), 1));
            }
        }
        PieChart.setData(chartPrimas);
    }
    
	public Stage getDialogStage() {
		return dialogStage;
	}

	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
    

}

