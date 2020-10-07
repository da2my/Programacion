package operadores;

public class Division {

	public static void main(String[] args) {

		System.out.println(dividir(20, 4));
		
	}
	
	public static double dividir(double num1, double num2) {
		int aux = 0;
		int cont = 0;
		do {
			for (double i = 0; i <= num2; i++) {
				cont = (int) i;
			}
			num1 -= cont;
			aux++;
		} while (num1 != 0);
		return aux;
	}

}
