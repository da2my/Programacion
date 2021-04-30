package controller;

import java.util.Scanner;

import model.Fecha;
import model.types.Mes;

public class MainFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha f = new Fecha();
		System.out.println("Fecha por defecto: " + f.toString());

		Fecha f1 = new Fecha(23, 12, 1988);
		Fecha f2 = new Fecha(23, 12, 2020);
		System.out.println(f1.toString() + "\n" + f2.toString());
		System.out.println("La diferencia de dias entre estas 2 fechas es: " + Fecha.calDias(f1, f2) + "dias");

		Fecha f3 = new Fecha(50, 2, 1983);
		System.out.println(f3.toString());

		System.out.println(Fecha.comparaFechas(f2, f1));

		System.out.println(Fecha.compararCumple(f2, f1));		
		
		System.out.println(Fecha.edadActual(f1));

	}

}
