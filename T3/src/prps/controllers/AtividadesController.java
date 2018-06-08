package prps.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import prps.list.ListaDeAtividades;
import prps.model.Atividade;
import prps.model.Projeto;

public class AtividadesController {
	public void criarListaDeAtividades(Projeto proj, ListaDeAtividades list) {
		ArrayList<Atividade> atividades = new ArrayList<Atividade>();
		Scanner scanner = null;
		
		System.out.println("Selecione a ID da atividade a ser adicionada "
				+ "a lista de atividades do Ciclo atual:\n");
		list.imprime();
	}
}
