package prps.list;

import java.util.ArrayList;

import prps.interfaces.InterfaceDeListas;
import prps.interfaces.InterfaceDeTela;
import prps.model.Atividade;
import prps.model.Desenvolvedor;

public class ListaDeDesenvolvedores implements InterfaceDeTela, InterfaceDeListas {
	private ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<Desenvolvedor>();
	
	
	public void adiciona(Desenvolvedor desenvolvedor) {
		this.desenvolvedores.add(desenvolvedor);
	}
	
	public void remove(int id) {
		this.desenvolvedores.remove(id);
	}
	
	public ArrayList<Desenvolvedor> getDesenvolvedores() {
		return this.desenvolvedores;
	}

	@Override
	public void imprime() {
		
		int count = 1;
		for(Desenvolvedor desenvolvedor: desenvolvedores) {
			System.out.print(count + ") ");

			desenvolvedor.imprime();
			count++;

		}
		
	}
}
