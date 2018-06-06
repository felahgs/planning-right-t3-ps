package prps.tests;

import prps.model.Desenvolvedor;

public class TestDesenvolvedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desenvolvedor devTest = new Desenvolvedor();
		devTest.setAlocado(false);
		devTest.setPapel("Analista");
		devTest.setSalario(23);
		devTest.setCapacidade(2);
		
	       System.out.println("Desenvolvedor: \"" + devTest.getPapel() 
	       	+ "\" Custo/Hora: \"" + devTest.getSalario() + "\" Capacidade de produção: \"" 
	    		   + devTest.getCapacidade() + " atividades por dia\"");
	       
	       //TODO Testar Desenvolvedores
	}

}
