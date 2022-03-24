package MiCodigo2;


public class fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	public fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}
	public String getMes(int modo) {
		String nombreMes="";
		if (modo==0) {
			if(this.mes==1) nombreMes="enero";
			if(this.mes==2) nombreMes="Febrero";
			if(this.mes==3) nombreMes="Marzo";
	}
		if(modo==1) {
			if(this.mes==1) nombreMes="ENERO";
			if(this.mes==2) nombreMes="FEBRERO";
			if(this.mes==3) nombreMes="MARZO";
		}
		return nombreMes ;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setMes(String nombreMes) {
		if(nombreMes=="enero") this.mes=1;
		if(nombreMes=="febrero") this.mes=2;
		if(nombreMes=="Marzo") this.mes=3;
		if(nombreMes=="Abril") this.mes=4;
		if(nombreMes=="Mayo") this.mes=5;
		if(nombreMes=="Junio") this.mes=6;
		if(nombreMes=="Julio") this.mes=7;
		if(nombreMes=="Agosto") this.mes=8;
		if(nombreMes=="Septiembre") this.mes=9;
		if(nombreMes=="Octubre") this.mes=10;
		if(nombreMes=="Noviembre") this.mes=11;
		if(nombreMes=="Diciembre") this.mes=12;
		
	}
	
	
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	boolean esPosterior (fecha nuevaFecha){
		boolean LoEs;	
		LoEs=false;
		
		if(this.getAnio()>nuevaFecha.getAnio())
				LoEs=true;
		else
			if(this.getAnio()==nuevaFecha.getAnio())
				if(this.getMes()>nuevaFecha.getMes()) 
					LoEs=true;
				else 
					if(this.getMes()==nuevaFecha.getMes()) 
						if(this.getDia()>nuevaFecha.getDia())
						LoEs=true;
					
			
		return LoEs;
	}	

}



