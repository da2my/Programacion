package model;

import java.text.DecimalFormat;

public class Rectangular implements Figura2D {

	private float base;
	private float altura;

	public Rectangular() {
	}

	public Rectangular(float base, float altura) {
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
		return 2 * (base + altura);
	}

	@Override
	public double area() {
		return base * altura;
	}

	@Override
	public void escalar(double escala) {
		setAltura((float) (getAltura() * escala));
		setBase((float) (getBase() * escala));
	}

	@Override
	public void imprimir() {
		DecimalFormat formato = new DecimalFormat("#.##");
		System.out.println("\tRectangular [Base=" + formato.format(getBase()) + ", Altura=" + formato.format(getAltura())
						+ ", perimetro=" + formato.format(perimetro()) + ", area=" + formato.format(area()) + "]");
	}

}
