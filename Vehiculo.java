package MiCodigo2;

public class Vehiculo {
	
	private String identificador;
	private String nombre;
	private String medio;
	private double Velocidad;
	private int capacidad;
	private int ruedas;
	private int puertas;
	
	public Vehiculo(String identificador, String medio) {
		super();
		this.identificador = identificador;
		this.medio = medio;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}
	
	
	
	
	
	
}
