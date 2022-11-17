package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Utilidades {

	
	/** Patrón empleado para convertir fechas */
	private static final String DATE_PATTERN = "dd/MM/yyyy";
	
	/** Objeto para formatear fechas */
	private static final DateTimeFormatter DATE_FORMATTER = 
			DateTimeFormatter.ofPattern(DATE_PATTERN);
	
	/**
     * Devuelve la fecha que llega como parámetro como un string formateado
     * 
     * @param date es el objeto con la fecha
     * @return String formateado
     */
    public static String format(LocalDate date) {
        if (date == null) {
            return null;
        }
        return DATE_FORMATTER.format(date);
    }
    
    public static LocalDate parse(String dateString) {
        try {
        	return DATE_FORMATTER.parse(dateString, LocalDate::from);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
    
    public static boolean validDate(String dateString) {
    	// Try to parse the String.
    	return Utilidades.parse(dateString) != null;
    }
}
