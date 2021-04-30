package controller;

import model.FechaMes;
import model.types.Mes;

public class MainFechaMes {

	public static void main(String[] args) {
		// values() es un metodo static por eso no necesito una referencia para acceder
		// a el
//		System.out.println("Lista de meses: ");
//		for (Mes m : Mes.values()) {
//			System.out.println(m.ordinal()+1);
//			System.out.println(m);
//		}
//
//		// se necesita una referencia a Mes para poder acceder a los metodos ordinal() y
//		// name()
//		Mes mes = Mes.MAYO;
//		System.out.println();
//		System.out.println("Mes: " + mes.name() + ", numero: " + (mes.ordinal() + 1));

		FechaMes f1 = new FechaMes(23, Mes.DICIEMBRE, 1988);
		FechaMes f2 = new FechaMes(4, Mes.NOVIENBRE, 1991);

		System.out.println("Hay " + FechaMes.calDias(f1, f2) + " dias de diferencia entre las 2 fechas");
		System.out.println(FechaMes.comparaFechas(f1, f2));
		System.out.println(FechaMes.compararCumple(f1, f2));
		System.out.println(FechaMes.edadActual(f1));

	}
}