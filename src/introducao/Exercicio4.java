package introducao;

import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		
		//variaveis		
		float numero1, numero2, numero3, numero4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Informe o primeiro número:");
		numero1 = leia.nextFloat();
		
		System.out.println("Informe o segundo número:");
		numero2 = leia.nextFloat();
		
		System.out.println("Informe o terceiroa número:");
		numero3 = leia.nextFloat();
		
		System.out.println("Informe o quarto numero");
		numero4 = leia.nextFloat();
		
		diferenca = (numero1 *  numero2) - (numero3 * numero4);
		
		System.out.println("Diferença:" + diferenca);	
		
		leia.close();

	}
}
