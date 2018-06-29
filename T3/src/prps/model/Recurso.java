package prps.model;

import prps.interfaces.InterfaceDeTela;

public class Recurso implements InterfaceDeTela{
	private int custo;
	private String tipo;
	
	public Recurso (String str, int i) {
		this.custo = i;
		this.tipo = str;
	}
	
	public int getCusto() {
		return custo;
	}
	
	public void setCusto(int custo) {
		this.custo = custo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void imprime() {
		System.out.println("Recurso: \"" + this.getTipo() + "\" Custo por ciclo: \"" + this.getCusto() + "\"");
		
	}
}
