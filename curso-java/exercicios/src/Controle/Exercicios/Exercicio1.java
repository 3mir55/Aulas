package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = teclado.nextInt();
		if (numero <= 10 && numero >=0) {
			int par = numero % 2;
			if (par == 0) {
				System.out.printf("O numero %d � par.\n", numero);
			}
		} else {
			System.out.println("O n�mero digitado � inv�lido");
		}
		System.out.println("Fim!");
		teclado.close();
	}
}
