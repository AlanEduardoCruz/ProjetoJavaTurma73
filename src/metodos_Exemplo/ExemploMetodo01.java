package metodos_Exemplo;

import metodos_Exemplo.ExemploMetodo02;

import java.util.Scanner;

public class ExemploMetodo01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int resultado, numero1, numero2;

		System.out.println("Digite o primeiro número:");
		numero1 = leia.nextInt();

		System.out.println("Digite o primeiro número:");
		numero2 = leia.nextInt();

		// Chamando método sem retorno
		ExemploMetodo02.mensagem();

		// Chamando método e passando mensagem
		ExemploMetodo02.saudacao("Olá, tudo bem?");

		// Chamando método com retorno
		resultado = somar(numero1, numero2);
		System.out.println("A soma é " + resultado);

		leia.close();
	}

	// Criando método com retorno
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}



}
