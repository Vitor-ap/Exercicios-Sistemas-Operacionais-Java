package view;

import java.util.concurrent.Semaphore;

import controller.SistemaCompras;

public class PrincipalIngressos {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo  = new Semaphore(permissoes);
		
		for (int i = 1; i <= 300; i++) {
			int quantidade = (int)((Math.random()*4)+1);
			Thread tSisCompra = new SistemaCompras(i, semaforo, quantidade);
			tSisCompra.start();

		}
	}
}


