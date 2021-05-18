package views;

import java.util.Scanner;

import controllers.PersonagemController;


public class DeletarPersonagem {
private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\nInsira o Nickname do jogador para deletar: ");
		if(PersonagemController.deletar(sc.next())) {
			System.out.println("\n Jogador Deletado!!");
		}
		else 
			System.out.println("\nNenhum dado encontrado");
	}
}
