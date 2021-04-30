package model;

public class Coche extends Terrestre {
	private boolean airAcondicionado;

	public Coche(String matricula, String modelo, int numRuedas, boolean airAcondicionado) {
		super(matricula, modelo, numRuedas);
		this.airAcondicionado = airAcondicionado;
	}

	public boolean isAirAcondicionado() {
		return airAcondicionado;
	}

	public void setAirAcondicionado(boolean airAcondicionado) {
		this.airAcondicionado = airAcondicionado;
	}

	@Override
	public String imprimir() {
		return super.imprimir()+ "Coche [airAcondicionado=" + airAcondicionado + "]";
	}

}
