package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Criação de uma lista para armazenar cores
		ArrayList<String> cores = new ArrayList<String>();

		String cor = " ";

		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite  a: " + (indice + 1) + "º cor:");
			cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("Listar todas as cores cores:\n");
		for (String nomeDasCores : cores)
			System.out.println(nomeDasCores);

		Collections.sort(cores);

		System.out.println("Ordenar as cores::\n");
		for (String coresOrdenadas : cores)
			System.out.println(coresOrdenadas);

		leia.close();
	}

}
