package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X"; // string n�o � palavra reservada da linguagem
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");		
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		System.out.println("Emir".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);		
		
	
		//Tipos primitivos n�o tem o operador "."
		
	}

}
