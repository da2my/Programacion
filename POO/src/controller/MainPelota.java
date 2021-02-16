package controller;

import model.Pelota;

public class MainPelota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelota pelotita1 = new Pelota(238, 654);
		System.out.println("El peso de pelotita1 es: " + pelotita1.getRadio());
		System.out.println(pelotita1.getPeso());

		Pelota pelotita2 = new Pelota();
		System.out.println("La pelotita2 pesa: " + pelotita2.getPeso());
	
		pelotita1.atraparPelota();
	}

}
