package desafio.capgemini.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	private Scanner sc;

	public Exercicio1() {
		sc = new Scanner(System.in);
	}

	// "n" é o número de degraus da escada
	public void iniciaExercicio() {
		
		System.out.println("Exercício 1: ");
		System.out.println("Digite o número de degraus: ");
		int n = sc.nextInt();

		// Possuirá a escada desenhada em caracteres
		String escada = "";
	
		
		for (int i = 1; i <= n; i++) {
			
			// Repete pela quantidade de vezes do tamanho da escada menos a quantidade de asteriscos da linha atual
			for (int l = 0; l <= n - i; l++) {
				escada += " ";
			}
			
			// Repete pela quantidade de asteriscos da linha atual
			for (int l = 0; l < i; l++) {
				escada += "*";
			}
			
			escada += "\n";
		}
		
		System.out.println(escada);
	}
}
