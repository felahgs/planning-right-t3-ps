package prps.tests;

import java.util.ArrayList;

import prps.list.ListaDeDesenvolvedores;
import prps.model.Desenvolvedor;

public class TestDesenvolvedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desenvolvedor devTest = new Desenvolvedor(null, 0, 0);
		ListaDeDesenvolvedores devList = new ListaDeDesenvolvedores();
		ArrayList<Desenvolvedor> equipe = new ArrayList<Desenvolvedor>();
		
		devTest.setAlocado(false);
		devTest.setPapel("Analista");
		devTest.setSalario(23);
		devTest.setCapacidade(2);
		
		System.out.println("Testando \"Desenvolvedor.imprime\"");
		devTest.imprime();
		System.out.println("\nTestando \"Desenvolvedores.imprime\"");
		devList.imprime();
		
		System.out.println("\nTestando \"Desenvolvedores.listaDesenvolvedores()\"");
	    equipe = devList.getDesenvolvedores();
		for(Desenvolvedor desenvolvedor: equipe) {
			desenvolvedor.imprime();
		}
	}

}
