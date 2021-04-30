package model;

import model.types.Genero;

public class Atleta {

	private String dni;
	private String nombre;
	private int agnoNacimiento;
	private float altura;
	private int pesoKg;
	private boolean estudia;
	private Genero genero;

	public Atleta(String dni, String nombre, int agnoNacimiento,float altura, int pesoKg, boolean estudia, Genero genero) {
		this.dni = dni;
		this.nombre = nombre;
		this.agnoNacimiento = agnoNacimiento;
		this.altura=altura;
		this.pesoKg = pesoKg;
		this.estudia = estudia;
		this.genero = genero;

	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAgnoNacimiento() {
		return agnoNacimiento;
	}

	public void setAgnoNacimiento(short agnoNacimiento) {
		this.agnoNacimiento = agnoNacimiento;
	}

	public int getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(byte pesoKg) {
		this.pesoKg = pesoKg;
	}

	public boolean isEstudia() {
		return estudia;
	}

	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Atleta [dni=" + dni + ", nombre=" + nombre + ", agnoNacimiento=" + agnoNacimiento + ", altura=" + altura
				+ ", pesoKg=" + pesoKg + ", estudia=" + estudia + ", genero=" + genero + "]";
	}

}