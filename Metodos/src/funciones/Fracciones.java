package funciones;

import java.util.Scanner;

public class Fracciones {

	static int n;
	static int d;

	public static void main(String[] args) {

//		leerFraccion();
//		simplFraccion();

//		String frac1, frac2;
//		frac1 = escribeFraccion();
//		frac2 = escribeFraccion();
//		System.out.println(sumaFracciones(frac1, frac2));
//		System.out.println(divFracciones(frac1, frac2));
//		escribeFraccion();
		menu();
	}

	public static String sumaFracciones(String funFracc1, String funFracc2) {
		// Primera fraccion
		String[] f1 = funFracc1.split(" ");
		String a1 = f1[0];
		String b1 = f1[1];
		int n1 = Integer.parseInt(a1);
		int d1 = Integer.parseInt(b1);
		// Segunda fraccion
		String[] f2 = funFracc2.split(" ");
		String a2 = f2[0];
		String b2 = f2[1];
		int n2 = Integer.parseInt(a2);
		int d2 = Integer.parseInt(b2);

		int sumaD, sumaN;

		sumaN = (d1 == d2) ? n1 + n2 : n1 * d2 + d1 * n2;
		sumaD = (d1 == d2) ? d1 : d1 * d2;

		return "La suma total es: " + "\n" + Integer.toString(sumaN) + "\n" + Integer.toString(sumaD);
	}

	public static String restaFracciones(String funFracc1, String funFracc2) {
		// Primera fraccion
		String[] f1 = funFracc1.split(" ");
		String a1 = f1[0];
		String b1 = f1[1];
		int n1 = Integer.parseInt(a1);
		int d1 = Integer.parseInt(b1);
		// Segunda fraccion
		String[] f2 = funFracc2.split(" ");
		String a2 = f2[0];
		String b2 = f2[1];
		int n2 = Integer.parseInt(a2);
		int d2 = Integer.parseInt(b2);

		int restaD, restaN;

		restaN = (d1 == d2) ? n1 - n2 : n1 * d2 - d1 * n2;
		restaD = (d1 == d2) ? d1 : d1 * d2;

		return "La resta total es: " + "\n" + Integer.toString(restaN) + "\n" + Integer.toString(restaD);
	}

	public static String multiFracciones(String funFracc1, String funFracc2) {
		// Primera fraccion
		String[] f1 = funFracc1.split(" ");
		String a1 = f1[0];
		String b1 = f1[1];
		int n1 = Integer.parseInt(a1);
		int d1 = Integer.parseInt(b1);
		// Segunda fraccion
		String[] f2 = funFracc2.split(" ");
		String a2 = f2[0];
		String b2 = f2[1];
		int n2 = Integer.parseInt(a2);
		int d2 = Integer.parseInt(b2);

		int multD, multN;

		multN = n1 * n2;
		multD = d1 * d2;

		return "La multiplicacion total es: " + "\n" + Integer.toString(multN) + "\n" + Integer.toString(multD);
	}

	public static String divFracciones(String funFracc1, String funFracc2) {
		// Primera fraccion
		String[] f1 = funFracc1.split(" ");
		String a1 = f1[0];
		String b1 = f1[1];
		int n1 = Integer.parseInt(a1);
		int d1 = Integer.parseInt(b1);
		// Segunda fraccion
		String[] f2 = funFracc2.split(" ");
		String a2 = f2[0];
		String b2 = f2[1];
		int n2 = Integer.parseInt(a2);
		int d2 = Integer.parseInt(b2);

		int divD, divN;

		divN = n1 * d2;
		divD = d1 * n2;

		return "La division total es: " + "\n" + Integer.toString(divN) + "\n" + Integer.toString(divD);
	}

	public static String leerFraccion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el numerador de la fraccion: ");
		n = sc.nextInt();
		System.out.println("Escriba el denominador de la fraccion: ");
		d = sc.nextInt();
		return simplFraccion();
	}

	public static String escribeFraccion() {
		return leerFraccion();
	}

	public static int calc_mcd(int divN, int divD) {
		int aux;
		int mcd = 0;
		int resto = 0;
		resto = divN % divD;
		divN = divD;
		while (resto != 0) {
			aux = resto;
			mcd = resto;
			resto = divN % resto;
			divN = aux;
		}
		return mcd;
	}

	public static String simplFraccion() {
		int nI, dI;
		int mcdNi, mcdNd;
		mcdNi = calc_mcd(n, d);
		mcdNd = calc_mcd(n, d);
		nI = n / mcdNi;
		dI = d / mcdNd;
		return nI + " " + dI;
	}

	public static void menu() {
		int opcion;
		String frac1, frac2;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("¿Qué operación de fracciones quieres? ");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Salir");
			System.out.print("Introduce opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1: // Sumar
				frac1 = escribeFraccion();
				frac2 = escribeFraccion();
				System.out.println(sumaFracciones(frac1, frac2));
				break;

			case 2: // Restar
				frac1 = escribeFraccion();
				frac2 = escribeFraccion();
				System.out.println(restaFracciones(frac1, frac2));
				break;

			case 3: // Multiplicar
				frac1 = escribeFraccion();
				frac2 = escribeFraccion();
				System.out.println(multiFracciones(frac1, frac2));
				break;

			case 4: // Dividir
				frac1 = escribeFraccion();
				frac2 = escribeFraccion();
				System.out.println(divFracciones(frac1, frac2));
				break;

			case 5: // Salir
				System.out.println("Adios!");
				break;
			default: // En otro caso
				System.out.println("Error: opción incorrecta.");
			}

		} while (opcion != 5);
	}

}
