package model;

public class Animal {
	private String raza;
	private String nombre;
	private int edad;

	public Animal() {
		nombre = "firulais";
	}

	public Animal(String nombre, String raza) {
		this.nombre = nombre;
		this.raza=raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}

	public String getNombre() {
		
		return nombre;
	}
}
