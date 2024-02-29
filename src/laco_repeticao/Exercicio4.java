package laco_repeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Variaveis
		String continua = "s";
		int idade, genero, tipoDesenvolvedor;
		int totalDesenvolvedoresBackend = 0;
		int totalMulheresFrontend = 0;
		int totalHomensMobile = 0;
		int totalNaoBinariosFullStack = 0;
		int totalPessoas = 0;
		int somaIdades = 0;

		while (!continua.equals("n")) {

			System.out.println("idade:");
			idade = leia.nextInt();

			System.out.println(
					"Identidade de Gênero (1 – Mulher Cis, 2 – Homem C, 3 – Não Binário, 4 – Mulher Trans, 5 – Homem Tran, 6 – Outros)");
			genero = leia.nextInt();

			System.out.println("Pessoa Desenvolvedora: (1 – Backend, 2 – Frontend, 3 – Mobile, 4 – FullStack) ");
			tipoDesenvolvedor = leia.nextInt();

			System.out.println("Deseja continuar (S/N): ");
			continua = leia.next();
			;

			if (genero == 1) {
				totalDesenvolvedoresBackend++;
			}
		}
	}

}
