 package vetor_matriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Variaveis

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int indice, numero;

		System.out.println("Digite o número que você deseja encontrar:");
		numero = leia.nextInt();

		for (indice = 0; indice < vetor.length; indice++) {

			if (vetor[indice] == numero) {
				System.out.println("O número " + numero + " está localizado na posição " + indice);
				break;

			}

		}
		if (indice == vetor.length)
			System.out.println("O número " + numero + " nao foi localizado ");
		
		
	}
	

}



