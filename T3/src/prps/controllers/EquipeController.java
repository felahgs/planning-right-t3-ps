package prps.controllers;

import java.util.Scanner;

import prps.list.ListaDeDesenvolvedores;
import prps.model.Desenvolvedor;
import prps.model.Projeto;

public class EquipeController {

	public void criarEquipe(Projeto proj, ListaDeDesenvolvedores list) {
		ListaDeDesenvolvedores desenvolvedoresDisponiveis = list;
		
		this.selecionaEquipe(desenvolvedoresDisponiveis, proj);
		
	}
	
	private void selecionaEquipe(ListaDeDesenvolvedores desenvolvedoresDisponiveis, Projeto proj) {
		int selec;
		Desenvolvedor dev;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Selecione a ID do desenvolvedor a ser adicionado "
				+ "a equipe:\n");
		desenvolvedoresDisponiveis.imprime();
		System.out.println("0) CONFIRMAR"); 
		
		selec = scanner.nextInt() - 1;
		
		if(selec >= 0 && selec < desenvolvedoresDisponiveis.getDesenvolvedores().size()) {

			dev = desenvolvedoresDisponiveis.getDesenvolvedores().remove(selec);
			proj.getDesenvolvedores().add(dev);

			System.out.print("\nAdicionado " );
			dev.imprime();
			this.selecionaEquipe(desenvolvedoresDisponiveis, proj);
		}
	}
}
