package controller;

import model.Animal;

public class MainAnimal {

	public static void main(String[] args) {

        Animal mascota1 = new Animal("koki", "chiguagua");
        mascota1.setEdad(3);
        System.out.println("El nombre es: " + mascota1.getNombre());
        System.out.println(" y tiene " + mascota1.getEdad() + " años");
        System.out.println(mascota1.getNombre().equals(mascota1));
        Animal mascota2 = new Animal();
        mascota2.getNombre();
	}

}
