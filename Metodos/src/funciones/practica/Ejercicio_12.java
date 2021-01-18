package funciones.practica;

import java.text.DecimalFormat;
import java.util.Scanner;

//Realiza un programa que dado un valor en kil�metros nos lo traduce a millas. 
//El programa debe tener una funci�n que reciba como par�metro una cantidad en 
//kil�metros y nos la devuelva en millas.
public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double km, millas;
		System.out.println("Introduce Km: ");
		km = sc.nextDouble();
		millas=pasaKmMilla(km);//Forma profe buena samaritana
		System.out.println(String.join("Son ", df.format(millas), "Millas"));
		sc.close();
	}

	static double pasaKmMilla(double km) {
		double milla;
		milla = km * 0.621371;
		return milla;
	}

}
