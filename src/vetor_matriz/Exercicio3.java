package vetor_matriz;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// variaveis
		int linha, coluna;
		int somaDiagonalPrincipal = 0;
		int somaDiagonalSecundaria = 0;

		int matriz[][] = new int[3][3];

		// Entrada de dados;
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para posicao[" + linha + "][" + coluna + "]: ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		// percorre a linha e coluna
		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

			}
		}
		// Elementos diagonal
		System.out.println("Elementos da Diagonal Principal:");
		for (linha = 0; linha < 3; linha++) {
			System.out.print(matriz[linha][linha] + " ");
			somaDiagonalPrincipal += matriz[linha][linha];
		}
		System.out.println("\nSoma dos Elementos da Diagonal Principal:\n" + somaDiagonalPrincipal);

		// Elementos diagonal secundaria
		System.out.println("Elementos da Diagonal Secundária:");
		for (linha = 0; linha < 3; linha++) {
			System.out.print(matriz[linha][3 - 1 - linha] + " ");
			somaDiagonalSecundaria += matriz[linha][3 - 1 - linha];
		}

		System.out.println("\nSoma dos Elementos da Diagonal secundaria:\n" + somaDiagonalSecundaria);
	}

}


