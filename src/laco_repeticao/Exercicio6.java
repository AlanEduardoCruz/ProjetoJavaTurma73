package laco_repeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Variaveis

		int numero;
		float media = 0.0f;
		float soma = 0.0f;
		int contador = 0;

		do {
			System.out.println("Digite um número:");
			numero = leia.nextInt();

			if (numero != 0 && numero % 3 == 0) {
				soma += numero;
				contador++;
			}

		} while (numero != 0);

		if (contador != 0) {
			media = soma / contador;
		}

		System.out.println("A média de todos os números múltiplos de 3 é: " + media);
		System.out.println("Fim do loop");
		leia.close();
	}

}
