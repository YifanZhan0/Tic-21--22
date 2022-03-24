package MiCodigo2;

public class cocheElectrico extends coche {
	private double potencia;
	public cocheElectrico(String identificador, String medio) {
		super(identificador, medio);
		// TODO Auto-generated constructor stub
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

}
