package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		
		// Offer e Add -> adicionam elementos a fila
		// A diferen�a � o comportamento quando a fila est� cheia
		// add -> retorna um erro pois n�o consegue adicionar
		// offer -> retorna false pois a fila est� cheia
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element -> obter o pr�ximo elemento da fila
		// sem remover
		// A diferen�a � o comportamento quando a fila est� vazia
		// Peek -> quando a fila est� vazia retorna null
		// element -> Erro!! quando a fila est� vazia lan�a Exception
		System.out.println(fila.peek()); 
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();

		// Poll e Remove -> obter o pr�ximo elemento da fila e remove!
		// A diferen�a � o comportamento quando a fila est� vazia
		
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); //Lan�a exception
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
