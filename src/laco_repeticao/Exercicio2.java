package laco_repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Variaveis

		int numero, contador;
		int par = 0;
		int impar = 0;

		// processamento
		for (contador = 0; contador < 10; contador++) {

			System.out.println("Digite o " + contador + "° numero:");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}

		}

		// Saida de dados
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares: " + impar);
		
		leia.close();

	}

}
