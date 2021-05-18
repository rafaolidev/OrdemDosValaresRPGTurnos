package views;

import java.util.Scanner;

import controllers.GoblinController;
import models.Goblin;

public class CadastrarGoblin {
	private static Scanner sc = new Scanner(System.in);
	private static Goblin goblin;
	
	public static void renderizar() {
		goblin = new Goblin(null, null, null);
		System.out.println("---Cadastro de Goblins---\n");
		System.out.println("Digite o tipo de Inimigo");
		goblin.setNome(sc.nextLine());
		System.out.println("Digite o valor da Vida do Goblin");
		goblin.setVida(sc.nextInt());
		System.out.println("Digite o valor da Defesa do Goblin");
		goblin.setDefesa(sc.nextInt());
		System.out.println("Digite o valor do Ataque do Goblin");
		goblin.setAtaque(sc.nextInt());
		System.out.println("Digite o valor da Esquiva do Goblin");
		goblin.setEsquiva(sc.nextInt());
		System.out.println("Digite o valor da Destreza do Goblin");
		goblin.setDestreza(sc.nextInt());
		System.out.println("Digite a quantidade de outro que o goblin dropa");
		goblin.setGold(sc.nextInt());
		System.out.println("Digite a experiencia adquirida ao vencer o goblin");
		goblin.setXp(sc.nextInt());
		if(GoblinController.cadastrar(goblin)) {
			System.out.println("Criatura Cadastrado com sucesso!!!");
			System.out.println("\n".repeat(15));
		}else {
		System.out.println("Cadastro já existe!");
		System.out.println("\n".repeat(15));
	}
  }
	public static Goblin getGoblin() {
		return goblin;
	}
}
