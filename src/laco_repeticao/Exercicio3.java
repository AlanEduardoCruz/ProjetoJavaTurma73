package laco_repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Variaveis
		int idade = 0;
		int maior21 = 0;
		int maior50 = 0;

		// processamento

		while (idade != -1)

		{

			System.out.println("Digite uma idade:");
			idade = leia.nextInt();

			if (idade > 0) {
				if (idade < 21) {

					maior21++;

				} else if (idade > 50) {

					maior50++;
				}
			}
		}

		// Saida de dados

		System.out.println("Total de pessoas menores de 21 anos: " + maior21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maior50);

		leia.close();

	}

}
