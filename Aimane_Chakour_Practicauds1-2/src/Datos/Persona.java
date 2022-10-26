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

	public final SimpleStringProperty sNombreyApellidosProperty() {
		return this.sNombreyApellidos;
	}
	

	public final String getSNombreyApellidos() {
		return this.sNombreyApellidosProperty().get();
	}
	

	public final void setSNombreyApellidos(final String sNombreyApellidos) {
		this.sNombreyApellidosProperty().set(sNombreyApellidos);
	}
	

	public final SimpleStringProperty sPolizaProperty() {
		return this.sPoliza;
	}
	

	public final String getSPoliza() {
		return this.sPolizaProperty().get();
	}
	

	public final void setSPoliza(final String sPoliza) {
		this.sPolizaProperty().set(sPoliza);
	}
	

	public final SimpleStringProperty sPrimaProperty() {
		return this.sPrima;
	}
	

	public final String getSPrima() {
		return this.sPrimaProperty().get();
	}
	

	public final void setSPrima(final String sPrima) {
		this.sPrimaProperty().set(sPrima);
	}
	

	public final SimpleStringProperty sCoberturaProperty() {
		return this.sCobertura;
	}
	

	public final String getSCobertura() {
		return this.sCoberturaProperty().get();
	}
	

	public final void setSCobertura(final String sCobertura) {
		this.sCoberturaProperty().set(sCobertura);
	}
	

	public final SimpleStringProperty sCorreoProperty() {
		return this.sCorreo;
	}
	

	public final String getSCorreo() {
		return this.sCorreoProperty().get();
	}
	

	public final void setSCorreo(final String sCorreo) {
		this.sCorreoProperty().set(sCorreo);
	}
	

	public final SimpleStringProperty sfechanacProperty() {
		return this.sfechanac;
	}
	

	public final String getSfechanac() {
		return this.sfechanacProperty().get();
	}
	

	public final void setSfechanac(final String sfechanac) {
		this.sfechanacProperty().set(sfechanac);
	}
	

	public final SimpleIntegerProperty icPostalProperty() {
		return this.icPostal;
	}
	

	public final int getIcPostal() {
		return this.icPostalProperty().get();
	}
	

	public final void setIcPostal(final int icPostal) {
		this.icPostalProperty().set(icPostal);
	}
	

	public final SimpleStringProperty sdireccionProperty() {
		return this.sdireccion;
	}
	

	public final String getSdireccion() {
		return this.sdireccionProperty().get();
	}
	

	public final void setSdireccion(final String sdireccion) {
		this.sdireccionProperty().set(sdireccion);
	}
	

	public final SimpleIntegerProperty itelefonoProperty() {
		return this.itelefono;
	}
	

	public final int getItelefono() {
		return this.itelefonoProperty().get();
	}
	

	public final void setItelefono(final int itelefono) {
		this.itelefonoProperty().set(itelefono);
	}
	
}
