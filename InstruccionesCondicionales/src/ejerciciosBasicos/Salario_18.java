package ejerciciosBasicos;

public class Salario_18 {

//	Principal
	public static void main(String[] args) {

		Salario_18 e1 = new Salario_18("David", 40);// Introducir nombre del trabajador y horas trabajadas por el consructor
		System.out.println(e1.toString());
		System.out.println("Salario Bruto: " + e1.salarioBruto() + "€");
		System.out.println("Impuestos: " + e1.impuestos() + "€");
		System.out.println("Salario Neto: " + e1.salarioNeto() + "€");
	}

// 	Atributos
	String nombre;
	int horas;
	static final int PRECIO_HORA = 10;

// 	Constructor
	public Salario_18(String nombre, int horas) {
		this.nombre = nombre;
		this.horas = horas;
	}

//	Metodos
	public double salarioBruto() {
		double bruto = 0;
		if (horas <= 35) {
			bruto = (double) PRECIO_HORA * horas;
		} else if (horas > 35) {
			double aux1 = PRECIO_HORA * 35;
			double aux2 = horas - 35;
			bruto = (double) PRECIO_HORA * 1.5 * aux2 + aux1;
		}
		return bruto;
	}

	public double impuestos() {
		double impuesto;
		if (salarioBruto() <= 500) {
			impuesto = 0;
		} else if (salarioBruto() > 500 && salarioBruto() <= 900) {
			double aux1 = salarioBruto() - 500;
			impuesto = aux1 * 0.25;
		} else {
			double aux1 = this.salarioBruto() - 900;
			impuesto = aux1 * 0.45;
		}

		return impuesto;
	}

	public double salarioNeto() {
		return salarioBruto() - impuestos();
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", horas=" + horas + "]";
	}
}
