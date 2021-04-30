package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Producto;

public class MainProducto {

	public static void main(String[] args) {

		
//		2. Crea un ArrayList.
		List<Producto> listProductos = new ArrayList<>();
		
//		3. Añade las 5 instancias de Producto al ArrayList.
//		1. Crea 5 instancias de la Clase Producto.
		listProductos.add(new Producto ("ordenador", 5));
		listProductos.add(new Producto ("mobiles", 7));
		listProductos.add(new Producto ("televisores", 6));
		listProductos.add(new Producto ("libros", 19));
		listProductos.add(new Producto ("ebook", 32));
		
//		5. Elimina dos elemento del ArrayList.
		listProductos.remove(1);
		listProductos.remove(3);
		
//		6. Inserta un nuevo objeto producto en medio de la lista.
		listProductos.add(1, new Producto ("pañales", 32));

//		8. Elimina todos los valores del ArrayList.
		listProductos.clear();
		
		//Con strems:
//		listProductos
//		.stream()
//		.forEach(System.out::println);
		
//		4. Visualiza el contenido de ArrayList utilizando Iterator.
		Iterator iter = listProductos.iterator();
		
//		7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
		while(iter.hasNext()) {
			System.out.println(iter.next());
			}
	}

}
