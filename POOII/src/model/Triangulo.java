package model;

import java.text.DecimalFormat;

public class Triangulo implements Figura2D {

	private float base;
	private float altura;

	public Triangulo() {

	}

	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		return base * 3;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

	@Override
	public void escalar(double escala) {
		setBase((float) (getBase() * escala));
		setAltura((float) (getAltura() * escala));
	}

	@Override
	public void imprimir() {
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("\tTriangulo [Base=" + formato.format(getBase()) + ", Altura=" + formato.format(getAltura())
				+ ", perimetro=" + formato.format(perimetro()) + ", area=" + formato.format(area()) + "]");
	}
}
