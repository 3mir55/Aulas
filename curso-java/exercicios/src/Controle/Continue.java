package Controle;

public class Continue {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) { // Testa se � par
				continue; // interrompe a repeti��o quando i for �mpar
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
