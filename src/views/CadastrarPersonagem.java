package views;

import java.util.Scanner;

import controllers.PersonagemController;
import models.Personagem;


public class CadastrarPersonagem {
	private static Scanner sc = new Scanner(System.in);
	private static Personagem personagem;
	
	public static void renderizar() {
		personagem = new Personagem(null, null, null);
		System.out.println("---Cadastro de Jogador---\n");
		System.out.println("Digite o Nickname");
		personagem.setNickName(sc.nextLine());
		System.out.println("Digite o valor da Defesa do Jogador");
		personagem.setDefesa(sc.nextInt());
		System.out.println("Digite o valor do Ataque do Jogador");
		personagem.setAtaque(sc.nextInt());
		System.out.println("Digite o valor da Esquiva do Jogador");
		personagem.setEsquiva(sc.nextInt());
		System.out.println("Digite o valor da Destreza do Jogador");
		personagem.setDestreza(sc.nextInt());
		if(PersonagemController.cadastrar(personagem)) {
			System.out.println("Jogador cadastrado com sucesso!!!");
			System.out.println("\n".repeat(5));
		}else {
		System.out.println("Cadastro já existe!");
		System.out.println("\n".repeat(15));
	}
  }
	public static Personagem getPersonagem() {
		return personagem;
	}
}
