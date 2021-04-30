package modelo.ejercicios;

import controlador.ejercicios.MainGatoCopia;

public class Gato {

	private String nombre;
	private int edad;

	public Gato() {
	}

	public Gato(String nombre, int edad) throws ExceptionEntradaNombre, ExceptionEntradaEdad {
		if (!nombre.matches("[A-Z,a-z]{3,}+")) {
			throw new ExceptionEntradaNombre();
		}
		if (edad < 0) {
			throw new ExceptionEntradaEdad();
		}

		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws ExceptionEntradaNombre {
		if (!nombre.matches("[A-Z,a-z]{3,}+")) {
			System.err.println("Error en nombre!!");
			throw new ExceptionEntradaNombre();
		}
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws ExceptionEntradaEdad {
		if (edad < 0) {
			System.err.println("Error en edad!!");
			throw new ExceptionEntradaEdad();
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Gato "+"[nombre=" + nombre + ", edad=" + edad + "]";
	}

}