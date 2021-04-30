package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Mascotas {

	private String nombre;
	private int edad;
	private boolean estado;
	private Calendar fechaNacimiento;

	public Mascotas(String nombre, int edad, boolean estado, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void cumpleanos() {
		getFechaNacimiento();
	}

	public boolean morir() {
		System.out.println("mascota muerta");
		return false;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ sdf.format(fechaNacimiento.getTime()) + "]";
	}

	public abstract String muestra();

	public abstract boolean habla();

}