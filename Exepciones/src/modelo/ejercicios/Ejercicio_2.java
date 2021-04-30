package modelo.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean bucle = true;
		int resultado = 0;
		
		do {
			try {
				System.out.println("___________________");
				System.out.println("Introduce dividendo: ");
				a=sc.nextInt();
				System.out.println("Introduce divisor: ");
				b=sc.nextInt();
				resultado=cosciente(a, b);
				bucle = false;
			} catch (InputMismatchException e) {
				System.err.println("Dato erroneo!!\n");
				System.out.println("-Intenda de nuevo- \n");
				sc.nextLine();
				
			}catch (ArithmeticException e) {
				System.err.println("Error de division entre 0!!\n");
				System.out.println("-Intenda de nuevo- \n");
				sc.nextLine();
			}
		} while (bucle);
		System.out.println(resultado);
	}
	
	public static int cosciente(int a, int b) throws InputMismatchException, ArithmeticException {
		return a/b;	
	}

}
