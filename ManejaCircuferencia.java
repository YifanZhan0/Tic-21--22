package MiCodigo2;

public class ManejaCircuferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo1;
		Circulo circulo2;
		circulo1=new Circulo(7,9,4.5);
		System.out.println("circulito 1: ");
		System.out.println("Coordenada x del centro: " +circulo1.coordX);
		System.out.println("Coordenada y del centro: " +circulo1.getCoordY());
		System.out.println("coordenada radio del centro: " +circulo1.getRadio());
		System.out.println("La radio es: "+circulo1.devuelveArea());
		System.out.println("la longitud es:" +circulo1.devuelveLongitud());
	}
	
	

}
	