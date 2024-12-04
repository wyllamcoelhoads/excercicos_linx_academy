package exercicios_linx;

import waitNotifyAll.Inserir;
import java.lang.Thread;

public class Main {

	public static void main(String[] args) {
		Inserir inserindo = new Inserir();

        // Thread produtora
        Thread produtor = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                	inserindo.inseri("item " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Thread consumidora
        Thread consumidor = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    inserindo.remover();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        produtor.start();
        consumidor.start();
	}

}
