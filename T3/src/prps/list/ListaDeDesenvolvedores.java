package prps.list;

import java.util.ArrayList;

import prps.interfaces.InterfaceDeListas;
import prps.interfaces.InterfaceDeTela;
import prps.model.Desenvolvedor;

public class ListaDeDesenvolvedores implements InterfaceDeTela, InterfaceDeListas {
	private ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
	
	public ListaDeDesenvolvedores () {
		this.adiciona("Programador", 24, 2);
		this.adiciona("BDA", 32, 1);
		this.adiciona("Testador", 19, 5);
		this.adiciona("Projetista", 29, 3);
		this.adiciona("Analista", 26, 2);
	}
	
	public void adiciona(String papel, int salario, int capacidade) {
		Desenvolvedor devTest = new Desenvolvedor();
		devTest.setAlocado(false);
		devTest.setPapel(papel);
		devTest.setSalario(salario);
		devTest.setCapacidade(capacidade);
		
		this.desenvolvedores.add(devTest);
	}
	
	public ArrayList<Desenvolvedor> listaDesenvolvedores() {
		return this.desenvolvedores;
	}

	@Override
	public void imprime() {
		for(Desenvolvedor desenvolvedor: desenvolvedores) {
			desenvolvedor.imprime();
		}
		
	}
}
