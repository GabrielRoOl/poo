package br.edu.iesb.poo2024.devlab7.padroesProjeto.singleton;

public class RecursoCompartilhadoSingleton {

	private static RecursoCompartilhadoSingleton instance;

	// Construtor padrão privado.
	private RecursoCompartilhadoSingleton() {
	}

	public static RecursoCompartilhadoSingleton getInstance() {

		if (instance == null) {
			instance = new RecursoCompartilhadoSingleton();
		}
		
		return instance;
	}

}
