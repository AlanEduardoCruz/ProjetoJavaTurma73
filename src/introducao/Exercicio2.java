package introducao;


import java.util.Scanner; // importando pacote java.util

public class Exercicio2 {

	public static void main(String[] args) {
		
		// variaveis
		float primeiraNota, segundaNota, terceiraNota, quartaNota, mediaFinal;

		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		primeiraNota = leia.nextFloat();
		
		System.out.println("Informe a segunda nota:");
		segundaNota = leia.nextFloat();
		
		System.out.println("Informe a terceira nota:");
		terceiraNota = leia.nextFloat();
		
		System.out.println("Informe a quarta nota:");
		quartaNota = leia.nextFloat();
		
		mediaFinal = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		
		System.out.printf("Média final: %.2f " , mediaFinal);
		

	}

}
