package controller;

import model.Precio;

public class MainPrecio {

	public static void main(String[] args) {
		Precio precioObj1 = new Precio();
		System.out.println("posible valor obj1 = " + precioObj1.toString());
		
		Precio precioObj2 = new Precio(490.50, 340.34, 209);
		System.out.println("posible valor obj2 = " + precioObj2.toString());

	}

}
