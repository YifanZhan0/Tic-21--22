package MiCodigo2;

public class ManejaFecha {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		fecha fecha1;
		fecha fecha2;
		fecha1=new fecha(6,7,2004);
		fecha2=new fecha(7,7,2004);
		fecha quePaso1;
		quePaso1=new fecha(7,7,2004);
		if(fecha1.esPosterior(fecha2)==true) {
			System.out.println("La fecha1 es posterior a la fecha2");
		}
		else {
			System.out.println("La fecha1 es anterior a la fecha2");
		}
		fecha1.setMes(2);
		System.out.println("El nuevo mes es: "+fecha1.getMes());
		fecha1.setMes("Enero");
		System.out.println("El nuevo mes es: "+fecha1.getMes());
	}
	
	
}
	
