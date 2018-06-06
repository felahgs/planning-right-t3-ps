package prps.list;

import java.util.ArrayList;

import prps.model.Desenvolvedor;

public class Desenvolvedores {
	private ArrayList<Desenvolvedor> desenvolvedores;
	
	public Desenvolvedores () {
		this.adicionaDesenvolvedor("Programador", 24, 2);
		this.adicionaDesenvolvedor("BDA", 32, 1);
		this.adicionaDesenvolvedor("Testador", 19, 5);
		this.adicionaDesenvolvedor("Projetista", 29, 3);
		this.adicionaDesenvolvedor("Analista", 26, 2);
	}
	
	public void adicionaDesenvolvedor(String papel, int salario, int capacidade) {
		Desenvolvedor devTest = new Desenvolvedor();
		devTest.setAlocado(false);
		devTest.setPapel(papel);
		devTest.setSalario(salario);
		devTest.setCapacidade(capacidade);
		
		this.desenvolvedores.add(devTest);
	}
}
