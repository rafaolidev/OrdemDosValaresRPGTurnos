package views;
import java.util.Scanner;

import controllers.GoblinController;
public class DeletarInimigo {
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\nInsira o nome da criatura que quer deletar: ");
		if(GoblinController.deletar(sc.next())) {
			System.out.println("\n Criatura deletada!!");
		}
		else 
			System.out.println("\nNenhum dado encontrado");
	}
}
