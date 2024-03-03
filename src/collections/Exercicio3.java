package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Set<Integer> setValores = new HashSet<Integer>();

		int valorDigitado;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º número");
			valorDigitado = leia.nextInt();
			setValores.add(valorDigitado);
		}
		
		Iterator<Integer> interator = setValores.iterator();
		
		System.out.println("Listar dados do Set:" + setValores);


	}

}
