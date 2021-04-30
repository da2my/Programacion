package controller;

import java.util.ArrayList;

import model.Vehiculo;

public class InventarioVehiculos {
	
	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	
	public InventarioVehiculos() {

	}
	
	public InventarioVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public void mostrarInventario() {
		for (Vehiculo v : vehiculos) {
			System.out.println(v.imprimir());
		}
	}

}
