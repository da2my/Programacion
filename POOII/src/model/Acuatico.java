package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acuatico extends Vehiculo {

	private final float slora;

	public Acuatico(String matricula, String modelo, float slora) {
		super(matricula, modelo);
		this.slora = slora;
	}

	public float getSlora() {
		return slora;
	}

	@Override
	public String imprimir() {
		return "Vehiculo [matricula=" + getMatricula() + ", modelo=" + getModelo() + "]" + "Acuatico [slora=" + slora
				+ "]";
	}

	@Override
	public String compMatricula(String matricula) {
		Pattern regla = Pattern.compile("[0-9]{3}[a-zA-Z]{10}");//PATRON
		Matcher match =regla.matcher(matricula);//COINCIDENCIA
		if (!match.matches()) {
			return "no valida";
		}else {			
		return matricula;
		}
	}

}
