package galaxy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Enteros (int, long, short, byte)
 * De punto flotante (float, double)
 * Cadenas: String
 */
public class DataTypes {
	// primitive data types
	// -> Integers
    private int miEntero;
    private long miLong;
	private short miShort;
	private byte miByte;
	// -> float point
	private float miFloat;
	private double miDouble;
	// -> character
	private char miChar;
	// -> booleans
	private boolean esValido;
	// -> Tipos de datos, tipo de objetos - algunas son wrapper classes
	private String miCadena;
	// -> Date
	private LocalDate fechaHoy;
	private LocalDateTime fechaHoyHora;
	
    public DataTypes() {
        this.miEntero = 15;
        this.miLong = 126L;
        this.miShort = 8;
        this.miByte = 121;
        // 
        this.miFloat = 12.5F;
        this.miDouble = 1523.562;
        //
        this.esValido = true;
        //
        this.miChar = 'A';
        this.miCadena = "Ernesto";
        //
        this.fechaHoy = LocalDate.of(2024, 5, 29);
        this.fechaHoyHora = LocalDateTime.of(2024, 5, 29, 19, 21, 35);
    }
    
    public void imprimirDatosMiembro() {
    	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    	
    	System.out.println("miEntero: " + this.miEntero + System.lineSeparator() +
    			"miLong: " + this.miLong + System.lineSeparator() +
    			"miShort: " + this.miShort + System.lineSeparator() +
    			"miByte: " + this.miByte + System.lineSeparator() +
    			"miFloat: " + this.miFloat + System.lineSeparator() +
    			"miDouble: " + this.miDouble + System.lineSeparator() +
    			"esValido: " + this.esValido + System.lineSeparator() +
    			"miChar: " + this.miChar + System.lineSeparator() +
    			"miCadena: " + this.miCadena + System.lineSeparator() +
    			"fechaHoy: " + dateFormat.format(this.fechaHoy) + System.lineSeparator() +
    			"fechaHoyHora: " + dateTimeFormat.format(this.fechaHoyHora) + System.lineSeparator());
    }

	public int getMiEntero() {
		return miEntero;
	}

	public void setMiEntero(int miEntero) {
		this.miEntero = miEntero;
	}

	public long getMiLong() {
		return miLong;
	}

	public void setMiLong(long miLong) {
		this.miLong = miLong;
	}

	public short getMiShort() {
		return miShort;
	}

	public void setMiShort(short miShort) {
		this.miShort = miShort;
	}

	public byte getMiByte() {
		return miByte;
	}

	public void setMiByte(byte miByte) {
		this.miByte = miByte;
	}

	public float getMiFloat() {
		return miFloat;
	}

	public void setMiFloat(float miFloat) {
		this.miFloat = miFloat;
	}

	public double getMiDouble() {
		return miDouble;
	}

	public void setMiDouble(double miDouble) {
		this.miDouble = miDouble;
	}

	public char getMiChar() {
		return miChar;
	}

	public void setMiChar(char miChar) {
		this.miChar = miChar;
	}

	public boolean isEsValido() {
		return esValido;
	}

	public void setEsValido(boolean esValido) {
		this.esValido = esValido;
	}

	public String getMiCadena() {
		return miCadena;
	}

	public void setMiCadena(String miCadena) {
		this.miCadena = miCadena;
	}

	public LocalDate getFechaHoy() {
		return fechaHoy;
	}

	public void setFechaHoy(LocalDate fechaHoy) {
		this.fechaHoy = fechaHoy;
	}

	public LocalDateTime getFechaHoyHora() {
		return fechaHoyHora;
	}

	public void setFechaHoyHora(LocalDateTime fechaHoyHora) {
		this.fechaHoyHora = fechaHoyHora;
	}    
}
