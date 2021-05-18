package views;

import java.util.Scanner;

public class MainClass {
	public static void main(String[]args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("---CADASTRO DE PLAYERS E INIMIGOS---\n");
			System.out.println("1 - Goblin Set provisorio");
			System.out.println("2 - Consultar Inimigos Cadastrados Classe Goblin");
			System.out.println("3 - Deletar Inimigo");
			System.out.println("4 - Cadastrar jogador");
			System.out.println("5 - Consultar jogador");
			System.out.println("6 - Deletar jogador");
			System.out.println("7 - Upadate jogador");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada:  ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				CadastrarGoblin.renderizar();
				break;
			case 2:
				ListarGoblin.renderizar();
				break;
			case 3:
				DeletarInimigo.renderizar();
				break;
			case 4:
				CadastrarPersonagem.renderizar();
				break;
			case 5:
				ListarPersonagem.renderizar();
				break;
			case 6:
				DeletarPersonagem.renderizar();
				break;	
			case 7:
				System.out.println("Opção em construção");
				break;
			case 0:
				System.out.println("\nDeslogado com sucesso...\n");
				break;

			default:
				System.out.println("---Opção Invalida...---\n");
				break;
			}
		} while(opcao != 0);
		sc.close();
	}
}
