package prps.controllers;

import java.util.Scanner;

import prps.model.Projeto;

public class OrcamentoController {
	public void definirOrcamento(Projeto proj) {
		Scanner scanner = null;
		int valor;
		
		System.out.println("\nEntre com o valor do or�amento em BCZ$:");	
	    scanner = new Scanner(System.in);
		valor = scanner.nextInt();
		proj.setOrcamento(valor);
		
		System.out.println("Ora�maneto definido com o valor de  BCZ$:" + proj.getOrcamento() + ",00\n");
		
	}
}
