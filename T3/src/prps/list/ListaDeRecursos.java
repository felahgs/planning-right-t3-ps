package prps.list;

import java.util.ArrayList;

import prps.interfaces.InterfaceDeListas;
import prps.interfaces.InterfaceDeTela;
import prps.model.Recurso;

public class ListaDeRecursos implements InterfaceDeTela, InterfaceDeListas {
private ArrayList<Recurso> recursos = new ArrayList<Recurso>();
	

	
	public void adiciona(Recurso recurso) {
		this.recursos.add(recurso);
	}
	
	public void remove(int id) {
		this.recursos.remove(id);
	}
	
	public ArrayList<Recurso> getRecursos() {
		return this.recursos;
	}

	@Override
	public void imprime() {
		
		int count = 1;
		for(Recurso recurso: recursos) {
			System.out.print(count + ") ");

			recurso.imprime();
			count++;

		}
		
	}
}
