package desafio.capgemini.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	Scanner sc;

	public Exercicio2() {
		sc = new Scanner(System.in);
	}

	public void iniciaExercicio() {
		System.out.println("Exercício 2: ");
		System.out.println("Digite uma senha: ");

		String senha = sc.next();

		if (senha.length() < 6) {
			// Número de caracteres que faltam para a senha possuir 6
			int caracteresFaltando = 6 - senha.length();
			
			System.out.println("A senha não possui o mínimo de caracteres, faltam " + caracteresFaltando + "!");
		} else {
			System.out.println("Sua senha possui o mínimo de caracteres!");
		}
	}

}
