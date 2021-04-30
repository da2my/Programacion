package model;

public class Helicoptero extends Aereo {
	private int numHelice;

	public Helicoptero(String matricula, String modelo, int numAsientos, int numHelice) {
		super(matricula, modelo, numAsientos);
		this.setNumHelice(numHelice);
	}

	public int getNumHelice() {
		return numHelice;
	}

	public void setNumHelice(int numHelice) {
		this.numHelice = numHelice;
	}

	@Override
	public String imprimir() {
		return super.imprimir() + "Helicoptero [numHelice=" + numHelice + "]";
	}

}
