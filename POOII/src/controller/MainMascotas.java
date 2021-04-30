package controller;

import java.util.GregorianCalendar;

import model.Canario;
import model.Gato;
import model.Loro;
import model.Perro;

public class MainMascotas {

	public static void main(String[] args) {

		InventarioMascotas inventario = new InventarioMascotas();
//		inventario.inventarioTotal();	
//		System.out.println();
//		inventario.tipoNombre();
//		System.out.println();
//		inventario.inventarioConcreto();
	
		inventario.getMascotas().add(new Perro("Pepe", 3, true, new GregorianCalendar(2018, 7 - 1, 3), "labrador", 54125));
		inventario.getMascotas().add(new Gato("Michumichu", 0, true, new GregorianCalendar(2018, 7, 3), null, false));
		inventario.getMascotas().add(new Loro("Ale", 0, true, new GregorianCalendar(2018, 7, 3), null, false, null, false));
		inventario.getMascotas().add(new Canario("George", 0, true, new GregorianCalendar(2018, 7, 3), null, false, null, false));
		inventario.getMascotas().add(new Perro("Pepe", 3, true, new GregorianCalendar(2018, 7 - 1, 3), "labrador", 54125));

		
		inventario.getMascotas();
		inventario.tipoNombre();
		System.out.println();
		inventario.inventarioTotal();	
		System.out.println();
		inventario.inventarioConcreto();//metodo que utiliza un metodo abstracto
		
		inventario.getMascotas().remove(0);
		System.out.println("--------- Despues de eliminar el primer elemento: ------------");
		inventario.getMascotas();
		inventario.tipoNombre();
		System.out.println();
		inventario.inventarioTotal();	
		System.out.println();
		inventario.inventarioConcreto();
		
		inventario.getMascotas().clear();
		System.out.println("--------- Despues de vaciar los elementos: ------------");
		inventario.getMascotas();
		inventario.tipoNombre();
		System.out.println();
		inventario.inventarioTotal();	
		System.out.println();
		inventario.inventarioConcreto();
		


		
	
	}
}