package controller;

import model.Dinero;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinero b =new Dinero(95);
//		b.moneda();
		System.out.println("Dinero pedido: "+b.getCantidad());
		b.moneda();
	}

}
