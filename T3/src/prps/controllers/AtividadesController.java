package prps.controllers;

import java.util.Scanner;

import prps.list.ListaDeAtividades;
import prps.model.Atividade;
import prps.model.Projeto;

public class AtividadesController {
	public void criarListaDeAtividades(Projeto proj, ListaDeAtividades list) {
		ListaDeAtividades atividadesDisponiveis = list;
		
		this.selecionaAtividade(atividadesDisponiveis, proj);
		
	}
	
	private void selecionaAtividade(ListaDeAtividades atividadesDisponiveis, Projeto proj) {
		int selec;
		Atividade atv;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Selecione a ID da atividade a ser adicionada "
				+ "a lista de atividades do Ciclo atual:\n");
		atividadesDisponiveis.imprime();
		System.out.println("0) CONFIRMAR"); 
		
		selec = scanner.nextInt() - 1;
		
		if(selec >= 0 && selec < atividadesDisponiveis.getAtividades().size()) {

			atv = atividadesDisponiveis.getAtividades().remove(selec);
			proj.getAtividades().add(atv);

			System.out.print("\nAdicionada " );
			atv.imprime();
			this.selecionaAtividade(atividadesDisponiveis, proj);
		}
	}
}
