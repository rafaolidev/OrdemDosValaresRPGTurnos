package views;

import controllers.GoblinController;
import models.Goblin;

public class ListarGoblin {
public static void renderizar(){
		
		System.out.println("\n".repeat(15));
		System.out.println("---Listar Goblin---\n");
		for (Goblin goblinCadastrado : GoblinController.retornarGoblins() ) {
			System.out.println(goblinCadastrado);
			
		}
	}
}
