package controllers;

import java.util.ArrayList;

import models.Personagem;

public class PersonagemController {
private static ArrayList<Personagem> personagens = new ArrayList<Personagem>();
	
	public static boolean cadastrar(Personagem personagem) {		
				return personagens.add(personagem);
	}
	public static ArrayList<Personagem> retornarPersonagens(){
		return personagens;
	}
	public static Personagem buscarPorNick(String Nick) {
		for(Personagem personagemCadastrado: personagens) {
			if(personagemCadastrado.getNickName().equals(Nick)) {
				return personagemCadastrado;
			}
		}
		return null;
	}
	public static Boolean deletar(String Nick) {
		Personagem personagem = buscarPorNick(Nick);
		if(personagem != null) {
			personagens.remove(personagem);
			return true;
		}
		return false;
	}
}
