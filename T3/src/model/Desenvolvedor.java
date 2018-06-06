package model;

public class Desenvolvedor {
	private Long id;
	private int salario;
	private int capacidade;
	private boolean alocado;
	private String papel;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPapel() {
		return papel;
	}
	public void setPapel(String papel) {
		this.papel = papel;
	}
	public boolean isAlocado() {
		return alocado;
	}
	public void setAlocado(boolean alocado) {
		this.alocado = alocado;
	}
}
