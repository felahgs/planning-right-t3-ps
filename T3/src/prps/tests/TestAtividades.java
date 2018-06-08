package prps.tests;

import prps.list.ListaDeAtividades;

public class TestAtividades {
	public static void main(String[] args) {
		ListaDeAtividades atividades = new ListaDeAtividades();		

		System.out.println("\nTestando \"Atividades.imprime\"");
		System.out.println("Total de Atividades Listadas: \"" 
				+ atividades.getAtividades().size() + "\"\n");
		atividades.imprime();

	}
}
