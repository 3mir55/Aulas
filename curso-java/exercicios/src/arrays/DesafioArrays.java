package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas notas voc� deseja informar? ");
		int quantidadeNotas = entrada.nextInt();
		double[] notasAluno = new double[quantidadeNotas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.printf("Digite a %d� nota: ", i + 1);
			notasAluno[i]= entrada.nextDouble();
//			System.out.printf("A %d� nota �: %.1f\n", i + 1, notasAluno[i]);
		}
		
		System.out.println(Arrays.toString(notasAluno));
		
		double notaTotal = 0;
		for (double nota : notasAluno) {
			notaTotal += nota;
		}
		
		System.out.printf("A m�dia do aluno �: %.1f", notaTotal / quantidadeNotas);
	
		entrada.close();
	}
}
