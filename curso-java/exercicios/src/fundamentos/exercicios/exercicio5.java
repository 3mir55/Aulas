package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual � a base do tri�ngulo?");
		double base = teclado.nextDouble();
		
		System.out.println("Qual � a altura do tri�ngulo?");
		double altura = teclado.nextDouble();
		
		double area = (base * altura) / 2;
		System.out.printf("A �rea do tri�ngulo �: %.2f", area);
		
		teclado.close();
	}
}
