package ejerciciosBasicos;

import java.text.DecimalFormat;

public class Notas_16 {

//	Principal
	public static void main(String[] args) {
		
		Notas_16 n = new Notas_16();
		DecimalFormat df = new DecimalFormat("#.00");
		double cal=Math.random()*10;//random de enteros --> (int)(Math.random()*10+1);
		System.out.println(df.format(cal));
		System.out.println(n.transNota(cal));
	}

//	Atributos
	float nota;

//	Metodos
	String transNota(double cal) {
		String nota = "";
		if (cal<3) {
			nota="Muy Deficiente";
		}else if (cal>3 && cal<5) {
			nota="Insufuciente";
		}else if (cal>5 && cal<6) {
			nota="Bien";
		}else if (cal>6&& cal<9) {
			nota="Notable";
		}else  {
			nota="Sobresaliente";
		}
		return nota;
	}

}
