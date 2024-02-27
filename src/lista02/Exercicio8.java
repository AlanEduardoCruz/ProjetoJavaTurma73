package lista02;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Variaveis
		int operacao;
		float valorNaConta = 1000.00f;
		float valorSaque, novoValor;
		String modalidade;
		
		System.out.println("Informe o tipo de operação de 1 a 3");
		operacao = leia.nextInt();
		
		//Processamento
		switch (operacao) {
		case 1:
			modalidade = "Saldo";
			System.out.println("Operacao - " + modalidade);
			System.out.println("Saldo: R$ " + valorNaConta);
			break;			
		
		case 2:		
			modalidade = "Saque";
			
			System.out.println("Informe o valor do saque ");			
			valorSaque = leia.nextFloat();
			
			if(valorSaque > valorNaConta) {
				System.out.println("Operacao - " + modalidade);
				System.out.println("Saldo Insuficiente!");
				
			}else {
				novoValor = valorNaConta - valorSaque;
				System.out.println("Operacao - " + modalidade);
				System.out.printf("Novo Saldo: %.2f " , novoValor);
			}
			break;
			
		case 3:
			modalidade = "Depósito";
			System.out.println("Informe o valor do deposito ");			
			valorSaque = leia.nextFloat();		
			
			novoValor = valorNaConta + valorSaque;
			System.out.println("Operacao - " + modalidade);
			System.out.printf("Novo Saldo: %.2f" , novoValor);
			break;
			
		default:
			System.out.println("Operação Inválida!");
			return;				
		
		}
		leia.close();
	}
}


