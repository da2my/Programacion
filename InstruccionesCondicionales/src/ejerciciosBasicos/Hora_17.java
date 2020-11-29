package ejerciciosBasicos;

import java.util.Scanner;

public class Hora_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora = 3600;
		int minuto = 60;
		int segundo = 1;

		System.out.println("Introducir horas: ");
		int h = hora * sc.nextInt();
		System.out.println("Introducir minutos: ");
		int m = minuto * sc.nextInt();
		System.out.println("Introducir segundos: ");
		int s = segundo * sc.nextInt();

		if (m == 3540) {
			h = h + hora;
			m = 0;
		}
		if (s == 59) {
			m = m + minuto;
			s = 0;
		}
		m = m / minuto;
		h = h / hora;

		System.out.println("La hora pasada después de un segundo es: ");
		System.out.print("[" + h + ":");
		System.out.print(m + ":");
		System.out.print(s + "]h");

	}
}
