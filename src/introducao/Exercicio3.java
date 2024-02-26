package introducao;


import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		// Variaveis
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informe o valor do salário bruto:");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Informe o valor do adicional noturno:");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Informe a quantidade de horas extras:");
		horasExtras = leia.nextFloat();
		
		System.out.println("Informe o total de descontos:");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Salário Liquido: " + salarioLiquido);
		
		leia.close();
		

	}

}
