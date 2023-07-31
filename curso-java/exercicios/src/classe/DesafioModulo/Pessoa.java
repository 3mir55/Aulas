package classe.DesafioModulo;

public class Pessoa {
	
	String pessoa;
	double peso;
	
	Pessoa (String pessoa, double peso){
		this.pessoa = pessoa;
		this.peso = peso;
	}
	
	double comer(Comida nComida) {
		if (nComida != null) {
			this.peso += nComida.pesoComida;			
		}
		return this.peso;
	}
	
	String apresentar() {
		return "Ol� eu sou " + pessoa + " e tenho " + peso + " Kgs.";
	}

}