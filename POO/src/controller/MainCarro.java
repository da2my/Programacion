package controller;

import model.Carro;

public class MainCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		System.out.println("Caracteristicas de carro1: " + carro1.toString());
		System.out.println("Instrucciones para conducir: "+ carro1.acelera());
		System.out.println("Precio del carro1: "+ carro1.getPrecio());
		System.out.println();
		Carro carro2 = new Carro(4000, 3, "Rojo", 100444);
		System.out.println("Caracteristicas de carro2: " + carro2.toString());
		System.out.println("Color de carro2: "+carro2.getColor());
		System.out.println("Instrucciones para conducir: " + carro2.acelera());
	}

}
