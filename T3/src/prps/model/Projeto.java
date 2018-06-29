package prps.model;

import java.util.ArrayList;

public class Projeto {
	private int orcamento;
	private int capital;
	private int cronograma;
	private ArrayList<Atividade> atividades = new ArrayList<Atividade>();
	private ArrayList<Recurso> recursos = new ArrayList<Recurso>();
	private ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();

	

	
	public void imprimeRecurso() {
		System.out.println("Recursos do Projeto");
		int count = 1;
		for(Recurso rec: recursos) {
			System.out.print(count + ") ");
			rec.imprime();
			
			count++;
		}
	}
	
	public void imprimeAtividades() {
		System.out.println("Atividades do Projeto");
		int count = 1;
		for(Atividade atv: atividades) {
			System.out.print(count + ") ");
			atv.imprime();
			
			count++;
		}
	}
	
	public void imprimeEquipe() {
		System.out.println("Equipe do Projeto");
		int count = 1;
		for(Desenvolvedor dev: desenvolvedores) {
			System.out.print(count + ") ");
			dev.imprime();
			
			count++;
		}
	}
	
	public int getOrcamento() {
		return orcamento;
	}
	
	public void setOrcamento(int orcamento) {
		this.orcamento = orcamento;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	public int getCronograma() {
		return cronograma;
	}
	
	public void setCronograma(int cronograma) {
		this.cronograma = cronograma;
	}

	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(ArrayList<Atividade> atividades) {
		this.atividades = atividades;
	}

	public ArrayList<Recurso> getRecursos() {
		return recursos;
	}

	public void setRecursos(ArrayList<Recurso> recursos) {
		this.recursos = recursos;
	}

	public ArrayList<Desenvolvedor> getDesenvolvedores() {
		return desenvolvedores;
	}

	public void setDesenvolvedores(ArrayList<Desenvolvedor> desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	} 
}
