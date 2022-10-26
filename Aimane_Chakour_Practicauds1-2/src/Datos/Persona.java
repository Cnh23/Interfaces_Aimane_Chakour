package Datos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Persona {
    private final SimpleStringProperty sNombreyApellidos;
    private final SimpleStringProperty sPoliza;
    private final SimpleStringProperty sPrima;
    private final SimpleStringProperty sCobertura;
    private final SimpleStringProperty sCorreo;
    private final SimpleStringProperty sfechanac;
    private final SimpleIntegerProperty icPostal;
    private final SimpleStringProperty sdireccion;
    private final SimpleIntegerProperty itelefono;
    
    public Persona(String NombreyApellidos, String Poliza, String Prima, String Cobertura, String Correo, String fechanac, int cPostal, String direccion, int telefono) {
        
    	this.sNombreyApellidos = new SimpleStringProperty(NombreyApellidos);
        this.sPoliza = new SimpleStringProperty(Poliza);
        this.sPrima = new SimpleStringProperty(Prima);
        this.sCobertura = new SimpleStringProperty(Cobertura);
        this.sCorreo = new SimpleStringProperty(Correo);
        this.sfechanac = new SimpleStringProperty(fechanac);
        this.icPostal = new SimpleIntegerProperty(cPostal);
        this.sdireccion = new SimpleStringProperty(direccion);
        this.itelefono = new SimpleIntegerProperty(telefono);
    }
 
    
    
    
    public String getsNombreyApellidos() {
		return sNombreyApellidos.get();
	}

    public void setsNombreyApellidos(String NombreyApellidos) {
		sNombreyApellidos.set(NombreyApellidos);
	}


	public String getPoliza() {
		return sPoliza.get();
	}

    public void setsPoliza(String Poliza) {
    	sPoliza.set(Poliza);
	}


	public String getPrima() {
		return sPrima.get();
	}

    public void setsPrima(String Prima) {
    	sPrima.set(Prima);
	}


	public String getCobertura() {
		return sCobertura.get();
	}

    public void setsCobertura(String Cobertura) {
    	sCobertura.set(Cobertura);
	}


	public String getCorreo() {
		return sCorreo.get();
	}

    public void setsCorreo(String correo) {
    	sCorreo.set(correo);
	}


	public String getFechanac() {
		return sfechanac.get();
	}


    public void setsfechanac(String fechanac) {
    	sfechanac.set(fechanac);
	}

	public int getcPostal() {
		return icPostal.get();
	}

    public void seticPostal(int cPostal) {
    	icPostal.set(cPostal);
	}


	public String getDireccion() {
		return sdireccion.get();
	}

    public void setsdireccion(String direccion) {
    	sdireccion.set(direccion);
	}


	public int getTelefono() {
		return itelefono.get();
	}

    public void setitelefono(int telefono) {
    	itelefono.set(telefono);
	}

}
