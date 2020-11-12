package model;

public class Dinero {

	private double cantidad;

	public Dinero() {

	}

	public Dinero(double cantidad) {
		this.cantidad = cantidad;
	}
	

	public double getCantidad() {
		return cantidad;
	}

	
	
	@Override
	public String toString() {
		return "Dinero [cantidad=" + cantidad + "]";
	}

	public void moneda() {
		double[] monedas = { 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
		double aux = 0;
		double aux1 = 0;
		double aux2 = 0;
		System.out.print("Caja:	 ");
		for (int j = 0; j < monedas.length; j++) {
			System.out.print(monedas[j] + "€ || ");
		}
		System.out.println();
		System.out.print("Cantidad:  ");
		for (double m : monedas) {
			if (m > 0) {
				aux = (int) (cantidad / m);//numero de cada billete, en este caso 2
				aux1 = (aux * m);// el valor a restar de los billetes que quitamos, siempre enteros. 100
				aux2 = cantidad - aux1;// el valor actual a seguir descomponiendo 35.72
				cantidad = aux2;
			}
			System.out.print((int) aux + "	 |    ");
		}
	}
}
