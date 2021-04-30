package model;

public class Submarino extends Acuatico {
	private float profundidadMax;

	public Submarino(String matricula, String modelo, float slora, float profundidadMax) {
		super(matricula, modelo, slora);
		this.profundidadMax = profundidadMax;
	}

	public float getProfundidadMax() {
		return profundidadMax;
	}

	public void setProfundidadMax(float profundidadMax) {
		this.profundidadMax = profundidadMax;
	}

	@Override
	public String imprimir() {
		return super.imprimir() + "Submarino [profundidadMax=" + profundidadMax + "]";
	}
}
