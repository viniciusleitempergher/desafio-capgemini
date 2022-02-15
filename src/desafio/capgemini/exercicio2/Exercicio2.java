package desafio.capgemini.exercicio2;

public class Exercicio2 {

	public Exercicio2(String senha) {
		
		if (senha.length() < 6) {
			// N�mero de caracteres que faltam para a senha possuir 6
			int caracteresFaltando = 6 - senha.length();
			
			System.out.println("A senha n�o possui o m�nimo de caracteres, faltam " + caracteresFaltando + "!");
		} else {
			System.out.println("Sua senha possui o m�nimo de caracteres!");
		}
	}

}
