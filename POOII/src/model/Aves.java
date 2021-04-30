package model;

import java.util.Calendar;

import types.TipoPico;

public abstract class Aves extends Mascotas {

	private TipoPico pico;
	private boolean vuela;
	
	public Aves(String nombre, int edad, boolean estado, Calendar fechaNacimiento, TipoPico pico, boolean vuela) {
		super(nombre,  edad,  estado,  fechaNacimiento);
		this.pico=pico;
		this.vuela=vuela;
	}

	public TipoPico getPico() {
		return pico;
	}

	public void setPico(TipoPico pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	public abstract boolean volar();

	@Override
	public String toString() {
		return super.toString() + "Aves [pico=" + pico + ", vuela=" + vuela + "]";
	}	
}
