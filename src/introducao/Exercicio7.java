package introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		
		//Variaveis
		int valorEmSegundos,  horas, minutos;
	
		
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor que deseja realizar a conversão:");
		valorEmSegundos = leia.nextInt();
		
		horas = valorEmSegundos / 3600;
		valorEmSegundos %= 3600;
		
		minutos = valorEmSegundos / 60;
		valorEmSegundos %= 60;
		
		
		System.out.printf("Valor Formatado: %d: %d: %d ", horas, minutos, valorEmSegundos);
		
		leia.close();
		
			

	}

}
