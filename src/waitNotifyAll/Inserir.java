package waitNotifyAll;

import java.util.LinkedList;
import java.util.Queue;

public class Inserir {
	private final int capacidade = 5; // limite da lista
	private final Queue<Object> fila = new LinkedList<>();
	
	public synchronized void inseri (Object item) throws InterruptedException {
		while (filaCheia()) {
			wait();
		}
		fila.add(item);
		System.out.println("Foi inserido o item: " + item + " com sucesso!");
		notify();
	}

	public synchronized void remover() throws InterruptedException {
		while (filaVazia()) {
			wait();
		}
		Object item = fila.poll(); // esta removendo o primeiro elemento da fila 
		System.out.println("Foi removido o item: " + item + " do inicio da fila com sucesso!");
		notify();
	}
	private boolean filaVazia() {
		// TODO Auto-generated method stub
		return fila.isEmpty();
	}

	private boolean filaCheia() {
		// TODO Auto-generated method stub
		return fila.size() == capacidade;
	}

}
