/*
4 pessoas caminham, cada uma em um 
corredor diferente. Os 4 corredores terminam 
em uma �nica porta. Apenas 1 pessoa pode 
cruzar a porta, por vez. Considere que cada 
corredor tem 200m. e cada pessoa anda de 4 a 
6 m/s. Cada pessoa leva de 1 a 2 segundos 
para abrir e cruzar a porta. Fa�a uma 
aplica��o em java que simule essa situa��o.
  */

package view;

import java.util.concurrent.Semaphore;

import controller.ThreadSala;

public class MainSala {

	public static void main(String[] args) {
		
		int permissoes = 1;
		Semaphore semaforo  = new Semaphore(permissoes);
		
			for (int i = 1; i <= 4; i++) {
				int velocidade = (int)((Math.random()*(6-4+1))+4);
				Thread tSala = new ThreadSala(i,velocidade, semaforo);
				tSala.start();
			}

	}

}
