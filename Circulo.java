package MiCodigo2;

public class Circulo {
	
	
	private MiParejaNumeros centroCirculo;
	double radio;
	//constructor
		public Circulo(int coordX, int coordY, double radio) {
			super();
			centroCirculo=new MiParejaNumeros(coordX,coordY);
			this.radio = radio;0
		}
		public int getCoordX() {
			return centroCirculo.getNum1();
		}
		public void setCoordX(int coordX) {
			centroCirculo.setNum1(coordX);
		}
		public int getCoordY() {
			return centroCirculo.getNum2();
		}
		public void setCoordY(int coordY) {
			centroCirculo.setNum2(coordY);
		}
		public double getRadio() {
			return radio;
		}
		public void setRadio(double radio) {
			this.radio = radio;
		}
		public double devuelveArea(){
			double area;
			area=Math.PI*Math.pow(radio, 2);
			
			
			return area;
		}
		public double devuelveLongitud() {
			double longitud;
			longitud=2*Math.PI*radio;
			return longitud;
			
		}
		
}

