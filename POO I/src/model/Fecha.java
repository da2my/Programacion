package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
//	Atributos
	private int dia;
	private int mes;
	private int agno;

//	Constructores
	public Fecha() {
		dia = 26;
		mes = 11;
		agno = 2020;
	}

	public Fecha(int dia, int mes, int agno) {

		if ((dia <= 0 || dia > 31) || (mes <= 0 || mes > 12) || (agno <= 0 || agno > 3000)) {
			System.err.println("Fecha incorrecta, se ponen valores por convenio");
			this.dia = 1;
			this.mes = 1;
			this.agno = 3000;
		} else {
			this.dia = dia;
			this.mes = mes;
			this.agno = agno;

		}
	}

//	Getters & Setters
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAgno() {
		return agno;
	}

	public void setAgno(int agno) {
		this.agno = agno;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", agno=" + agno + "]";
	}

	public static int calDias(Fecha obj1, Fecha obj2) {

		Fecha aux;

		if (obj1.getAgno() >= obj2.getAgno()) {
			aux = obj1;
			obj1 = obj2;
			obj2 = aux;
		}

		int resultado = 0;
		int arrRedondeoSemana[] = new int[5];
		int filas = arrRedondeoSemana.length;
		int contDias = 0;
		int actualizadorMes = 0;
		int contMeses = 0;
		int contAgnos = 0;
		int calMesTreintaYuno = 0;
		int dia, mes, agno;
		int m;
		int r;
		dia = obj2.getDia();
		mes = obj2.getMes();
		agno = obj2.getAgno();
		int otroDia, otroMes, otroAgno;
		otroDia = obj1.getDia();
		otroMes = obj1.getMes();
		otroAgno = obj1.getAgno();
		actualizadorMes = otroMes;
		r = 30 - dia;
		while (otroAgno <= agno) {
			m = (otroAgno == agno) ? mes : 12;
			while (actualizadorMes <= m) {
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < filas; j++) {
						contDias++;
					}
					contDias++;
				}
				actualizadorMes++;
				contMeses++;
				calMesTreintaYuno = (contMeses / 12) * 6;
			}
			actualizadorMes = 1;
			otroAgno++;
			contAgnos++;
		}

//		System.out.println(contDias - otroDia - r + calMesTreintaYuno);
//		System.out.println(actualizadorMes);
//		System.out.println(contAgnos + "\n" + otroAgno);
//		System.out.println(contMeses);

		return Math.abs(contDias - otroDia - r + calMesTreintaYuno);
	}

	public static String comparaFechas(Fecha obj1, Fecha obj2) {
		Fecha aux;
		if (obj1.getAgno() == obj2.getAgno() && obj1.getMes() == obj2.getMes() && obj1.getDia() == obj2.getDia()) {
			return obj2.toString() + obj1.toString() + " -> fechas iguales!!!";
		} else if (obj1.getAgno() > obj2.getAgno()) {
			aux = obj1;
			obj1 = obj2;
			obj2 = aux;
			return obj1.toString() + " -> Fecha es menor!!!";
		} else {
			return obj2.toString() + " -> Fecha es mayor!!!";

		}
	}

	public static String compararCumple(Fecha obj1, Fecha obj2) {
		if (obj1.getMes() == obj2.getMes() && obj1.getDia() == obj2.getDia()) {
			return "Igual Cumpleaños!!!";
		} else {
			return "Diferente Cumpleaños!!!";
		}
	}

	public static String edadActual(Fecha obj1) {
		int agno, a;
		int difAgno = 0;
		GregorianCalendar gcalendar = new GregorianCalendar();
		agno = gcalendar.get(Calendar.YEAR);
		a=obj1.getAgno();
		while (a < agno) {
			a++;
			difAgno++;
		}
		return Integer.toString(difAgno);
	}

}
