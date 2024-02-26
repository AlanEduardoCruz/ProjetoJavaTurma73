package introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {	
		
		Scanner leia = new Scanner(System.in);
		
				//Variaveis
				int valor;
				int  nota100, nota50, nota20, nota10, nota5, nota2, nota1;
				
				// Entrada de dados
				System.out.println("Informe o valor:");
				valor = leia.nextInt();
				
				// Processamento
				
				nota100 = valor / 100;
				valor = valor % 100;
				
				nota50 = valor / 50;
				valor %= 50;
				
				nota20 = valor /20;
				valor %= 20;
				
				nota10 = valor /10;
				valor %= 10;
				
				nota5 = valor / 5;
				valor %= 5;
				
				nota2 = valor / 2;
				valor %= 2;
				
				nota1 = valor / 1; 
				valor %= 1;
											
				
				//Saida de dados			
					
				System.out.println(nota100 + " Nota(s) de R$ 100,00");
				
				System.out.println(nota50 + " Nota(s) de R$ 50,00");
				
				System.out.println(nota20 + " Nota(s) de R$ 20,00");
				
				System.out.println(nota10 + " Nota(s) de R$ 10,00");
				
				System.out.println(nota5 + " Nota(s) de R$ 5,00");
				
				System.out.println(nota2 +  " Nota(s) de R$ 2,00");
				
				System.out.println(nota1 + " Nota(s) de R$ 1,00");
		
		
		

	}

}
