package model;

public abstract class Vehiculo {

	private final String matricula;
	private final String modelo;
	
	public Vehiculo(String matricula, String modelo) {
		this.matricula = compMatricula(matricula);
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public abstract String imprimir();
	public abstract String compMatricula(String matricula);

}
