package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroDigitado;
		boolean numeroEncontrado = false;

		// Criação de uma lista para armazenar cores
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);

		System.out.println("Digite o número que você deseja encontrar:");
		numeroDigitado = leia.nextInt();

		for (int numero : numeros) {
			if (numeroDigitado == numero) {

				System.out.print(
						"O número " + numeroDigitado + " está localizado na posição: " + numeros.indexOf(numero));
				numeroEncontrado = true;
			}
		}

		if (!numeroEncontrado) {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");

		}
		leia.close();

	}

}
