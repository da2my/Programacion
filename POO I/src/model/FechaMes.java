package model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import model.types.Mes;

public class FechaMes {

	private int dia; 
	private Mes mes;
	private int agno;

	public FechaMes() {

	}

	public FechaMes(int dia, Mes mes, int agno) {
	    this.dia=dia;
		this.mes=mes;
        this.agno=agno;
	}	
	
	
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public int getAgno() {
		return agno;
	}

	public void setAgno(int agno) {
		this.agno = agno;
	}

	public static int calDias(FechaMes obj1, FechaMes obj2) {

		FechaMes aux;

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
		int dia, agno;
		Mes mes;
		int m;
		int r;
		dia = obj2.getDia();
		mes = obj2.getMes();
		agno = obj2.getAgno();
		int otroDia, otroAgno;
		Mes otroMes;
		otroDia = obj1.getDia();
		otroMes = obj1.getMes();
		otroAgno = obj1.getAgno();
		actualizadorMes = otroMes.ordinal()+1;
		r = 30 - dia;
		while (otroAgno <= agno) {
			m = (otroAgno == agno) ? mes.ordinal()+1 : 12;
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

	public static String comparaFechas(FechaMes obj1, FechaMes obj2) {
		FechaMes aux;
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
	
	public static String compararCumple(FechaMes obj1, FechaMes obj2) {
		if (obj1.getMes() == obj2.getMes() && obj1.getDia() == obj2.getDia()) {
			return "Igual Cumpleaños!!!";
		} else {
			return "Diferente Cumpleaños!!!";
		}
	}
	
	public static String edadActual(FechaMes obj1) {
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

	@Override
	public String toString() {
		return "FechaMes [dia=" + dia + ", mes=" + mes + ", agno=" + agno + "]";
	}
	
	
	
}
