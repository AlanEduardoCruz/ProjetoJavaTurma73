package lista01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Variaveis
		
		int numero;
		
		// Entrada de dados
		
		System.out.println("Digite um numero:");
		numero = leia.nextInt();
		
		// Processamento
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("O número " + numero + " é par e positivo!");
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo!");
		}else if (numero % 2 != 0 && numero > 0) {
			System.out.println("O número " + numero + " é impar e positivo!");
		}else if(numero % 2 != 0 && numero < 0) {
			System.out.println("O número " + numero + " é impar e negativo!");
			
		}else {
			System.out.println("O número " + numero + " é neutro!");
		}
		leia.close();
		
	}

}


