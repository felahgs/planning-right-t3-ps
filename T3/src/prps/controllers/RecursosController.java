package prps.controllers;

import java.util.ArrayList;
import java.util.Scanner;

import prps.list.ListaDeRecursos;
import prps.model.Projeto;
import prps.model.Recurso;


public class RecursosController {
	public void alocaRecurso(Projeto proj, ListaDeRecursos list) {
		ListaDeRecursos atividadesDisponiveis = list;
		
		this.selecionaRecursos(atividadesDisponiveis, proj);
		
	};
	
	public void desalocaRecurso(Projeto proj, ListaDeRecursos list) {
		ArrayList<Recurso> recursos = new ArrayList<Recurso>();
		recursos = proj.getRecursos();
		
		int count = 0;
		Recurso rec;
		
		for(Recurso recurso: recursos) {
			list.adiciona(recurso);
		}
		
		proj.getRecursos().clear();
	}
	
	private void selecionaRecursos(ListaDeRecursos recrusosDisponiveis, Projeto proj) {
		int selec;
		Recurso rec;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Selecione o recurso a ser utilizado "
				+ "no Ciclo atual do projeto:\n");
		recrusosDisponiveis.imprime();
		System.out.println("0) CONFIRMAR"); 
		
		selec = scanner.nextInt() - 1;
		
		if(selec >= 0 && selec < recrusosDisponiveis.getRecursos().size()) {

			rec = recrusosDisponiveis.getRecursos().remove(selec);
			proj.getRecursos().add(rec);

			System.out.print("\nAlocado " );
			rec.imprime();
			this.selecionaRecursos(recrusosDisponiveis, proj);
		}
	}
}
