package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {

		// Criando a Collection LinkeList do tIpo Fila(Queue);
		Queue<Integer> fila = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++)
			fila.add(i);

		System.out.println("\nElementos na fila: " + fila);

		System.out.println("\nRemover Elemento: " + fila.remove()); // remove o primeiro valor

		System.out.println("\nFila atualizada: " + fila);

		System.out.println("\nAdicionar Elemento 11: " + fila.add(11));

		System.out.println("\nExibir a Fila atualizada: " + fila);

		// Criando a collection de iteração
		Iterator<Integer> x = fila.iterator(); // x pode ser qualquer nome, como por exemplo iterator

		while (x.hasNext()) {

			System.out.println(x.next() + 1);
			

		}

	}

}
