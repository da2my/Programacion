package controller;

import java.util.Scanner;

import model.Tablero;

public class MainTablero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra;
		Tablero tablero1 = new Tablero();
		int numero;
		tablero1.pintaTablero();
		System.out.println("Introduce coordenadas a consultar: ");
		letra=sc.next();
		numero=sc.nextInt();
		tablero1.inicializaTablero(); 
		System.out.println(tablero1.consultaPosicion(letra, numero));
		sc.close();
		
		
	}

}
