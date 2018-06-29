package prps.list;

import java.util.ArrayList;

import prps.interfaces.InterfaceDeListas;
import prps.interfaces.InterfaceDeTela;
import prps.model.Atividade;

public class ListaDeAtividades implements InterfaceDeTela, InterfaceDeListas {
	private ArrayList<Atividade> atividades = new ArrayList<Atividade>();
	

	public void adiciona(Atividade atividade) {
		this.atividades.add(atividade);
	}
	
	public void remove(int id) {
		this.atividades.remove(id);
	}
	
	public ArrayList<Atividade> getAtividades() {
		return this.atividades;
	}

	@Override
	public void imprime() {
		
		int count = 1;
		for(Atividade desenvolvedor: atividades) {
			System.out.print(count + ") ");
			desenvolvedor.imprime();
			
			count++;
		}
		
	}
}
