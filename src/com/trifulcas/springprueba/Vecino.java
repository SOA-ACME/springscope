package com.trifulcas.springprueba;

public class Vecino {
	private ISaludo _saludo;
	
	public void setSaludo(ISaludo miSaludo) {
		_saludo=miSaludo;
	}
	public String hola() {
		return _saludo.hola();
	}
	
	public String adios() {
		return _saludo.adios();
	}
}
