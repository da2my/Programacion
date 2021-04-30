package controller;

import model.Avion;
import model.Barco;
import model.Coche;
import model.Helicoptero;
import model.Moto;
import model.Submarino;

public class MainVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InventarioVehiculos inventario = new InventarioVehiculos();
		inventario.getVehiculos().add(new Coche("5733fw", "RIO", 4, true));
		inventario.getVehiculos().add(new Moto("9281RTY", "Aprilia", 2, null));
		inventario.getVehiculos().add(new Barco("34EIRUTOWPOW", "Princess", 5.5f, true));
		inventario.getVehiculos().add(new Submarino("TRUSDGT9484", "DeepFlight", 6.7f, 869));
		inventario.getVehiculos().add(new Avion("REIT523467", "Boeing777", 500, 18));
		inventario.getVehiculos().add(new Helicoptero("OWETSD", "Bell525", 16, 4));
		
		inventario.mostrarInventario();
		
	}

}
