package Controle;
//N�o usar isso rotineiramente
public class BreakRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) { //externo � um r�tulo para o for
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo; // o r�tulo faz com que o break pare o for externo
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!!");
	}
}