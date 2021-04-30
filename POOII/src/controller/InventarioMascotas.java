package controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import model.Canario;
import model.Gato;
import model.Loro;
import model.Mascotas;
import model.Perro;

public class InventarioMascotas {

	private ArrayList<Mascotas> mascotas = new ArrayList<>();
	
	public InventarioMascotas() {
		
	}
	
	public InventarioMascotas(ArrayList<Mascotas> mascotas) {
		this.mascotas=mascotas;
	}

	public ArrayList<Mascotas> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascotas> mascotas) {
		this.mascotas = mascotas;
	}

//	public void rellenaMascotas() {
//		mascotas.add(new Perro("Pepe", 3, true, new GregorianCalendar(2018, 7 - 1, 3), "labrador", 54125));
//		mascotas.add(new Gato("Michumichu", 0, true, new GregorianCalendar(2018, 7, 3), null, false));
//		mascotas.add(new Loro("Ale", 0, true, new GregorianCalendar(2018, 7, 3), null, false, null, false));
//		mascotas.add(new Canario("George", 0, true, new GregorianCalendar(2018, 7, 3), null, false, null, false));
//	}

	public void inventarioTotal() {
//		rellenaMascotas();
//		getMascotas();
		for (int i = 0; i < mascotas.size(); i++) {
			System.out.println(mascotas.get(i).toString());
		}
	}

	public void tipoNombre() {
		int i = 0;
		while (mascotas.size() != i) {
			if (mascotas.get(i) instanceof Perro) {
				System.out.println("Tipo de mascota Perro" + ", el nombre es " + mascotas.get(i).getNombre());
			} else if (mascotas.get(i) instanceof Gato) {
				System.out.println("Tipo de mascota Gato" + ", el nombre es " + mascotas.get(i).getNombre());
			} else if (mascotas.get(i) instanceof Loro) {
				System.out.println("Tipo de mascota Loro" + ", el nombre es " + mascotas.get(i).getNombre());
			} else if (mascotas.get(i) instanceof Canario) {
				System.out.println("Tipo de mascota Canario" + ", el nombre es " + mascotas.get(i).getNombre());
			}
			i++;
		}
	}

	public void inventarioConcreto() {
		for (int i = 0; i < mascotas.size(); i++) {
			System.out.println(mascotas.get(i).muestra());
		}
	}

}