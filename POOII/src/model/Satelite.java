package model;

public class Satelite extends Astro {

	private float distancia_planeta;
	private int orbita_planeta;
	private String pertenece;
	private String nombre;

	public Satelite() {

	}

	public Satelite(float radio, float rotacion, float masa, float temperatura, float gravedad, float distancia_planeta,
			int orbita_planeta, String nombre) {
		super(radio, rotacion, masa, temperatura, gravedad);
		this.distancia_planeta = distancia_planeta;
		this.orbita_planeta = orbita_planeta;
		this.nombre = nombre;
	}

	public float getDistancia_planeta() {
		return distancia_planeta;
	}

	public void setDistancia_planeta(float distancia_planeta) {
		this.distancia_planeta = distancia_planeta;
	}

	public int getOrbita_planeta() {
		return orbita_planeta;
	}

	public void setOrbita_planeta(int orbita_planeta) {
		this.orbita_planeta = orbita_planeta;
	}

	public String getPertenece() {
		return pertenece;
	}

	public void setPertenece(String pertenece) {
		this.pertenece = pertenece;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String muestra() {
		Planeta planet = new Planeta();//revisar getNombre()de Planeta porque no me refleja el nombre en el toString() de Satelite
		return super.muestra() + "Satelite [distancia_planeta=" + distancia_planeta + ", orbita_planeta="
				+ orbita_planeta + ", pertenece=" + planet.getNombre() + ", nombre=" + nombre + "]";
	}

	@Override
	public String toString() {
		return "Satelite [nombre=" + nombre + "]";
	}

	
	
}
