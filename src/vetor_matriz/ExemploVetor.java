package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// tipagem vetor, variaveis
		String cachorros[] = new String[3];
		int indice; // Percorre array;

		// processamento
		for (indice = 0; indice < 3; indice++) {

			// Saida de dados
			System.out.println("Digite o " + (indice + 1) + "º nome:");
			cachorros[indice] = leia.nextLine();

		}
		for (indice = 0; indice < cachorros.length; indice++) {
			// Acessar vetor
			System.out.println("Cachorro na posicao [" + indice + "]: " + cachorros[indice]);

		}

	}

}
