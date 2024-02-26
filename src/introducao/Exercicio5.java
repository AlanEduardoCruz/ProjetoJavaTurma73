package introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		//Variaveis
		float a, b, soma, diferenca, multiplicacao, divisao;
		
		Scanner leia = new Scanner(System.in);
	
		
		// Entrada do usuario
		System.out.println("Insira o valor de A:");
		a = leia.nextFloat();
		
		System.out.println("Insira o valor de A:");
		b = leia.nextFloat();
		
		soma = a + b;
		diferenca = a - b;
		multiplicacao = a * b;
		divisao = a / b;
		
		System.out.println("Soma: " + soma);
		System.out.println("Diferenca: " + diferenca);	
		System.out.printf("Multiplicao: %.2f%n" , multiplicacao);
		System.out.printf("Divisao: %.3f%n " , divisao);
		
	
		
		leia.close();
		
		

	}

}
