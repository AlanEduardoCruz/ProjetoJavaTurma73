package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		// Criando a collection do tipo List

		ArrayList<Double> notas = new ArrayList<Double>();
		double numero;
		

		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(7.0);
		notas.add(4.0);

//		System.out.println("\nnotas cadastro: " + notas);
		
		System.out.println("Informe a posicação que deseja procurar: ");
		numero = leia.nextDouble();
		
		System.out.println("\na posicao da nota é: " + notas.indexOf(numero));
		leia.close();

	}

}
