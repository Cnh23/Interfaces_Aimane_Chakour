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


	public final StringProperty sNombreProperty() {
		return this.sNombre;
	}
	


	public final String getSNombre() {
		return this.sNombreProperty().get();
	}
	


	public final void setSNombre(final String sNombre) {
		this.sNombreProperty().set(sNombre);
	}
	


	public final StringProperty sApellidosProperty() {
		return this.sApellidos;
	}
	


	public final String getSApellidos() {
		return this.sApellidosProperty().get();
	}
	


	public final void setSApellidos(final String sApellidos) {
		this.sApellidosProperty().set(sApellidos);
	}
	


	public final StringProperty sDniProperty() {
		return this.sDni;
	}
	


	public final String getSDni() {
		return this.sDniProperty().get();
	}
	


	public final void setSDni(final String sDni) {
		this.sDniProperty().set(sDni);
	}
	


	public final StringProperty sPolizaProperty() {
		return this.sPoliza;
	}
	


	public final String getSPoliza() {
		return this.sPolizaProperty().get();
	}
	


	public final void setSPoliza(final String sPoliza) {
		this.sPolizaProperty().set(sPoliza);
	}
	


	public final StringProperty sPrimaProperty() {
		return this.sPrima;
	}
	


	public final String getSPrima() {
		return this.sPrimaProperty().get();
	}
	


	public final void setSPrima(final String sPrima) {
		this.sPrimaProperty().set(sPrima);
	}
	


	public final StringProperty sCoberturaProperty() {
		return this.sCobertura;
	}
	


	public final String getSCobertura() {
		return this.sCoberturaProperty().get();
	}
	


	public final void setSCobertura(final String sCobertura) {
		this.sCoberturaProperty().set(sCobertura);
	}
	


	public final StringProperty sCorreoProperty() {
		return this.sCorreo;
	}
	


	public final String getSCorreo() {
		return this.sCorreoProperty().get();
	}
	


	public final void setSCorreo(final String sCorreo) {
		this.sCorreoProperty().set(sCorreo);
	}
	


	public final ObjectProperty<LocalDate> sfechanacProperty() {
		return this.sfechanac;
	}
	


	public final LocalDate getSfechanac() {
		return this.sfechanacProperty().get();
	}
	


	public final void setSfechanac(final LocalDate sfechanac) {
		this.sfechanacProperty().set(sfechanac);
	}
	


	public final IntegerProperty icPostalProperty() {
		return this.icPostal;
	}
	


	public final int getIcPostal() {
		return this.icPostalProperty().get();
	}
	


	public final void setIcPostal(final int icPostal) {
		this.icPostalProperty().set(icPostal);
	}
	


	public final StringProperty sdireccionProperty() {
		return this.sdireccion;
	}
	


	public final String getSdireccion() {
		return this.sdireccionProperty().get();
	}
	


	public final void setSdireccion(final String sdireccion) {
		this.sdireccionProperty().set(sdireccion);
	}
	


	public final IntegerProperty itelefonoProperty() {
		return this.itelefono;
	}
	


	public final int getItelefono() {
		return this.itelefonoProperty().get();
	}
	


	public final void setItelefono(final int itelefono) {
		this.itelefonoProperty().set(itelefono);
	}
	

	
	
}
