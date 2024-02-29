package vetor_matriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numeros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };
		
		int linha, coluna;
		
		for(linha = 0; linha< 3; linha++) {
			
			for(coluna= 0; coluna < 3; coluna++) {
				System.out.println("Numeros[" + linha + "][" + coluna + "]" + numeros[linha][coluna]);
			}
		}

	}

}
