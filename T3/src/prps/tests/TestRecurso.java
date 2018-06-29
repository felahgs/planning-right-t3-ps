package prps.tests;

import prps.list.ListaDeRecursos;
import prps.model.Recurso;

public class TestRecurso {
	public static void main(String[] args) {
		Recurso recurso = new Recurso(null, 0);
		ListaDeRecursos recList = new ListaDeRecursos();
		recurso.setCusto(3000);
		recurso.setTipo("Servidor");
					
		System.out.println("Testando \"Recurso.imprime\"");
		recurso.imprime();
		System.out.println("\nTestando \"Desenvolvedores.imprime\"");
		recList.imprime();
		
		System.out.println("\nTestando \"Desenvolvedores.listaDesenvolvedores()\"");
	}
}
