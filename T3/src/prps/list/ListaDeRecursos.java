package prps.list;

import java.util.ArrayList;

import prps.interfaces.InterfaceDeListas;
import prps.interfaces.InterfaceDeTela;
import prps.model.Recurso;

public class ListaDeRecursos implements InterfaceDeTela, InterfaceDeListas {
private ArrayList<Recurso> recursos = new ArrayList<Recurso>();
	
	public ListaDeRecursos () {
		this.adiciona("Computador", 20);
		this.adiciona("Computador", 20);
		this.adiciona("Computador", 20);
		this.adiciona("Computador", 20);
		this.adiciona("Servidor", 50);
	}
	
	public void adiciona(String tipo, int custo) {
		Recurso devTest = new Recurso();
		devTest.setTipo(tipo);
		devTest.setCusto(custo);
		
		this.recursos.add(devTest);
	}
	
	public ArrayList<Recurso> listaRecursos() {
		return this.recursos;
	}

	@Override
	public void imprime() {
		for(Recurso recurso: recursos) {
			recurso.imprime();
		}
		
	}
}
