package lacos_condicionais;


import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, media;
		String nome;
		
		System.out.println("Digite seu nome");
		nome = leia.next();
		
		System.out.println("Digite a primeira nota");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a primeira nota");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6) {
			System.out.println("Parabéns, Aprovado(a)!");			
		}
		else if(media >= 5) {
			System.out.println("Está de exame");
		}else {
			System.out.println("Está reprovado(a)");
		}
		

	}

}
