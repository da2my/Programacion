package model;

import java.util.ArrayList;
//import java.util.Iterator;


public class Planeta extends Astro {

	private float distancia_sol;
	private float orbita_sol;
	private ArrayList<Satelite> satelites;//String
	private String nombre;

//	public Planeta() {
//		distancia_sol = 0;
//		orbita_sol = 0;
//		satelites = null;
//	}

	public Planeta() {

	}

//	public Planeta(float radio, float rotacion, float masa, float temperatura, float gravedad, float distancia_sol,
//			float orbita_sol, String nombre) {
//		super(radio, rotacion, masa, temperatura, gravedad);
//		this.distancia_sol = distancia_sol;
//		this.orbita_sol = orbita_sol;
//		Planeta.nombre = nombre;
//	}

	public Planeta(float radio, float rotacion, float masa, float temperatura, float gravedad, float distancia_sol,
			float orbita_sol, String nombre, ArrayList<Satelite> satelites) {
		super(radio, rotacion, masa, temperatura, gravedad);
		this.distancia_sol = distancia_sol;
		this.orbita_sol = orbita_sol;
		this.nombre = nombre;
		this.satelites = satelites;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getDistancia_sol() {
		return distancia_sol;
	}

	public void setDistancia_sol(float distancia_sol) {
		this.distancia_sol = distancia_sol;
	}

	public float getOrbita_sol() {
		return orbita_sol;
	}

	public void setOrbita_sol(float orbita_sol) {
		this.orbita_sol = orbita_sol;
	}

	public ArrayList<Satelite> getSatelites() {
		return satelites;
	}

	public void setSatelites(ArrayList<Satelite> satelites) {
		this.satelites = satelites;
	}

	@Override
	public String muestra() {
	for (Satelite satelite : satelites)
		return super.muestra() + "Planeta [nombre=" + nombre + ", distancia_sol=" + distancia_sol + ", orbita_sol="
				+ orbita_sol + ", satelites=" + satelite.toString() + "]";
	return nombre;
	}

}
