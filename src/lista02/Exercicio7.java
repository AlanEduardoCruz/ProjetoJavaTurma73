package lista02;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Variaveis
		
		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
		int codigo;
		
		System.out.println("Digite o 1° número:");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2° número:");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o número da  operação:");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			soma = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " = " + soma);
			break;
			
		case 2:
			subtracao = numero1 - numero2;	
			System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
			break;
			
		case 3:
			multiplicacao = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
			
			
			break;
			
		case 4:
			divisao = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + divisao);
			break;
			
			
			default:
				System.out.println("Operação Inválida!");
				return;
			
		}
		
		
		

	}

}
