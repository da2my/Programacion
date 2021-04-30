package model;

public class Avion extends Aereo {
	private int tiempoVuelo;

	public Avion(String matricula, String modelo, int numAsientos, int tiempoVuelo) {
		super(matricula, modelo, numAsientos);
		this.tiempoVuelo = tiempoVuelo;
	}

	public int getTiempoVuelo() {
		return tiempoVuelo;
	}

	public void setTiempoVuelo(int tiempoVuelo) {
		this.tiempoVuelo = tiempoVuelo;
	}

	@Override
	public String imprimir() {
		return super.imprimir() + "Avion [horasVuelo=" + tiempoVuelo + "]";
	}

}
