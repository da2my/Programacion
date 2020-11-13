package controller;

import model.Dinero;

public class Admin {

	public static void main(String[] args) {
		Dinero b = new Dinero(153.72);
		System.out.println("Cantidad de dinero: " + b.getCantidad());
		Dinero.moneda();		
	}

}
