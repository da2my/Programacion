package controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//import java.util.Tre reSet;//SI QUEREMOS QUE LOS ELEMENTOS SEAN ORDENADOS USAREMOS TreeSet

import model.Empleado;
import model.Empresa;

public class MainEmpresa {

//	Voy a usar una coleccion HashSet para que ningun elemento se repita
	Set<Empresa> listEmpresas = new HashSet<>();

	public MainEmpresa() {

	}

	public MainEmpresa(Set<Empresa> listEmpresas) {

	}

	public Set<Empresa> getListEmpresas() {
		return listEmpresas;
	}

	public void setListEmpresas(Set<Empresa> listEmpresas) {
		this.listEmpresas = listEmpresas;
	}

	void muestraEmpresasEmpleados() {
		// USANDO ITERATOR
		Iterator<Empresa> iterador = listEmpresas.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		// USANDO FOREACH
//		for (Empresa empresa : listEmpresas) {
//			System.out.println(empresa.toString());
//		}
	}

	public float calcSueldoBrutoTotal() {
		HashSet<Empleado> emp;
		float resultado = 0;
		for (Empresa empresa : listEmpresas) {
			emp = empresa.getEmpleados();
			for (Empleado empleados : emp) {
				resultado += empleados.getSueldoBruto();
			}
		}
		return resultado;
	}

	public float calcSueldoNetoTotal() {
		HashSet<Empleado> emp;
		float resultado = 0;
		for (Empresa empresa : listEmpresas) {
			emp = empresa.getEmpleados();
			for (Empleado empleados : emp) {
				resultado += empleados.sueldoNetoMes();
			}
		}
		return resultado;
	}

	public static void main(String[] args) {

//		Empleados de una empresa en concreto
		Set<Empleado> mercadonaSalamanca = new HashSet<>();// No admite duplicados pero cuidado con la gestion porque //
															// julia se esta repitiendo. Gestionar con equals() y //
															// hashCode() SIMPLEMENTE HAY QUE GENERARLOS
		// Añadiendo empleados:
		mercadonaSalamanca.add(new Empleado("Julia", "57222369j", 1600));
		mercadonaSalamanca.add(new Empleado("Axel", "57982369t", 1600));
		mercadonaSalamanca.add(new Empleado("Raul", "57823469j", 1400));
//		mercadonaSalamanca.add(new Empleado("Julia", "57852369j", 1600));//repetido si lo descomento no se añadira a la coleccion
		// Eliminando empleados:
		mercadonaSalamanca.remove(new Empleado("Julia", "57852369j", 1600));

//		Mostrar por pantalla el DNI, sueldo bruto y neto de todos los empleados:
		for (Empleado empleado : mercadonaSalamanca) {
			System.out.println("Dni: " + empleado.getDni() + " Sueldo Bruto: " + empleado.getSueldoBruto()
					+ " Sueldo Neto: " + empleado.sueldoNetoMes());
		}

//		Empleados de una empresa en concreto
		Set<Empleado> mercadonaVallecas = new HashSet<>();
		mercadonaVallecas.add(new Empleado("Arthur", "57852369j", 1200));
		mercadonaVallecas.add(new Empleado("Luis", "57823469j", 1100));

//		Mostrar por pantalla el DNI, sueldo bruto y neto de todos los empleados:
		for (Empleado empleado : mercadonaVallecas) {
			System.out.println("Dni: " + empleado.getDni() + " Sueldo Bruto: " + empleado.getSueldoBruto()
					+ " Sueldo Neto: " + empleado.sueldoNetoMes());
		}

		// Coleccion de Empresas
		MainEmpresa tiendasMercadona = new MainEmpresa();
//		tiendasMercadona.getListEmpresas().add(new Empresa("Mercadona Vallecas", "34635VDF345", 912548793,
//				"Calle Puente #87", (HashSet<Empleado>) mercadonaVallecas));
		tiendasMercadona.getListEmpresas().add(new Empresa("Mercadona Salamanca", "34635VDF345", 912548793,
				"Calle Salamanca #3", (HashSet<Empleado>) mercadonaSalamanca));
		tiendasMercadona.getListEmpresas().add(new Empresa("Mercadona Vallecas", "34635VDF345", 912548793,
				"Calle Puente #87", (HashSet<Empleado>) mercadonaVallecas));

		// Muestra la lista de empleados y de empresas
		tiendasMercadona.muestraEmpresasEmpleados();

		System.out.println("\n" + "\n");
//		Calcular la suma total de sueldos brutos de todos los empleados.
		System.out.println("Total de sueldos brutos: " + tiendasMercadona.calcSueldoBrutoTotal());
//		Calcular la suma total de sueldos netos de todos los empleados.
		System.out.println("Total de sueldos netos: " + tiendasMercadona.calcSueldoNetoTotal());

	}
}
