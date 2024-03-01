package collections;

import java.util.Iterator;
import java.util.Stack;

public class ExemploPilha {

	public static void main(String[] args) {

		// Criando Collections de Pilha
		Stack<String> pilha = new Stack<String>();

		pilha.push("Prato Verde");
		pilha.push("Prato Azul");
		pilha.push("Prato Branco");
		pilha.push("Prato Amarelo");
		pilha.push("Prato Vermelho");

		System.out.println("\nElementos da Pilha: " + pilha);

		Iterator<String> x = pilha.iterator();

		System.out.println("\nElementos da Pilha: " + pilha);

		System.out.println("\nRetirar elemento: " + pilha.pop());

	}

}
