package vetor_matriz;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[10];
		int i;
		float soma = 0.0f;
		float media = 0.0f;

		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número para posição " + "[" + vetor[i] + "]");
			vetor[i] = leia.nextInt();
		}

		System.out.println("Elementos nos índices ímpares: ");

		for (i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 != 0) {

				System.out.print(vetor[i] + " ");

			}
		}

		System.out.println("\nElementos nos índices pares: ");

		for (i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 0) {

				System.out.print(vetor[i] + " ");

			}
		}

		for (i = 0; i < vetor.length; i++) {

			soma += vetor[i];

		}

		System.out.print("\nSoma: " + soma);

		media = soma / vetor.length;

		System.out.printf("\nMédia: %.2f", media);
	}

}


