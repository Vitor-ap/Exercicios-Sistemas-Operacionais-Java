package controller;

import java.util.Random;

public class SaposThread extends Thread{
	
	static int posicao =0;
	String nome ="";
	
	public SaposThread(String nome) {
		this.nome = nome;
		}

	@Override
	public void run() {
		Random r = new Random();
		int percurso = 0; //inicalizando percurso
		int percursototal =30; //percurso maximo da corrida em metros
		while (percurso < percursototal) {
			int rnd = r.nextInt(5); //gera um saldo aleatrório entre 0 e 4
			if (percurso + rnd > percursototal) { //condicao para não ultrapssar o percurso maximo
				rnd = percursototal - percurso;
			}
			percurso = percurso + rnd;
			System.out.println("O " +nome+" pulou " +rnd+" metros. O total percorrido é de "+percurso+" metros.");
			yield(); //metodo para evitar que a Mesma Thread seja executada diversas veses em sequencia antes de outra, mas ainda pode ocorrer.
		}
		posicao++;
		System.out.println("O " +nome+" concluiu o percurso e sua colocação é "+posicao);
		
	}
}
	
