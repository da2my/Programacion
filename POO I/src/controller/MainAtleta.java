package controller;

import model.Atleta;
import model.types.Genero;

public class MainAtleta {

	public static void main(String[] args) {

		Atleta[] collAtleta = new Atleta[4];

		collAtleta[0] = new Atleta("34665682P", "Carlos", 1988, 65.5f, 78, true, Genero.HOMBRE);
		collAtleta[1] = new Atleta("34212682P", "Gabriela", 2011, 89.5f, 67, false, Genero.MUJER);
		collAtleta[2] = new Atleta("34212682Y", "Julio", 1982, 70.5f, 70, true, Genero.HOMBRE);
		collAtleta[3] = new Atleta("34212623U", "Padme", 2009, 60.5f, 62, true, Genero.MUJER);

		for (Atleta atleta : collAtleta) {
			System.out.println(atleta);
		}
	}
}