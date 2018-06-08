package prps.list;

import java.util.ArrayList;

import prps.interfaces.InterfaceDeListas;
import prps.interfaces.InterfaceDeTela;
import prps.model.Atividade;

public class ListaDeAtividades implements InterfaceDeTela, InterfaceDeListas {
	private ArrayList<Atividade> atividades = new ArrayList<Atividade>();
	
	public ListaDeAtividades () {
		this.adiciona("Codificação", 4);
		this.adiciona("Criação de banco", 5);
		this.adiciona("Teste 1", 1);

	}
	
	public void adiciona(String descricao, int duracao) {
		Atividade atvTest = new Atividade();
		atvTest.setDescricao(descricao);
		atvTest.setDuracao(duracao);

		
		this.atividades.add(atvTest);
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
