package MiCodigo2;

public class efemeride extends fecha{
	
	private String quePaso;
	
	public efemeride(int dia, int mes, int anio,String quePaso) {
		super(dia, mes, anio);
		// TODO Auto-generated constructor stub
		this.setQuePaso(quePaso);
	}

	public String getQuePaso() {
		return quePaso;
	}

	public void setQuePaso(String quePaso) {
		this.quePaso = quePaso;
	}

}
