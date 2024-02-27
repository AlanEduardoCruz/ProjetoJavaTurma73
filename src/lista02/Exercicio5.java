
package lista02;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Variaveis
		int codigo;
		double preco, quantidade, valorTotal;
		String produto;
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("--Digite 1 para Cachorro Quente R$ 10.00--");
        System.out.println("--Digite 2 para X-Salada R$ 15.00--");
        System.out.println("--Digite 3 para X-Bacon R$ 18.00--");
        System.out.println("--Digite 4 para Bauru R$ 12.00--");
        System.out.println("--Digite 5 para Refrigerante R$ 8.00--");
        System.out.println("--Digite 6 para Suco de Laranja R$ 13.00 --");
       	codigo = leia.nextInt();
		
		// Verificação
		
		switch(codigo) {
		case 1:
		preco = 10.00;
		produto = "Cachorro quente";
		break;
		
		case 2:
			preco = 15.00;
			produto = "X-salada";
			break;
			
		case 3:
			preco = 18.00;
			produto = "X-Bacon";
			break;
			
		case 4:
			preco = 12.00;
			produto = "Bauru";
			break;
			
		case 5:
			preco = 8.00;
			produto = "Refrigerante";
			break;
			
		case 6:
			preco = 13.00;
			produto = "Suco de laranja";
			break;
			
		default:
			System.out.println("Código do produto inválido");
			return;
					
		}
		
		System.out.println("Informe a quantidade comprada:");
		quantidade = leia.nextDouble();
		
		valorTotal = quantidade * preco;
		
		System.out.println("Produto: " + produto);
		System.out.println("Valor total: R$ " + valorTotal);
		
		leia.close();
		
		
			
		}
		
		
}
