package model;

import java.text.DecimalFormat;

public abstract class CuentaBancaria {

	private String iban;
	private double saldo;
	private static final float INTERES_ANUAL_BASICO = 0.04f;

	public CuentaBancaria() {

	}

	public CuentaBancaria(String iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static float getInteresAnualBasico() {
		return INTERES_ANUAL_BASICO;
	}

	public abstract double calcularIntereses();//Metodo abstracto || I=capital*interesAnual*12 

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "CuentaBancaria [iban=" + iban + ", saldo=" +df.format(saldo) + "]";
	}

	public void ingresar(double cantidad) {
		double ingreso;
		ingreso = getSaldo() + cantidad;
		setSaldo(ingreso);
	}

	public void retirar(double cantidad) {
		double retiro;
		retiro = getSaldo() - cantidad;
		setSaldo(retiro);
	}

	public void traspaso(CuentaBancaria cb, double cantidad) {
		double traspaso;
		traspaso = getSaldo() - cantidad;
		setSaldo(traspaso);
		cb.setSaldo(cb.getSaldo() + cantidad);

	}

}
