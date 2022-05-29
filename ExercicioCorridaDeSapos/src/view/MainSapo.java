package view;

import controller.SaposThread;

public class MainSapo {
	static int posicao =0;
	public static void main(String[] args) {
		for (int num = 1; num <= 5; num++) {
			Thread Sapos = new SaposThread("Sapo "+num);
			Sapos.start();			
		}
	}
}