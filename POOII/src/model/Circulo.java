package model;

import java.text.DecimalFormat;

public class Circulo implements Figura2D {

	private float radio;

	public Circulo() {
	}

	public Circulo(float radio) {
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		double p, diametro;
		diametro = 2 * radio;
		p = Math.PI * diametro;
		return p;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * (Math.pow(radio, 2));
	}

	@Override
	public void escalar(double escala) {
		setRadio((float) (getRadio() * escala));
	}

	@Override
	public void imprimir() {
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("\tCirculo [Radio=" + formato.format(getRadio()) + ", perimetro="
				+ formato.format(perimetro()) + ", area=" + formato.format(area()) + "]");
	}

}
