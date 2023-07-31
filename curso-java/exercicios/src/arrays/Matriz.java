package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas alunos deseja informar? ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.print("Digite quantas notas tem cada aluno: ");
		int quantidadeDeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeDeNotas];
		
		double totalDeNotas = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for(int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("Digite a %d� nota do %d� aluno: ", j + 1, i + 1);
				notasDaTurma[i][j]= entrada.nextDouble();
				totalDeNotas += notasDaTurma[i][j];
			}
		}
		for (int i = 0; i < notasDaTurma.length; i++) {
			System.out.printf("Essas s�o as notas do %d� aluno:", i + 1);
			for(int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.print(" " + notasDaTurma[i][j]);
			}
			System.out.println();
		}
		
		System.out.printf("A m�dia da turma �: %.1f", totalDeNotas / (quantidadeAlunos * quantidadeDeNotas));
	
		entrada.close();
	}
}