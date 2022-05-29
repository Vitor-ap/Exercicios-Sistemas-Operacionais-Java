package view;

import java.util.Random;

import controller.ThreadVetor;

public class MainVet {

	public static void main(String[] args) {
		int vet[] = new int[1000];
		int i = 0;
		for (i = 0; i < vet.length; i++) {
		Random r = new Random();
		int rnd = r.nextInt(100);
		vet[i] = rnd;
		}
		  // criacao de um vetor com 1000 posicoes com numeros aleatórios de 1 a 100.
		
		Thread tVetor = new ThreadVetor(vet, 1);
		tVetor.start();
		
		Thread tVetor2 = new ThreadVetor(vet, 2);
		tVetor2.start();
		
		
		}
	}


