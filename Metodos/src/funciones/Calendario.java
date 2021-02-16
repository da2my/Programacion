package funciones;

import java.util.Scanner;

public class Calendario {

	public static void main(String[] args) {
		verCalendario();
	}

	public static void verCalendario() {
		Scanner sc = new Scanner(System.in);
		int a, m, n, d;
		System.out.println("Introduce año: ");
		a = sc.nextInt();
		System.out.println("Introduce mes: ");
		m = sc.nextInt();
		char c[] = { 'L', 'M', 'X', 'J', 'V', 'S', 'D' };
		int cal[][] = new int[6][7];
		for (char i : c) {
			System.out.print(i + "|");
		}
		int filas = cal.length;
		int columnas = cal[0].length;
		int cont = 1;
		for (int i = 0; i < filas; i++) {
			System.out.println();
			for (int j = 0; j < columnas; j++) {
				n = (m <= 2) ? a + 31 * (m - 1) + 1 * (a - 1) / 4 - 3 * ((a + 99) / 100) / 4
						: (a + 31 * (m - 1) + 1 - (4 * m + 23) / 10 + a / 4 - (3 * (a / 100 + 1)) / 4) - 1;
				d = (n % 7) - 1;
				if (i >= 0 && ((d == -1) ? 6 : d) <= j) {
					cal[i][j] = cont;
					cont++;
				} else if (i > 0 && j < 7) {
					cal[i][j] = cont;
					cont++;
				}
				if (m == 1 || m == 3 || m == 7 || m == 8 || m==10 || m==12) {
					if (cont <= 32) {
						System.out.print(cal[i][j] + "|");
					}
				} else if (m == 2) {
					if (cont <= 30) {
						System.out.print(cal[i][j] + "|");
					}
				} else {
					if (cont<=31) {
						System.out.print(cal[i][j] + "|");						
					}
				}
			}
		}
		sc.close();
	}
}
