package desafio.capgemini.exercicios;

import java.util.Scanner;

import desafio.capgemini.exercicio1.Exercicio1;
import desafio.capgemini.exercicio2.Exercicio2;
import desafio.capgemini.exercicio3.Exercicio3;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	static void testarExercicio1() {
		System.out.println("Exercício 1: ");
		System.out.println("Digite o número de degraus: ");
		Exercicio1 exercicio = new Exercicio1(sc.nextInt());
	}
	
	static void testarExercicio2() {
		System.out.println("Exercício 2: ");
		System.out.println("Digite a senha: ");
		Exercicio2 exercicio = new Exercicio2(sc.next());
	}
	
	static void testarExercicio3() {
		System.out.println("Exercício 3: ");
		System.out.println("Digite uma palavra: ");
		Exercicio3 exercicio = new Exercicio3(sc.next());
	}
}
