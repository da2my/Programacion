package model;

public class Pelota {

	// Atributos
	private float radio;
	private float peso;

	// Constructores
	public Pelota() {
		radio = 100;
		peso = 250;
	}
	
	public Pelota(float radio, float peso) {
		this.radio=radio;
		this.peso=peso;
	}
	
//	Getters & Setters
	public float getRadio() {
		return radio;
	}
	
	public float getPeso() {
		return peso;
	}
	
//	Metodos
	public  void patearPelota() {
		System.out.println("Haz patear la pelota");
	}
	
	public  void atraparPelota() {
		System.out.println("Haz atrapar la pelota");
	}


}
