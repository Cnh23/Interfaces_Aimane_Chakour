package Datos;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Persona {
    private final StringProperty sNombre;
    private final StringProperty sApellidos;
    private final StringProperty sDni;
    private final StringProperty sPoliza;
    private final StringProperty sPrima;
    private final StringProperty sCobertura;
    private final StringProperty sCorreo;
    private final ObjectProperty<LocalDate> sfechanac;
    private final IntegerProperty icPostal;
    private final StringProperty sdireccion;
    private final IntegerProperty itelefono;

	public Persona(String Nombre, String Apellidos, String Dni, String Poliza, String Prima, String Cobertura, String Correo, LocalDate fechanac, int cPostal, String direccion, int telefono) {
        
    	this.sNombre = new SimpleStringProperty(Nombre);
    	this.sApellidos = new SimpleStringProperty(Apellidos);
    	this.sDni = new SimpleStringProperty(Dni);
        this.sPoliza = new SimpleStringProperty(Poliza);
        this.sPrima = new SimpleStringProperty(Prima);
        this.sCobertura = new SimpleStringProperty(Cobertura);
        this.sCorreo = new SimpleStringProperty(Correo);
        this.sfechanac = new SimpleObjectProperty<LocalDate>(fechanac);
        this.icPostal = new SimpleIntegerProperty(cPostal);
        this.sdireccion = new SimpleStringProperty(direccion);
        this.itelefono = new SimpleIntegerProperty(telefono);
    }






	public StringProperty sNombreProperty() {
		return this.sNombre;
	}
	



	public String getSNombre() {
		return this.sNombre.get();
	}
	



	public void setSNombre(String sNombre) {
		this.sNombre.set(sNombre);
	}
	



	public StringProperty sApellidosProperty() {
		return this.sApellidos;
	}
	



	public String getSApellidos() {
		return this.sApellidos.get();
	}
	



	public void setSApellidos(String sApellidos) {
		this.sApellidos.set(sApellidos);
	}
	



	public StringProperty sDniProperty() {
		return this.sDni;
	}
	



	public String getSDni() {
		return this.sDni.get();
	}
	



	public void setSDni(String sDni) {
		this.sDni.set(sDni);
	}
	



	public StringProperty sPolizaProperty() {
		return this.sPoliza;
	}
	



	public String getSPoliza() {
		return this.sPoliza.get();
	}
	



	public void setSPoliza(String sPoliza) {
		this.sPoliza.set(sPoliza);
	}
	



	public StringProperty sPrimaProperty() {
		return this.sPrima;
	}
	



	public String getSPrima() {
		return this.sPrima.get();
	}
	



	public void setSPrima(String sPrima) {
		this.sPrima.set(sPrima);
	}
	



	public StringProperty sCoberturaProperty() {
		return this.sCobertura;
	}
	



	public String getSCobertura() {
		return this.sCobertura.get();
	}
	



	public void setSCobertura(String sCobertura) {
		this.sCobertura.set(sCobertura);
	}
	



	public StringProperty sCorreoProperty() {
		return this.sCorreo;
	}
	



	public String getSCorreo() {
		return this.sCorreo.get();
	}
	



	public void setSCorreo(String sCorreo) {
		this.sCorreo.set(sCorreo);
	}
	



	public ObjectProperty<LocalDate> sfechanacProperty() {
		return this.sfechanac;
	}
	



	public LocalDate getSfechanac() {
		return this.sfechanac.get();
	}
	



	public void setSfechanac(LocalDate sfechanac) {
		this.sfechanac.set(sfechanac);
	}
	



	public IntegerProperty icPostalProperty() {
		return this.icPostal;
	}
	



	public int getIcPostal() {
		return this.icPostal.get();
	}
	



	public void setIcPostal(int icPostal) {
		this.icPostal.set(icPostal);
	}
	



	public StringProperty sdireccionProperty() {
		return this.sdireccion;
	}
	



	public String getSdireccion() {
		return this.sdireccion.get();
	}
	



	public void setSdireccion(String sdireccion) {
		this.sdireccion.set(sdireccion);
	}
	



	public IntegerProperty itelefonoProperty() {
		return this.itelefono;
	}
	



	public int getItelefono() {
		return this.itelefono.get();
	}
	



	public void setItelefono(int itelefono) {
		this.itelefono.set(itelefono);
	}
	

	
	
}
