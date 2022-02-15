package desafio.capgemini.exercicio1;

public class Exercicio1 {
	
	// "n" é o número de degraus da escada
	public Exercicio1(int n) {

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
