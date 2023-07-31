package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2"); //n�o usar o relacional == para strings
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // o next remove espa�os em branco digitados o nextLine n�o
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim())); // trim remove espa�os em branco digitados
		
		entrada.close();
	}
}
