package model;

public class CuentaAhorro extends CuentaBancaria {

	private final short saldoMinimo = 15000;

	public CuentaAhorro() {
		super();
	}

	public CuentaAhorro(String iban, double saldo) {
		super(iban, saldo);
	}

	public short getSaldoMinimo() {
		return saldoMinimo;
	}

	@Override
	public double calcularIntereses() {
		double aux;
		double aux2;
		double calculo;
		aux = getInteresAnualBasico() / 100;
		if (getSaldo() < getSaldoMinimo()) {
			aux2=aux / 2;
			calculo = aux2 * getSaldo() * 12;
			setSaldo(calculo + getSaldo());
		} else {
			aux2=aux * 2;
			calculo = aux2 * getSaldo() * 12;
			setSaldo(calculo + getSaldo());
		}
		return calculo;
	}
}
