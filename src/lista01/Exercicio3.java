package lista01;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Variaveis
		String nome;
		int idade;
		boolean primeiraVez;
		
		//Entrada de dados
		
		System.out.println("Informe o Nome do doador:");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador:");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? (true/ false");
		primeiraVez = leia.nextBoolean();
		
		// Procesamento
		
		if(idade >= 18 &&  idade <= 69 &&  primeiraVez == false ) {
			
			System.out.println(nome + " está apta para doar sangue!");
		}else {
			System.out.println(nome + " não esta apto para doar sangue");
			
		}
		
		
		leia.close();
	}
	
	

}
