package controller;

import java.util.Scanner;

public class Admin {

	int cont;// contador de cifras
	int acum;// guardar la suma
	int ns, nc;// valor siguente y valor actual
	char car, sig;// caracter actual y siguiente

	public static void main(String[] args) {
		
		
		
		
		  Scanner sc=new Scanner(System.in);
	      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	      String Miles[]= {"", "M", "MM", "MMM"};
	      System.out.println("Ingresa numero entre 1 y 3999");
	      int N = sc.nextInt();
	      int u=N%10;
	      int d=(N/10)%10;
	      int c=(N/100)%10;
	      int m=N/1000;
	      if(N>=100){         
	          System.out.println(Miles[m]+Centena[c]+Decena[d]+Unidad[u]);
	      }else{
	          if(N>=10){
	              System.out.println(Decena[d]+Unidad[u]);          
	          }else{
	              System.out.println(Unidad[N]);          
	          }          
	      }

//		arabigoAromano();

//		String s = "3819";
//		int sInt;
//		int aux;
//		for (int i = 0; i < s.length(); i++) {
//			sInt=Integer.parseInt(s);
//			int value[]=new int[s.length()];
//			value[i]=valor[i];
//			System.out.println(value[i]);
//			System.out.println(valor[i]);
//			if (value[i]==valor.length) {
//				aux=value[i]*1000;
//				System.out.println(aux);
//			}
//		}
//		char[] romanos = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
//		for (int i = 0; i < romanos.length; i++) {			
//			if (i==valor) {
//				
//			}
//		}
	}

	public static void arabigoAromano() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe numero Arábigo para convertir a Romano: ");
		int num;
		int valor;
		int resto;
		int cont = 0;
		num = sc.nextInt();
		int cociente;
		int[] eq = { 1, 5, 10, 50, 100, 500, 1000 };
		for (int i = 0; i < eq.length; i++) {
			cont++;
			valor = eq[eq.length - cont];
			resto = num % valor;
			num = resto;
			System.out.println(resto);
			if (resto == num) {

			}
//			resto %= eq.length - i;
//			resultado = num / aux;
//			System.out.println(resultado);
		}
//		char[] romanos = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
//		for (char c : romanos) {
//			System.out.println(c);
//		}

//		char key = 0;
//		switch (key) {
//		case 'I':
//
//			break;
//		case 'V':
//
//			break;
//		case 'X':
//
//			break;
//		case 'L':
//
//			break;
//		case 'C':
//
//			break;
//		case 'D':
//
//			break;
//		case 'M':
//
//			break;
//		default:
//			break;
//		}

	}
}