package model;

import java.util.Calendar;

import types.TipoPico;

public class Loro extends Aves {

	private String origen;
	private boolean habla;

	public Loro(String nombre, int edad, boolean estado, Calendar fechaNacimiento, TipoPico pico, boolean vuela,
			String origen, boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}

	@Override
	public String toString() {
		return super.toString() + "Loro [origen=" + origen + ", habla=" + habla + "]";
	}

	@Override
	public String muestra() {
		return "Loro [origen=" + origen + ", habla=" + habla + "]";
	}

	@Override
	public boolean volar() {
		return true;
	}

	public void saluda() {
		System.out.println("hola marinero de agua dulce");
	}

	@Override
	public boolean habla() {
		// TODO Auto-generated method stub
		return false;
	}
}
