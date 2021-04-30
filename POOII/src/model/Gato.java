package model;

import java.util.Calendar;
import java.util.Date;

public class Gato extends Mascotas {

	private String color;
	private boolean peloLargo;

	public Gato(String nombre, int edad, boolean estado, Calendar fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	@Override
	public String toString() {
		return super.toString() + "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
	}

	@Override
	public String muestra() {
		return "Gato [color=" + color + ", peloLargo=" + peloLargo + "]";
	}

	@Override
	public boolean habla() {
		return false;
	}

}
