package operadores;

public class Multiplicacion {

	public static void main(String[] args) {

		System.out.println(multiplicar(5, 9));
	}
	
	public static double multiplicar(double num1, double num2) {
		int aux = 0;
		double resultado = 0;
		for (double i = 0; i < num2; i++) {
			aux += num1;
			resultado = aux;
		}
		return resultado;
	}

}
