package cadenasTexto.ejerciciosB;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String frase;
		char value;
		int contA = 0;
		int contE = 0;
		int contI = 0;
		int contO = 0;
		int contU = 0;
		System.out.println("Introduce frase para contar vocales: ");
		frase = sc.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			value = frase.charAt(i);
			switch (value) {
			case 'a':
				contA++;
				break;
			case 'e':
				contE++;
				break;
			case 'i':
				contI++;
				break;
			case 'o':
				contO++;
				break;
			case 'u':
				contU++;
				break;
			default:
				break;
			}
		}
		System.out.println("Nº de A's: " + contA + "\n" + "Nº de E's: " + contE + "\n" + "Nº de I's: " + contI + "\n"
				+ "Nº de O's: " + contO + "\n" + "Nº de U's: " + contU);
		sc.close();
	}
}
