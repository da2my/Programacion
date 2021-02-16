package view;

import java.util.Scanner;

public class Consola {

//	Atributos
	private static Scanner entrada = new Scanner(System.in);

//	Getters & Setters
	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		Consola.entrada = entrada;
	}

//	Metodos Escribir
	public static void escribeS(String text, boolean jump) {
		System.out.print(text);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeI(int number, boolean jump) {
		System.out.print(number);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeC(char character, boolean jump) {
		System.out.print(character);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeD(double doubleDecimal, boolean jump) {
		System.out.print(doubleDecimal);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeF(float decimal, boolean jump) {
		System.out.print(decimal);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeL(long longDecimal, boolean jump) {
		System.out.print(longDecimal);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeBy(byte number, boolean jump) {
		System.out.print(number);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeSh(short number, boolean jump) {
		System.out.print(number);
		if (jump) {
			System.out.println();
		}
	}

	public static void escribeBoo(boolean condition, boolean jump) {
		System.out.print(condition);
		if (jump) {
			System.out.println();
		}
	}

//	Metodos Leer
	public static String leeS(String sms) {
		String message;
		System.out.println(sms);
		message = entrada.next();
		return message;
	}

	public static int leeI(String sms) {
		int message;
		System.out.println(sms);
		message = entrada.nextInt();
		return message;
	}

	public static char leeC(String sms) {
		char message;
		System.out.println(sms);
		message = entrada.next().charAt(0);
		return message;
	}

	public static double leeD(String sms) {
		double message;
		System.out.println(sms);
		message = entrada.nextDouble();
		return message;
	}

	public static float leeF(String sms) {
		float message;
		System.out.println(sms);
		message = entrada.nextFloat();
		return message;
	}

	public static long leeL(String sms) {
		long message;
		System.out.println(sms);
		message = entrada.nextLong();
		return message;
	}

	public static byte leeBy(String sms) {
		byte message;
		System.out.println(sms);
		message = entrada.nextByte();
		return message;
	}

	public static short leeSh(String sms) {
		short message;
		System.out.println(sms);
		message = entrada.nextShort();
		return message;
	}

	public static boolean leeBoo(String sms) {
		boolean message;
		System.out.println(sms);
		message = entrada.nextBoolean();
		return message;
	}
}