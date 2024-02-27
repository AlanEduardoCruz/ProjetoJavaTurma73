package lista01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		int a, b, c, somaAB;
		
		//Entrada de dados
		System.out.println("Digite o valor de A:");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B:");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C:");
		c = leia.nextInt();	
		
		
		// Processamento 	
		
		somaAB = a + b;		
		
		if(somaAB > c ) {
			System.out.println("A soma de A + B é Maior do que C");
		}else if (somaAB < c) {
			System.out.println("A soma de A + B é Menor do que C");
		}else {
			System.out.println("A Soma de A + B é igual a C");			
		}
		
		
		leia.close();		

	}

}
