package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Terrestre extends Vehiculo {

	private final int numRuedas;
	
	public Terrestre(String matricula, String modelo, int numRuedas) {
		super(matricula, modelo);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	@Override
	public String imprimir() {
		return "Vehiculo [matricula=" + getMatricula() + ", modelo=" + getModelo() + "]" + "Terrestre [numRuedas="
				+ numRuedas + "]";
	}

	@Override
	public String compMatricula(String matricula) {
		Pattern regla = Pattern.compile("[0-9]{4}[a-zA-Z]{3}");//PATRON
		Matcher match =regla.matcher(matricula);//COINCIDENCIA
		if (!match.matches()) {
			return "no valida";
		}else {			
		return matricula;
		}
	}

}
