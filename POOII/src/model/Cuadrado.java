package model;

import java.text.DecimalFormat;

public class Cuadrado implements Figura2D {

	private float lado;

	public Cuadrado() {

	}

	public Cuadrado(float lado) {
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		return lado * 4;
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
	}

	@Override
	public void escalar(double escala) {
		setLado((float) (getLado() * escala));
	}

	@Override
	public void imprimir() {
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("\tCuadrado [Lado=" + formato.format(getLado()) + ", perimetro=" + formato.format(perimetro()) + ", area=" + formato.format(area()) + "]");

	}

	
	
}
