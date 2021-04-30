package model.types;

public enum Genero {

	MUJER('M'), HOMBRE('H');

	private char genero;
	
	private Genero(char value) {
		this.genero=value;
	}

	public char getGenero() {
		return genero;
	}
	
	
}
