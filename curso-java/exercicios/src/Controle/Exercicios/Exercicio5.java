package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		int numero = 0, primo = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		numero = teclado.nextInt();
		teclado.close();

		for (int cont = numero - 1; cont > 1; cont--) {
			if (numero % cont == 0) {
				primo = 1;
			}
		}
		switch (primo) {
		case 0:
			System.out.printf("O n�mero %d � primo.\n", numero);
			break;
		case 1:
			System.out.printf("O n�mero %d n�o � primo.\n", numero);
			break;
		}
		System.out.println("Fim!");
	}
}
