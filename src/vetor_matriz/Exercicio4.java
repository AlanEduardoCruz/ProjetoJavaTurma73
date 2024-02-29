package vetor_matriz;


import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
			
		int linha, coluna;		
		float matriz [][] = new float [3][3];
		float somaLinha =0.f;
		
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o numéro na posiçao " + "[" + linha + "]" + "[" + coluna + "]");
				matriz[linha][coluna] = leia.nextFloat();
			}
		}
		for(linha = 0; linha < 3; linha++) {
			
			for(coluna = 0; coluna < 3; coluna++) {
			 somaLinha += (matriz[linha][coluna]);			
			}
		}
		
		
		
		

	}

}
