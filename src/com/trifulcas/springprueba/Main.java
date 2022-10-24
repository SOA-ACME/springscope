package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir el bean
		Saludos miSaludo = context.getBean("miSaludo", Saludos.class);
		
		// Ejecutar el metodo
		System.out.println(miSaludo.hola());
		
		// Pedir el bean
		Vecino miVecino = context.getBean("miVecino", Vecino.class);
				
		// Ejecutar el metodo
		System.out.println(miVecino.hola());
				
		// Cerrar el contexto
		context.close();
	}

}
