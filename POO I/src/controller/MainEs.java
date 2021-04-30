package controller;

import java.util.Scanner;

import es.ES;

public class MainEs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Uso con tipo String
//		String letraDNI = ES.leeS("Introduce dni:");
//		ES.escribeS(letraDNI.substring(letraDNI.length()-1), true);

//		Uso con tipo char
//		char caracter=io.leeC("Escribe un caracter: ");
//		io.escribeC(caracter, false);

//		Uso con tipo float
		double numDecimal = ES.leeD("Escribe un numero decimal: ");
		ES.escribeD(numDecimal, false);

		// uso Setter setEntrada() para establecer un nuevo valor, puede vales para
		// todos los metodos ya la variable entrada es de campo
		ES.setEntrada(sc);
		numDecimal = sc.nextDouble();

		ES.escribeD(numDecimal, true);

	}
}