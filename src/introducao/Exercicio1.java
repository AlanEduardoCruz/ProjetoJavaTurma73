package introducao;
import java.util.Scanner; // Importando pacote java.util

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Variaveis		
		float salario, abono, novoSalario;		
		
		
		// Entrada de dados
		Scanner leia = new Scanner(System.in);
	
		
		// Solicitando dados para usuario
		System.out.println("Informe o valor do seu salário:");
		salario = leia.nextFloat(); // lendo informação do usuario
		
		// solicitando dados para usuario
		System.out.println("Informe o valor so seu abono:");
		abono = leia.nextFloat(); // lendo informação do usuario
		
		
		// Realizando processamento / calculo
		novoSalario = salario + abono;
		
		// imprimindo mensagem para usuario		
		System.out.println("Novo salario: " + novoSalario);
		
		leia.close();
		
		
		
	}

}
