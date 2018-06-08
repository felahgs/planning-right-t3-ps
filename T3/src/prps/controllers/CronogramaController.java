package prps.controllers;

import java.util.Scanner;

import prps.model.Projeto;

public class CronogramaController {
	public void definirCronograma(Projeto proj) {
		Scanner scanner = null;
		int tempo;
		
		System.out.println("\nEntre com o tempo do cronograma em dias:");	
	    scanner = new Scanner(System.in);
		tempo = scanner.nextInt();
		proj.setCronograma(tempo);
		
		System.out.println("Cronograma definido para " + proj.getCronograma() + " dias\n");
		
	}
}
