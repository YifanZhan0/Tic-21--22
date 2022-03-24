package MiCodigo2;

public class ManejaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehiculo miBarquito;
			coche micoche;
			cocheElectrico miCochePilas;
			miBarquito=new Vehiculo("Carrito alejandro","acuatico");
			micoche=new coche ("BMW","volador");
			miCochePilas=new cocheElectrico ("Tesla","terrestre");
			System.out.println("Mi coche es un "+miCochePilas.getIdentificador());

	}
	

}
