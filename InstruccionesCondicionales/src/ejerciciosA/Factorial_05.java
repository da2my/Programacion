package ejerciciosA;

import java.util.*;

public class Factorial_05 {

	public static void main(String[] args) {
		factorial();
	}

	public static void factorial() {
		Scanner sc = new Scanner(System.in);
		int num;
		int aux;
		System.out.println("Numero Factorial: ");
		num = sc.nextInt();
		int n = 1;
		for (int j = 1; j <= num; j++) {
			aux = n * j;
			n = aux;
			System.out.println(j + "! = " + n);
		}
	}
}
