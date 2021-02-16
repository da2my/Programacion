package funciones;

import java.util.Scanner;

public class Limites {

	static int cont = 0;
	static int igual = 0;
	static int limI;
	static int limS;

	public static void main(String[] args) {

		Limites l = new Limites();
		int muestrIntervalo[];
		muestrIntervalo = l.intervalo();
		pintaIntervalo(muestrIntervalo);
	}

	public static int[] leeLimites() {
		Scanner sc = new Scanner(System.in);
		int[] aux = new int[2];
		System.out.println("Introduce limite inferior: ");
		limI = sc.nextInt();
		System.out.println("Introduce limite superior: ");
		limS = sc.nextInt();

		if (limI > limS) {
			aux = intercamVar(limI, limS);

		} else {
			aux[0] = limI;
			aux[1] = limS;// String.join("", Integer.toString(limI) + Integer.toString(limS));
		}
		return aux;
	}

	public static int[] intercamVar(int limI, int limS) {
		int aux;
		int[] lim = new int[2];
//		String datos = "";
		aux = limS;
		limS = limI;
		limI = aux;
		lim[0] = limI;
		lim[1] = limS;
		return lim;// datos=String.join("", Integer.toString(limI) + Integer.toString(limS));
	}

	public int[] intervalo() {
		Scanner sc = new Scanner(System.in);
		int intro = 0, cont1 = 0;
		int[] intervalo = leeLimites();
		int[] lim = new int[intervalo[1] - intervalo[0]];

		while (intro >= 0) {
			System.out.println("Introduce elementos: ");
			intro = sc.nextInt();

			if (intro >= limI && intro <= limS && cont1 < intervalo[1] - intervalo[0]) {
				if (intro == limI || intro == limS) {
					igual++;
				}
				lim[cont1] = intro;
				cont++;
				cont1++;
			} else {
				System.out.println(fueraIntervalo());
			}
		}

		return lim;
	}

	public String fueraIntervalo() {
		return "Elemento fuera del intervalo!!!";
	}

	public static void pintaIntervalo(int[] lim) {
		for (int i : lim) {
			System.out.println(i);
		}
		System.out.println("Cantidad de elementos en el intervalo: " + cont);
		System.out.println("Cantidad de numeros iguales que los limites del intervalo: " + igual);
	}

}
