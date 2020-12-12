package vectores.ejerciciosA;

public class Ejercicio_11 {

	public static void main(String[] args) {
		int array1[] = new int[100];

		int cont = 0;
		for (int i = 0; i < array1.length; i++) {
			cont++;
			array1[i] = cont;
			System.out.println(array1[i]);
		}
		System.out.println();
		int array2[] = new int[array1.length];
		for (int i = 0; i < array2.length; i++) {
			cont--;
			array2[i] = array1[i];
			System.out.println(cont);
		}

	}

//	static int[] guardaArray1() {
//		int arr[] = new int[100];
//		int cont = 0;
//		for (int i = 0; i < arr.length; i++) {
//			cont++;
//			arr[i] = cont;
//		}
//		return arr;
//	}

//	static int[] guardaArray2() {
//		int arr[] = new int[100];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=i;
//		}
//		return arr;
//	}

//	static void muestraArray(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
}
