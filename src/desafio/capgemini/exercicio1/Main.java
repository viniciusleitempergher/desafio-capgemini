package desafio.capgemini.exercicio1;

public class Main {
	public static void main(String[] args) {
		// Tamanho da escada
		int n = 15;

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
