package lista02;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variaveis
		
		String nome, cargo;
		int codigo;
		float salario;
		double novoSalario;
		
		
		//Entrada de dados
		
		System.out.println("Informe o nome colaborador:");
		nome = leia.nextLine();
		
		System.out.println("Informe o código do cargo:");
		codigo = leia.nextInt();
		
		System.out.println("Informe o salaria atual:");
		salario = leia.nextFloat();
		
		// Condicao
		
		switch(codigo) {
		case 1:			
			novoSalario = salario + (0.1 * salario);
			cargo = "Gerente";
			break;
			
		case 2:			
			novoSalario = salario + (0.07 * salario);
			cargo = "Vendedor";
			break;
			
		case 3:			
			novoSalario = salario + (0.09 * salario);
			cargo = "Supervisor";
			break;
			
		case 4:			
			novoSalario = salario + (0.06 * salario);
			cargo = "Motorista";
			break;
			
		case 5:			
			novoSalario = salario + (0.05 * salario);
			cargo = "Estoquista";
			break;
			
		case 6:			
			novoSalario = salario + (0.08 * salario);
			cargo = "Técnico de TI";
			break;
			
		default:
			System.out.println("Código do cargo inválido");
			return;
		}
		
		
		System.out.println("Nome do colaborador: " + nome);		
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + novoSalario);
		
		leia.close();
		
		

	}

}
