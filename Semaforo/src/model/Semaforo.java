package model;

public class Semaforo {

	private String rojo;
	private String ambar;
	private String verde;

	public Semaforo() {

	}

	public String getRojo() {
		return rojo;
	}

	public void setRojo(String rojo) {
		this.rojo = rojo;
	}

	public String getAmbar() {
		return ambar;
	}

	public void setAmbar(String ambar) {
		this.ambar = ambar;
	}

	public String getVerde() {
		return verde;
	}

	public void setVerde(String verde) {
		this.verde = verde;
	}

	public void comportamiento(String key) {
		switch (key) {
		case "rojo":
			setRojo(key);
			System.out.println("No puedes pasar");
			break;
		case "ambar":
			setAmbar(key);
			System.out.println("Ten cuidado al pasar");
			break;
		case "verde":
			setVerde(key);
			System.out.println("Pasa tranquilo");
			break;
		default:
			System.out.println("");
			break;
		}
	}

	@Override
	public String toString() {
		return "Semaforo [rojo=" + rojo + ", ambar=" + ambar + ", verde=" + verde + "]";
	}

}
