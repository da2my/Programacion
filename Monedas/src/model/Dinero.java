package model;

public class Dinero {

	private static double cantidad;

	public Dinero() {

	}

	public Dinero(double cantidad) {
		Dinero.cantidad = cantidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Dinero [cantidad=" + cantidad + "]";
	}

	public static void moneda() {

		double[] monedas = { 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
		double aux = 0;
		double aux1 = 0;
		double aux2 = 0;
		for (int i = 0; i < monedas.length; i++) {
			double auxX = monedas[i];
			double m = monedas[i];
			if (m > 0) {
				aux = (int) (cantidad / m);// numero de cada billete, en este caso 2
				aux1 = (aux * m);// el valor a restar de los billetes que quitamos, siempre enteros. 100
				aux2 = cantidad - aux1;// el valor actual a seguir descomponiendo 35.72
				cantidad = aux2;

			}
			System.out.println("| " + (int) aux + " --> " + auxX + "€	|");
		}
	}
}