package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Circulo;
import model.Cuadrado;
import model.Figura2D;
import model.Rectangular;
import model.Triangulo;

public class MainFigura2D {

	public static void main(String[] args) {

//		Crea un ArrayList figuras.
		List<Figura2D> listFiguras2D = new ArrayList<>();
		
//		Añade figuras de varios tipos.
		listFiguras2D.add(new Cuadrado(3));
		listFiguras2D.add(new Rectangular(2, 5));
		listFiguras2D.add(new Triangulo(5, 7));
		listFiguras2D.add(new Circulo(5));

		Iterator<Figura2D> it = listFiguras2D.iterator();
		Iterator<Figura2D> it2 = listFiguras2D.iterator();
		
		System.out.println(" Figuras2D: \n");
//		Muestra la información de todas las figuras.
		while (it.hasNext()) {
			it.next().imprimir();
		}
		
//		Escala todas las figuras con escala = 2.
		System.out.println("\n Con escala 2: ");
		while (it2.hasNext()) {
			it2.next().escalar(2);
		}

//		Muestra de nuevo la información de todas las figuras.
		for (Figura2D figura2d : listFiguras2D) {
			figura2d.imprimir();
		}
		
//		Escala todas las figuras con escala = 0.1.
		System.out.println("\n Con escala 0.1: ");
		for (Figura2D fig2d : listFiguras2D) {
			fig2d.escalar(0.1);
		}
		
//		Muestra de nuevo la información de todas las figuras.
		for (Figura2D fig2d : listFiguras2D) {
			fig2d.imprimir();
		}
	}

}
