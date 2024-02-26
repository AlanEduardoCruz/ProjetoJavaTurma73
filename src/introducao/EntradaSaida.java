package introducao;

import java.util.Scanner; // importando classe scanner do pacote java.util

public class EntradaSaida {

	public static void main(String[] args) {
		
			
		// Variaveis
		String nome;
		int idade;
		
		// Entrada de Dados		
		Scanner leia = new Scanner(System.in);		
		
		System.out.println("Insira o seu nome: "); // imprime mensagem para o usuario		
		nome = leia.next(); // Ler a entrada do usuario do tipo string
		
		System.out.println("Insira sua idade");// imprime mensagem para o usuario
		idade = leia.nextInt(); // Ler a entrada do usuario do tipo int
		
		
		// Saida de dados
		System.out.println("Bom dia, " + nome); 
		System.out.println("A sua idade é " + idade + " anos.");
		

	}

}
