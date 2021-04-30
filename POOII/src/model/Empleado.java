package model;

public class Empleado {
	private String nombre;
	private String dni;
	private float sueldoBruto;
	private int edad;
	private int telefono;
	private String direccion;

	public Empleado(String nombre, String dni, float sueldoBruto) {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldoBruto = sueldoBruto;
	}

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int teléfono) {
		this.telefono = teléfono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float sueldoNetoMes() {
		float result = 0;
		float sueldoBrutoA;
		sueldoBrutoA = getSueldoBruto() * 12;

		if (sueldoBrutoA < 12000) {
//			20%
			result = getSueldoBruto() - (getSueldoBruto() * 0.2f);
		} else if (sueldoBrutoA >= 12000 && sueldoBrutoA <= 25000) {
//			30%
			result = getSueldoBruto() - (getSueldoBruto() * 0.3f);
		} else {
//			40%
			result = getSueldoBruto() - (getSueldoBruto() * 0.4f);
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + Float.floatToIntBits(sueldoBruto);
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
		Empleado other = (Empleado) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Float.floatToIntBits(sueldoBruto) != Float.floatToIntBits(other.sueldoBruto))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado [sueldoBruto=" + sueldoBruto + ", Nombre=" + nombre + ", DNI=" + dni + "]";
	}
}