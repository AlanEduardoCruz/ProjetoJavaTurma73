package vetor_matriz;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		leia.close();

		int linha, coluna;
		float[][] matriz = { { 4.0f, 5.0f, 7.0f, 3.0f }, { 2.5f, 6.5f, 4.7f, 8.0f }, { 10.0f, 8.5f, 9.5f, 8.0f },
				{ 9.0f, 6.5f, 7.6f, 8.2f }, { 5.0f, 5.0f, 5.0f, 6.3f }, { 7.0f, 8.0f, 9.0f, 8.5f },
				{ 5.5f, 3.5f, 2.5f, 1.0f }, { 8.0f, 9.0f, 10.0f, 9.5f }, { 5.6f, 5.8f, 6.5f, 7.0f },
				{ 7.5f, 8.5f, 9.5f, 10.0f } };
		float[] mediaLinhas = new float[matriz.length];

		for (linha = 0; linha < matriz.length; linha++) {

			float somaLinha = 0f;

			for (coluna = 0; coluna < matriz[linha].length; coluna++) {
//				
				somaLinha += (matriz[linha][coluna]);
			}
			mediaLinhas[linha] = somaLinha / matriz[linha].length;
		}
		System.out.println("Vetor:");
		for (linha = 0; linha < matriz.length; linha++) {

			System.out.printf("%.1f ",mediaLinhas[linha]);
		}

	}

}
