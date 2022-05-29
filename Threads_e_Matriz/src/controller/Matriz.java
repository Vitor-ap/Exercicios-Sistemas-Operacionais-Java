package controller;

import java.util.Random;

public class Matriz {

	public void ContagemMatriz () {
		int mat[][] = new int [3][5];
			for(int linha = 0; linha <=2; linha++) {
				for (int coluna =0; coluna <=4; coluna++) {
					Random r = new Random();
					int rnd = r.nextInt(50);
					mat[linha][coluna] = rnd;
				}		
			}
			Thread t1 = new Thread_1(mat);
			Thread t2 = new Thread_2(mat);
			Thread t3 = new Thread_3(mat);
			t1.start();
			t2.start();
			t3.start();
	}
			
}
