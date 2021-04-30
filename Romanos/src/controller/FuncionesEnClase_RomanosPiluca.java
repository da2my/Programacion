package controller;

import java.util.Scanner;

public class FuncionesEnClase_RomanosPiluca {

	public static void main(String[] args) {

		FuncionesEnClase_RomanosPiluca.menu();
		
		char[] simboloC = { 'C', 'D', 'M' };
		char[] simboloD = { 'X', 'L', 'C' };
		char[] simboloU = { 'I', 'V', 'X' };

		FuncionesEnClase_RomanosPiluca.convertirMain(5, simboloU);
		

	}

	public static int[] division(int dividendo, int divisor) {

		int[] resultado = new int[2];

		resultado[0] = dividendo / divisor; // cociente
		resultado[1] = dividendo % divisor; // resto

		return resultado;
	}

	// cuando una letra se repite 3 veces
	public static String convertir(int num, char letra) { // cociente de millares
		String simbolo = "";

		if (num != 0) {
			for (int i = 1; i <= num; i++) {
				simbolo = simbolo + letra;// concatena
			}
		}
		return simbolo;
	}

	public static String convertirMain(int num, char simbolo[]) {

		String letraR = " ";
		int opcion = num;

		if (num >= 1 && num <= 3) {
			opcion = 1;
		}

		if (num >= 6 && num <= 8) {
			opcion = 6;
		}

		switch (opcion) {
		case 1:

			letraR = convertir(num, simbolo[0]);

			break;
		case 4:
			letraR = String.join("", String.valueOf(simbolo[0]), String.valueOf(simbolo[1]));

			break;
		case 5:
			letraR = String.valueOf(simbolo[1]);
			break;
		case 6:
			char c = 'V';
			System.out.print(c);
			letraR = convertir(num - 5, (simbolo[0]));

			break;
		case 9:
			letraR = String.valueOf(simbolo[0]) + String.valueOf(simbolo[2]);
			break;
		default:

			break;
		}
		return letraR;
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int arr[];
		String caract = null;
		int var1;
		int var2;
		int cosciente;
		int resto;
		int opc = 0;
		boolean out = false;
		while (!out) {
			System.out.println("\r" + "\t" + "|Menú|" + "\n" + "Elige opcion: " + "\n"
					+ "1. Función que recibe dos enteros y devuelve el cociente y el resto." + "\n"
					+ "2. Función que recibe un número entero n y un carácter y devuelve ese caracter n veces en un String"
					+ "\n" + "3. Función que recibe un número entre 1 y 9 y convierte en romano " + "\n" + "0. Salir");
			opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Introduce dividendo: ");
				var1 = sc.nextInt();
				System.out.println("Intorduce divisor: ");
				var2 = sc.nextInt();
				arr = division(var1, var2);
				cosciente = arr[0];
				resto = arr[1];
				System.out.println(
						"El resto de la division es: " + resto + "\n" + "El cosciente de la division es: " + cosciente);
				break;

			case 2:
				System.out.println("Introduce numero de veces a repetir: ");
				var1 = sc.nextInt();
				while (caract == null || caract.length() > 1) {
					System.out.println("Introduce caracter a repetir: ");
					caract = sc.next();
				}
				System.out.println(convertir(var1, caract.charAt(0)));
				caract = null;
				break;

			case 3:
				char[] simboloU = { 'I', 'V', 'X' };
				do {
					System.out.println("Convertir Romano a Arabigo(solo del 1 - 9): ");
					var1 = sc.nextInt();
					System.out.println(convertirMain(var1, simboloU));
				} while (!(var1 >= 1 && var1 <= 9));
				break;
			case 0:
				System.out.println("Adios!!");
				out = true;
				break;

			default:
				break;
			}
		}
	}
}
