package controller;

public class Thread_2 extends Thread {
	
	private int mat[][] = new int[3][5];
	
	
	public Thread_2(int[][] mat) {
		this.mat = mat;
	}
 @Override
public void run() {
	 	 int soma = 0;
	 	 for (int i = 0; i<=4; i++) {
		 soma += mat[1][i];
		 }
	 	System.out.println("soma da linha 2: "+soma);
}
}