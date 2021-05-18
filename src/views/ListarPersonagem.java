package views;

import controllers.PersonagemController;
import models.Personagem;

public class ListarPersonagem {
public static void renderizar(){
		
		System.out.println("\n".repeat(15));
		System.out.println("---Listar Jogadores---\n");
		for (Personagem personagemCadastrado : PersonagemController.retornarPersonagens() ) {
			System.out.println(personagemCadastrado);
			
		}
	}
}
