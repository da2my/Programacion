package model;

import java.util.Calendar;
import java.util.Date;

public class Perro extends Mascotas {

	private String raza;
	private int pulgas;

	public Perro(String nombre, int edad, boolean estado, Calendar fechaNacimiento, String raza, int pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getPulgas() {
		return pulgas;
	}

	public void setPulgas(int pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String toString() {
		return super.toString() + "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}

	@Override
	public String muestra() {
		return "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}

	@Override
	public boolean habla() {
		return false;
	}

}
