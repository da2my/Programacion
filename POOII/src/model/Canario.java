package model;

import java.util.Calendar;

import types.TipoPico;

public class Canario extends Aves{

	private String color;
	private boolean canta;
	
	public Canario(String nombre, int edad, boolean estado, Calendar fechaNacimiento, TipoPico pico, boolean vuela, String color, boolean canta) {
		super( nombre,  edad,  estado,  fechaNacimiento,  pico,  vuela);
		this.color = color;
		this.canta = canta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}

	
	
	@Override
	public String toString() {
		return super.toString() + "Canario [color=" + color + ", canta=" + canta + "]";
	}

	@Override
	public String muestra() {
		return "Canario [color=" + color + ", canta=" + canta + "]";
	}

	@Override
	public boolean habla() {
		return true;
	}

	@Override
	public boolean volar() {
		return true;
	}

}
