package Controle;

public class For1 {
	public static void main(String[] args) {
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
//		int x = 2;  // � poss�vel fazer separadamente, mas n�o deve ser usado
//		for (;x < 10;) {
//			System.out.println("X = " + x);
//			x++;
//		}
		
		// La�o infinito
		for(;;) {
			System.out.println("Fim!");
		}
	}

}
