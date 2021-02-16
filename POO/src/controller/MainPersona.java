package controller;

import java.util.Scanner;

import model.Persona;

public class MainPersona {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca un nombre: ");
		String nombre = scan.next();
		System.out.println("Introduzca la edad: ");
		int edad = scan.nextInt();

		System.out.println("Introduzca el peso: ");
		double peso = Double.parseDouble(scan.next());
		System.out.println("Introduzca la altura: ");
		double altura = Double.parseDouble(scan.next());
		System.out.println("Introduzca la nacionalidad: ");
		String nacionalidad = scan.next();

		
		
		Persona p1 = new Persona(nombre, edad, peso, altura, nacionalidad);
		Persona p2 = new Persona();
		System.out.println(p1.toString() + "\n" + "Esta persona es mayor de edad? " + p1.esMayorDeEdad() + "\n");


		p2.setEdad(28);
		System.out.println(p2.toString() + "\n");
		System.out.println("Esta persona es mayor de edad? " + p2.esMayorDeEdad());

	}

}
