package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		String nome;

		Stack<String> pilha = new Stack<String>();

		while (true) {

			// Menu
			System.out.println("\n***************************************************************");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("***************************************************************");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {

			case 0:
				System.out.println("Programa finalizado!");
				return;

			case 1:
				System.out.println("Digite um nome");
				leia.skip("\\R?");
				nome = leia.nextLine();
				pilha.push(nome);
				System.out.println("Livro " + nome + " adicionado á Pilha");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A fila está vazia, no momento não há clientes para retirar.");

				} else {

					System.out.println("\n fila: " + pilha);
				}
				break;

			case 3:
				// Se a opcao for retirar um cliente, verifica se a fila está vazia
				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {
					String clienteRemovido = pilha.pop();
					System.out.println("Um Livro foi retirado da pilha!");
				}
				break;

			default:
				System.out.println("Opção inválida.");

				leia.close();

			}

		}

	}

}
