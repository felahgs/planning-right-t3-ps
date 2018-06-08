package prps.tests;

import prps.controllers.AtividadesController;
import prps.controllers.CronogramaController;
import prps.controllers.OrcamentoController;
import prps.list.ListaDeAtividades;
import prps.model.Projeto;

public class TestControllers {

	public static void main(String[] args) {
		Projeto proj = new Projeto();
		ListaDeAtividades atividades = new ListaDeAtividades();
		
		CronogramaController cronogramaController = new CronogramaController();
		OrcamentoController orcamentoController = new OrcamentoController();
		AtividadesController atividadesController = new AtividadesController();
		
//		cronogramaController.definirCronograma(proj);
//		orcamentoController.definirOrcamento(proj);
		atividadesController.criarListaDeAtividades(proj, atividades);

	}

}
