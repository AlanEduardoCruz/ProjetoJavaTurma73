package laco_repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// variaveis
		int numero;
		int soma = 0;

		// processamento
		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();

			if (numero > 0) {
				soma = soma + numero;
			}

		} while (numero != 0);

		// Saida de dados
		System.out.println("A soma dos números positivos é: " + soma);
		
		leia.close();

	}

}
