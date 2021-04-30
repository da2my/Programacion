package model;

public abstract class Astro {

	private float radio;
	private float rotacion;
	private float masa;
	private float temperatura;
	private float gravedad;

	public Astro() {

	}

	public Astro(float radio, float rotacion, float masa, float temperatura, float gravedad) {
		this.radio = radio;
		this.rotacion = rotacion;
		this.masa = masa;
		this.temperatura = temperatura;
		this.gravedad = gravedad;
	}

	public float getRadio() {
		return radio;
	}

	public float getRotacion() {
		return rotacion;
	}

	public float getMasa() {
		return masa;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public float getGravedad() {
		return gravedad;
	}

	public String muestra() {
		return "Astros [radio=" + radio + "\n rotacion=" + rotacion + "\n masa=" + masa + "\n temperatura=" + temperatura
				+ "\n gravedad=" + gravedad + "]";
	}
}