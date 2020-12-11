package operadores;

public class Division {

	public static void main(String[] args) {

		dividir(21, 5);

	}

//	public static double dividir(double num1, double num2) {
//		int aux = 0;
//		int cont = 0;
//		do {
//			for (double i = 0; i <= num2; i++) {
//				cont = (int) i;
//			}
//			num1 -= cont;
//			aux++;
//		} while (num1 != 0);
//		return aux;
//	}

//	public static double dividir(double num1, double num2) {
//	int aux = 0;
//	int cont = 0;
//	double resultado = 0;
//	do {
//		for (double i = 0; i <= num2; i++) {
//			cont = (int) i;
//		}
//		num1 -= cont;
//		aux++;
//	} while (num1 != 0);
//	return aux;
//}

//	public static void dividir(double numD, double numd) {
//		int aux = 0;
//		int resto;
//		int cont1 = 0;
//		int cont = 0;
//		do {
//			for (int i = 0; i <= numd; i++) {
//				cont = i;
//			}
//			cont1 += cont;
//			aux++;
//		} while (cont1 != numD);
//		resto = (int) (multiplicar(aux, numd) - numD);
//		System.out.println("La division es: " + aux);
//		System.out.println("El resto de la division es:" + resto);
//	}
//
//	public static double multiplicar(double num1, double num2) {
//		int aux = 0;
//		double resultado = 0;
//		for (double i = 0; i < num2; i++) {
//			aux += num1;
//			resultado = aux;
//		}
//		return resultado;
//	}

	public static void dividir(double num1, double num2) {// forma de division de Bea

		int cociente = 0;
		int resto = (int) num2;// el resto lo cargo con el dividendo, este es el matiz
		if (num1 == 0) {
			System.out.println("no se puede");
		} else {
			while (resto >= num2) {
				resto = (int) (resto - num2);
				cociente = cociente + 1;
			}
		}
		System.out.println("dividendo: " + num1 + " divisor: " + num2 + " cociente: " + cociente + " resto: " + resto);
	}
}
