package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro sal�rio:");
		String salario1 = entrada.nextLine();
		salario1 = salario1.replace(",", ".");
		
		System.out.print("Digite o segundo sal�rio:");
		String salario2 = entrada.nextLine();
		salario2 = salario2.replace(",", ".");
		
		System.out.print("Digite o terceiro sal�rio:");
		String salario3 = entrada.nextLine();
		salario3 = salario3.replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("A m�dia de sal�rio �: %.2f", media);
		entrada.close();
	}

}
