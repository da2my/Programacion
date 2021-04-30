package modelo.ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		boolean bucle = true;
		System.out.println("Hay 2 impresoras\n");
		do {
			System.out.println("Elige impresora:\n" + "1. Imprime solo numeros negativos\n"
					+ "2. Imprime solo numeros positivos\n" + "3. Salir");
			y=sc.nextInt();

			try {
			if (y == 1) {
				System.out.println("Introduce numero a imprimir: ");
				x=sc.nextInt();
				imprimirNegativo(x);
			}
			if (y == 2) {
				System.out.println("Introduce numero a imprimir: ");
				x=sc.nextInt();
				imprimirPositivo(x);
			}
			if(y==3){
				bucle=false;
			}
			}catch (ExcepcionNumPositivo e) {
				System.err.println("Numero Positivo,Error");
				sc.nextLine();
			}catch (ExcepcionNumNegativo e1) {
				System.err.println("Numero Negativo,Error");
			}
		} while (bucle);

	}

	public static void imprimirPositivo(int p) throws ExcepcionNumNegativo {
		if (p < 0) {
			throw new ExcepcionNumNegativo();
		}
	}

	public static void imprimirNegativo(int n) throws ExcepcionNumPositivo {
		if (n >= 0) {
			throw new ExcepcionNumPositivo();
		}
	}
}