package desafio.capgemini.exercicio1;

public class Main {
	public static void main(String[] args) {
		// Tamanho da escada
		int n = 6;

		// Possuirá a escada desenhada em caractéres
		String escada = "";
	
		
		for (int i = 1; i <= n; i++) {
			
			for (int l = 0; l <= n - i; l++) {
				escada += " ";
			}
			
			for (int l = 0; l < i; l++) {
				escada += "*";
			}
			
			escada += "\n";
		}
		
		System.out.println(escada);
	}
}
