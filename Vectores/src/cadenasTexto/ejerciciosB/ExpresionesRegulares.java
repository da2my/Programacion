package cadenasTexto.ejerciciosB;

public class ExpresionesRegulares {

	public static void main(String[] args) {
		//JUGAR CON LAS EXPRESIONES REGULARES
		String cadena = "Solo se que no se nada";
		System.out.println(cadena.matches(".*[qnd]"));
		System.out.println(cadena.matches("[abc]+\\d{1,10}"));// hacer que este sea true
	}

}
