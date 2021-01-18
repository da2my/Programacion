package funciones.ejercicios;

import java.util.Scanner;

//13. Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
//Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe crear
//una función a la que le pasemos ambos valores y nos devuelva el descuento.
public class Ejercicio_13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double conD, sinD;
		System.out.println("Introduce precio sin descuento: ");
		sinD=sc.nextDouble();
		System.out.println("Introduce precio con descuento: ");
		conD=sc.nextDouble();
		System.out.println("El porcentaje de descuento aplicado es del " + descuen(conD, sinD) + "%" );
		sc.close();
	}
	
	static int descuen(double conDescuen, double sinDescuen) {
		double descuento, resta;
		resta=sinDescuen-conDescuen;
		descuento=(resta*100)/sinDescuen;
		return (int)descuento;
	}
}