package model;

import java.util.HashSet;

public class Empresa {

	private static String nombre;
	private static String cif;
	private int telefono;
	private String direccion;
	private HashSet<Empleado> empleados;

	public Empresa(String nombre, String cif, int telefono, String direccion, HashSet<Empleado> empleados) {
		Empresa.nombre = nombre;
		Empresa.cif = cif;
		this.telefono = telefono;
		this.direccion = direccion;
		this.empleados = empleados;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Empresa.nombre = nombre;
	}

	public static String getCif() {
		return cif;
	}

	public static void setCif(String cif) {
		Empresa.cif = cif;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public HashSet<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(HashSet<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((empleados == null) ? 0 : empleados.hashCode());
		result = prime * result + telefono;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (empleados == null) {
			if (other.empleados != null)
				return false;
		} else if (!empleados.equals(other.empleados))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [telefono=" + telefono + ", direccion=" + direccion + ", empleados=" + empleados + "]";
	}
}