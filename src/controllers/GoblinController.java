package controllers;

import java.util.ArrayList;
import models.Goblin;

public class GoblinController {
	
	private static ArrayList<Goblin> goblins = new ArrayList<Goblin>();
	
	public static boolean cadastrar(Goblin goblin) {		
				return goblins.add(goblin);
	}
	public static ArrayList<Goblin> retornarGoblins(){
		return goblins;
	}
	public static Goblin buscarPorNome(String Nome) {
		for(Goblin goblinCadastrado: goblins) {
			if(goblinCadastrado.getNome().equals(Nome)) {
				return goblinCadastrado;
			}
		}
		return null;
	}
	public static Boolean deletar(String nome) {
		Goblin goblin = buscarPorNome(nome);
		if(goblin != null) {
			goblins.remove(goblin);
			return true;
		}
		return false;
	}
}
