package ch.makery.adress.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import ch.makery.adress.model.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class GraficoController {
	private Stage dialogStage;
    @FXML
    private ResourceBundle resources;

    @FXML
    private PieChart PieChart;
    
    @FXML
    private StackedBarChart<String, Integer> stackedBarChart;

    @FXML
    private BarChart<String, Integer> barChart;
    
	private ObservableList<PieChart.Data> chartPrimas;

	private static ObservableList<Persona> listapers = FXCollections.observableArrayList();
	
    @FXML
    void initialize() {
    	listapers.addAll(FormController.getPersonData());
    	setPrimas(listapers);

		barChart.getData().add(initDatosBar(updateBarChart(listapers)));
		stackedBarChart.getData().addAll(initStDatosBar(updateSBarChart(listapers),updateStBarChart1(listapers)
				, updateStBarChart2(listapers)));
    }
    
	private Map<String, Integer> updateBarChart(ObservableList<Persona> pers) {
		Map<String, Integer> countByPoliza = new HashMap<>();
		for (Persona p : pers) {
			String tipo = p.getSPoliza();
			int count = countByPoliza.getOrDefault(tipo, 0);
			countByPoliza.put(tipo, count + 1);
		}
		return countByPoliza;
	}
	
	private Map<String, Integer> updateSBarChart(ObservableList<Persona> pers) {
		Map<String, Integer> countByCobertura = new HashMap<>();
		for (Persona p : pers) {
			String tipo = p.getSCobertura();
			int count = countByCobertura.getOrDefault(tipo, 0);
			countByCobertura.put(tipo, count + 1);
		}
		return countByCobertura;
	}
    
	private XYChart.Series<String, Integer> initDatosBar(Map<String, Integer> countByPoliza) {
		XYChart.Series<String, Integer> series = new XYChart.Series<String, Integer>();
		series.setName("Numero de clientes");
		for (Map.Entry<String, Integer> entry : countByPoliza.entrySet()) {
			series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
		}
		return series;
	}
	
	private Map<String, Integer> updateStBarChart1(ObservableList<Persona> pers) {
		Map<String, Integer> countByDireccion = new HashMap<>();
		for (Persona p : pers) {
			 if(p.getSdireccion().equals("Madrid")) {
			int count = countByDireccion.getOrDefault(p.getSCobertura(), 0);
			countByDireccion.put(p.getSCobertura(), count + 1);
			 }
		}
		return countByDireccion;
	}
	
	private Map<String, Integer> updateStBarChart2(ObservableList<Persona> pers) {
		Map<String, Integer> countByDireccionBcn = new HashMap<>();
		for (Persona p : pers) {
			 if(p.getSdireccion().equals("Barcelona")) {
			int count = countByDireccionBcn.getOrDefault(p.getSCobertura(), 0);
			countByDireccionBcn.put(p.getSCobertura(), count + 1);
			 }
		}
		return countByDireccionBcn;
	}
    
	private ObservableList<XYChart.Series<String, Integer>> initStDatosBar(Map<String, Integer> countByCobertura, Map<String, Integer> countByDireccion, Map<String, Integer> countByDireccionBcn) {
		List<XYChart.Series<String, Integer>> list = new ArrayList<XYChart.Series<String,Integer>>();
		
		XYChart.Series<String, Integer> series = new XYChart.Series<String, Integer>();
		series.setName("Numero de clientes");
		for (Map.Entry<String, Integer> entry : countByCobertura.entrySet()) {
			series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
		}
		
		XYChart.Series<String, Integer> series2 = new XYChart.Series<String, Integer>();
		series2.setName("De Madrid");
		for (Map.Entry<String, Integer> entry : countByDireccion.entrySet()) {
			series2.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
		}
		
		XYChart.Series<String, Integer> series3 = new XYChart.Series<String, Integer>();
		series3.setName("De Barcelona");
		for (Map.Entry<String, Integer> entry : countByDireccionBcn.entrySet()) {
			series3.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
		}
		
		list.add(series);
		list.add(series2);
		list.add(series3);
		
		return FXCollections.observableArrayList(list);
		
	}
	
	public void setPrimas(ObservableList<Persona> persona) {
		chartPrimas = FXCollections.observableArrayList();
		
        for (Persona p : persona) {
            boolean found = false;
            for (PieChart.Data data : chartPrimas) {
                if (data.getName().equals(p.getSPrima())) {
                    data.setPieValue(data.getPieValue() + 1);
                    found = true;
                    break;
                }
            }
            if (!found) {
            	chartPrimas.add(new PieChart.Data(p.getSPrima(), 1));
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

