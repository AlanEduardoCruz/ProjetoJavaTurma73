package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// variaveis
		int valorDigitado = 0;
		boolean valorEncontrado = false;

		// Criando collection
		Set<Integer> setValores = new HashSet<Integer>();

		// Entrada de dados
		System.out.println("Digite o numero que vocÊ deseja encontrar:");
		valorDigitado = leia.nextInt();

		// Adicionaodo valores ao conjunto
		setValores.add(2);
		setValores.add(5);
		setValores.add(1);
		setValores.add(3);
		setValores.add(4);
		setValores.add(9);
		setValores.add(7);
		setValores.add(8);
		setValores.add(10);
		setValores.add(6);

		// Iterando sobre o conjunto para verificar se o valor digitado está presente
		for (int valor : setValores) {
			if (valorDigitado == valor) {
				System.out.println("O número " + valor + " foi encontrado!");
				valorEncontrado = true;
			}

		}

		// verificando se o valor não foi encontrado
		if (!valorEncontrado) {
			System.out.println("O número " + valorDigitado + " não foi encontrado!");
		}
		
		leia.close();

	}

}
