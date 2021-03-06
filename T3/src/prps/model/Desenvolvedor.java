package prps.model;

import java.util.UUID;

import prps.interfaces.InterfaceDeTela;

/*
 * Cada desenvolvedor tem uma capacidade de produ��o m�dia dada em atividade/dia e um sal�rio de
 * acordo com sua capacidade. Cada desenvolvedor realiza um unico papel no projeto 
 * (analista, projetista, BD, programador ou testador)
 */
public class Desenvolvedor implements InterfaceDeTela{
	private UUID id;
	private int salario; //sal�rio de acordo com sua capacidade
	private int capacidade; // capacidade de produ��o m�dia dada em atividade/dia
	private boolean alocado;
	private String papel; //analista, projetisa, bda, programador, testador
	
	public Desenvolvedor(String string, int i, int j) {
		this.id = UUID.randomUUID();
		this.papel = string;
		this.salario = i; 
		this.capacidade = j;
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

	@Override
	public void imprime() {
		System.out.println("Desenvolvedor: \"" + this.getPapel() 
       	+ "\" Custo/Hora: \"" + this.getSalario() + "\" Capacidade de produ��o: \"" 
    		   + this.getCapacidade() + " atividades por dia\"");// TODO Auto-generated method stu
	}
}
