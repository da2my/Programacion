package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aereo extends Vehiculo {

	private final int numAsientos;

	public Aereo(String matricula, String modelo, int numAsientos) {
		super(matricula, modelo);
		this.numAsientos = numAsientos;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	@Override
	public String imprimir() {
		return "Vehiculo [matricula=" + getMatricula() + ", modelo=" + getModelo() + "]" + "Aereo [numAsientos="
				+ numAsientos + "]";
	}

	@Override
	public String compMatricula(String matricula) {
		Pattern regla = Pattern.compile("[a-zA-Z]{4}[0-9]{6}");//PATRON
		Matcher match =regla.matcher(matricula);//COINCIDENCIA
		if (!match.matches()) {
			return "no valida";
		}else {			
		return matricula;
		}
	}

}
