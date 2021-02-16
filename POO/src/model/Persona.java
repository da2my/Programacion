package model;

public class Persona {

	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	private String nacionalidad;

	public Persona() {
		nombre = "David";
		edad = 32;
		peso = 65.5;
		altura = 67.5;
		nacionalidad = "Ecuador";
	}

	public Persona(String nombre, int edad, double peso, double altura, String nacionalidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.nacionalidad = nacionalidad;

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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

//	Metodos
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (edad >= 18) {
			mayor = true;
		}
		return mayor;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + ", nacionalidad=" + nacionalidad
				+ "]";
	}

}
