package controller;

import model.CuentaAhorro;
import model.CuentaCorriente;
//import model.CuentaBancaria;

public class MainCuentaBancaria {

	public static void main(String[] args) {
		
		CuentaAhorro c1 = new CuentaAhorro("se3524475575468", 1000);
		CuentaCorriente c2 = new CuentaCorriente("se35244345365468", 5000);
//		c1.ingresar(5000);
//		c1.retirar(2000);
//		c1.traspaso(c2, 9000);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c2.calcularIntereses());
		System.out.println(c2);
		
		System.out.println();
		System.out.println(c1.calcularIntereses());
		System.out.println(c1);
		
	}
}
