package model;

public class Barco extends Acuatico {
	private boolean motor;

	public Barco(String matricula, String modelo, float slora, boolean motor) {
		super(matricula, modelo, slora);
		this.motor = motor;
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String imprimir() {
		return super.imprimir() + "Barco [motor=" + motor + "]";
	}
}
