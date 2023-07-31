package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es do funcion�rio
		
		//Tipos num�ricos Inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_134_845_223L;
		
		//tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A'; //Ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status " + status);
	}

}
