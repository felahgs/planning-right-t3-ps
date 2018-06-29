package prps.tests;

import prps.controllers.AtividadesController;
import prps.controllers.CronogramaController;
import prps.controllers.EquipeController;
import prps.controllers.OrcamentoController;
import prps.controllers.RecursosController;
import prps.list.ListaDeAtividades;
import prps.list.ListaDeDesenvolvedores;
import prps.list.ListaDeRecursos;
import prps.model.Atividade;
import prps.model.Desenvolvedor;
import prps.model.Recurso;
import prps.model.Projeto;

public class MainTest {

	public static void main(String[] args) {
		Projeto proj = new Projeto();
		ListaDeAtividades atividades = new ListaDeAtividades();
		ListaDeDesenvolvedores desenvolvedores = new ListaDeDesenvolvedores();
		ListaDeRecursos recursos = new ListaDeRecursos();
		
		atividades.adiciona(new Atividade ("Codifica��o", 4));
		atividades.adiciona(new Atividade ("Cria��o de banco", 5));
		atividades.adiciona(new Atividade ("Teste 1", 1));
		atividades.adiciona(new Atividade ("Codifica��o", 4));
		
		desenvolvedores.adiciona(new Desenvolvedor ("Programador", 24, 2));
		desenvolvedores.adiciona(new Desenvolvedor ("BDA", 32, 1));        
		desenvolvedores.adiciona(new Desenvolvedor ("Testador", 19, 5));   
		desenvolvedores.adiciona(new Desenvolvedor ("Projetista", 29, 3)); 
		desenvolvedores.adiciona(new Desenvolvedor ("Analista", 26, 2));   
		
		recursos.adiciona(new Recurso("Servidor", 100));
		recursos.adiciona(new Recurso("PC", 20));
		recursos.adiciona(new Recurso("PC", 20));
		recursos.adiciona(new Recurso("PC", 20));

	
		CronogramaController cronogramaController = new CronogramaController();
		OrcamentoController orcamentoController = new OrcamentoController();
		AtividadesController atividadesController = new AtividadesController();
		EquipeController equipeController = new EquipeController();
		RecursosController recursosController = new RecursosController();
		
		cronogramaController.definirCronograma(proj);
		orcamentoController.definirOrcamento(proj);
		atividadesController.criarListaDeAtividades(proj, atividades);
		equipeController.criarEquipe(proj, desenvolvedores);
		recursosController.alocaRecurso(proj, recursos);
		
//		recursosController.desalocaRecurso(proj, recursos);
//		System.out.println("Os recursos foram desalocados. Recursos dispon�veis:");
//		recursos.imprime();
		
		System.out.println("\n");
		
		System.out.println("Cronograma " + proj.getCronograma() + " dias");
		System.out.println("Orcamento de BCZ$:" + proj.getOrcamento());
		proj.imprimeAtividades();
		proj.imprimeEquipe();
		proj.imprimeRecurso();
	}

}
