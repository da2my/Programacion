package model;

public class CuentaCorriente extends CuentaBancaria {
	
	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(String iban, double saldo) {
		super(iban, saldo);
	}

	
	@Override
	public double calcularIntereses() {
		double aux;
		double calculo;
		aux=getInteresAnualBasico()/100;
		calculo=aux*getSaldo()*12;
		setSaldo(calculo+getSaldo());
		return calculo;
	}

}
