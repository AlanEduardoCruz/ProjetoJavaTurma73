package introducao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		//Variaveis
		double raio, pi = 3.14159, area;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor do RAIO: ");
		raio = leia.nextFloat();
		
		area = pi * (raio * raio);
		
		
		System.out.printf("Area: %.4f", area);
		
		leia.close();
		

	}
}
