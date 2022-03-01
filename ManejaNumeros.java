package MiCodigo2;

public class ManejaNumeros {

			public static void main(String[] args) {
				//Auto-generated method stub
				int suma;
				MiParejaNumeros objeto1;
				objeto1=new MiParejaNumeros(5,8);//Instancio
				MiParejaNumeros objeto2;
				objeto2=new MiParejaNumeros(1,4);
				suma=objeto1.devuelveSuma();
				objeto1.setNum1(6);
				objeto1.setNum1(4);
				objeto2.setNum1(1);
				objeto2.setNum1(1);
				System.out.println("suma de la pareja1: ");
				System.out.println(suma);
				System.out.println("suma de la pareja2: ");
				System.out.println();
				
			}
			
}
