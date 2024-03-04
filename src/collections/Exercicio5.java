package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Variaveis
		int opcao;
		String nome = " ";

		// Criando fila usando LinkdList
		Queue<String> fila = new LinkedList<String>();

		// loop principal para continuar executando o programa até que usuario digite
		// "0"
		while (true) {

			// Menu
			System.out.println("\n***************************************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos de clientes");
			System.out.println("3 - Retirar Cliente da fila");
			System.out.println("0 - Sair");
			System.out.println("***************************************************************");
			System.out.println("Entre com a opção desejada:");
			opcao = leia.nextInt();

			// Verificando a opcao selecionada pelo usuario
			switch (opcao) {

			case 0:
				System.out.println("Programa finalizado!");
				return;

			case 1:
				// Se a opcao for adicionar cliente, solicita o nome e adiciona a fila
				System.out.println("Digite o nome");
				leia.nextLine(); // limpa o buffer do scanner;
				nome = leia.nextLine(); // lê o nome do cliente

				fila.add(nome); // adiciona nome a posicao da fila
				System.out.println("Cliente " + nome + " adicionado á fila");
				break;

			case 2:

				if (fila.isEmpty()) {
					System.out.println("A pilha está vazia, no momento não há livros para retirar.");

				} else {
					System.out.println("\n fila: " + fila);
				}
				break;

			case 3:
				// Se a opcao for retirar um cliente, verifica se a fila está vazia
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia");
				} else {
					String clienteRemovido = fila.poll();
					System.out.println("Cliente " + clienteRemovido + " Foi chamado.");
				}
				break;

			default:
				System.out.println("Opção inválida.");

			}
			leia.close();
		}
	}

}
