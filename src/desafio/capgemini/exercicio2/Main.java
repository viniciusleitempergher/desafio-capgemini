package desafio.capgemini.exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		String senha = sc.next();
		
		if (senha.length() < 6) {
			// N�mero de caracteres que faltam para a senha possuir 6
			int caracteresFaltando = 6 - senha.length();
			
			System.out.println("A senha n�o possui o m�nimo de caracteres, faltam " + caracteresFaltando + "!");
		} else {
			System.out.println("Sua senha possui o m�nimo de caracteres!");
		}
	}

}
