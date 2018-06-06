package prps.list;

import java.util.ArrayList;

import prps.model.Desenvolvedor;

public class Equipe {
	private ArrayList<Desenvolvedor> desenvolvedores;
	
	public Desenvolvedor addMembro(Desenvolvedor dev) {
		this.desenvolvedores.add(dev);
		return dev;
	}
}
