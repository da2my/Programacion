package vectores.ejerciciosA;

public class Ejercicio_05 {

	public static void main(String[] args) {
		muestraArray(guardaArray());
	}

	static int[] guardaArray() {
		int num = 0;
		int arr[] = new int[20];
		for (int i = 0; i < arr.length; i++) {
			num = (int) (Math.random() * 100);
			arr[i] = num;
		}
		return arr;
	}

	static void muestraArray(int[] arr) {
		double sum=0;
		double media = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			media=sum/arr.length;
			System.out.println(arr[i]);
		}
		System.out.println("La media de estos numeros es: "+media);
		
	}

}
