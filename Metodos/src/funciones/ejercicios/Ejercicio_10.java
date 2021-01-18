package funciones.ejercicios;

import java.util.Scanner;

//Realiza un programa que lea una fecha introduciendo el d�a, mes y a�o por separado y nos diga
//si la fecha es correcta o no. Supondremos que todos los meses tienen 30 d�as. Se debe crear una
//funci�n donde le pasemos los datos y devuelva si es correcta o no.
public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, m, a;
		System.out.println("Introduce fecha" + "\n" + "dia: ");
		d=sc.nextInt();
		System.out.println("mes: ");
		m=sc.nextInt();
		System.out.println("a�o: ");
		a=sc.nextInt();
		System.out.println("La fecha introducida es: " + compruebaFecha(d, m, a));
		sc.close();
	}

	static boolean compruebaFecha(int dia, int mes, int agno) {
		if (dia <= 30 && mes <= 12) {
			return true;
		}
		return false;
	}
}