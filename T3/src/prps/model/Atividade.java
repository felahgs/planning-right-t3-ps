package prps.model;

import prps.interfaces.InterfaceDeTela;

public class Atividade implements InterfaceDeTela{
	private String descricao;
	private int duracao;
	
	public Atividade(String string, int i) {
		this.descricao = string;
		this.duracao = i;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public void imprime() {
		System.out.println("Atividade:\"" + this.getDescricao() + "\" Duração:\"" 
				+ this.getDuracao() + " dias\"");
	}
}
