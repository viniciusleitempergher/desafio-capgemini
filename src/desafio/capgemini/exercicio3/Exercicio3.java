package desafio.capgemini.exercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

	Scanner sc;

	public Exercicio3() {
		sc = new Scanner(System.in);
	}

	public void iniciaExercicio() {
		System.out.println("Exercício 3: ");
		System.out.println("Digite uma palavra: ");
		String palavra = sc.next();

		int contadorAnagramas = 0;
		
		// Este loop se repetirá pela quantidade de letras na palavra - 1
		for (int i = palavra.length() - 1; i > 0; i--) {
			
			// Lista de substrings para validar se são anagramas:
			ArrayList<String> possiveisAnagramas = new ArrayList<String>();
			
			// Este loop se repete na quantidade de vezes em que o número "i" cabe na palavra
			for (int l = 0; l <= palavra.length() - i; l++) {
				String possivelAnagrama = palavra.substring(l, l + i);
				
				possiveisAnagramas.add(possivelAnagrama);
			}
			
			// Este loop se repete o número de vezes do tamanho do array de substrings 
			for (int l = 0; l < possiveisAnagramas.size(); l++) {
				// Este loop se repete o número de vezes to tamanho do array de substrings, porém começando do final
				for (int k = possiveisAnagramas.size(); k > l; k--) {
					if (verificaAnagrama(possiveisAnagramas.get(l), possiveisAnagramas.get(k - 1))
							&& l != k - 1) {
						contadorAnagramas++;
					}
				}
			}
		}
		
		System.out.println("A palavra possui " + contadorAnagramas + " substrings anagramas!");
	}
	
	private boolean verificaAnagrama(String ana1, String ana2) {
		char[] ana1Chars = ana1.toCharArray();
		char[] ana2Chars = ana2.toCharArray();
		
		Arrays.sort(ana1Chars);
		Arrays.sort(ana2Chars);
		
		return Arrays.equals(ana1Chars, ana2Chars);
	}

}
