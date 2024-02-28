package laco_repeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Variaveis
		int numero1, numero2;
		int contador;

		// entrada de dados

		System.out.println("Informe o primeiro numero do intervalo:");
		numero1 = leia.nextInt();

		System.out.println("Informe o último numero do intervalo:");
		numero2 = leia.nextInt();

		// Processamento

		if (numero2 < numero1) {
			System.out.println("Intervalo inválido");

		} else {

			System.out.println("No intervalo entre " + numero1 + " e " + numero2);

			for (contador = numero1; contador <= numero2; contador++) {

				if (contador % 3 == 0 && contador % 5 == 0) {

					System.out.println(contador + " é múltiplo de 3 e 5");
				}
			}
		}

		leia.close();

	}
}
