package controller;

import model.Semaforo;

public class Admin {

	public static void main(String[] args) {

		Semaforo s = new Semaforo();

		s.comportamiento("ambar");
		s.comportamiento("rojo");
		s.comportamiento("verde");
	
	}
	

}
