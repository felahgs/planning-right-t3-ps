package prps.model;

import java.util.UUID;

/*
 * Cada desenvolvedor tem uma capacidade de produção média dada em atividade/dia e um salário de
 * acordo com sua capacidade. Cada desenvolvedor realiza um unico papel no projeto 
 * (analista, projetista, BD, programador ou testador)
 */
public class Desenvolvedor {
	private UUID id;
	private int salario; //salário de acordo com sua capacidade
	private int capacidade; // capacidade de produção média dada em atividade/dia
	private boolean alocado;
	private String papel; //analista, projetisa, bda, programador, testador
	
	public Desenvolvedor() {
		this.id = UUID.randomUUID();
	}
	
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public UUID getId() {
		return id;
	}

	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public boolean isAlocado() {
		return alocado;
	}
	public void setAlocado(boolean alocado) {
		this.alocado = alocado;
	}
}
