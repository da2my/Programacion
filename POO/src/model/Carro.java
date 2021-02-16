package model;

public class Carro {

	// Atributos
		private int cilindrada;
		private int numPuerta;
		private String color;
		private float precio;

		// Constructores
		public Carro() {
			cilindrada = 3000;
			numPuerta=4;
			color="Blanco";
			precio=32000;
		}
		
		public Carro(int cilindrada, int numPuerta, String color, float precio) {
			this.cilindrada=cilindrada;
			this.numPuerta=numPuerta;
			this.color=color;
			this.precio=precio;
			
		}
		
//		Getters & Setters
		public int getCilindrada() {
			return cilindrada;
		}

		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}

		public int getNumPuerta() {
			return numPuerta;
		}

		public void setNumPuerta(int numPuerta) {
			this.numPuerta = numPuerta;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}
			
//		Metodos
		public String girar() {
			return "Gira el volante";
		}
		
		public String acelera() {
			return "pisa el pedal del acelerador";
		}

		@Override
		public String toString() {
			return "Carro [cilindrada=" + cilindrada + ", numPuerta=" + numPuerta + ", color=" + color + ", precio="
					+ precio + "]";
		}
		
		
}
