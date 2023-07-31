package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b); //somente um m�todo abstrato
	
	default String legal() { 
		return "Legal";
	}
	static String muitoLegal() { // n�o tem acesso ao this por ser static
		return "Muito Legal";
	}
}
