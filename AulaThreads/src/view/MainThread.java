package view;

import controller.ThreadCalc;

public class MainThread {

	public static void main(String[] args) {
	/* for (int idThread = 0; idThread < 5; idThread++) {
		//ThreadID threadID = new ThreadID(idThread);
		Thread threadID = new ThreadID(idThread);
		threadID.start(); */
		
		int a = 854;
		int b = 32;
		
		for (int op = 0; op < 4; op++) {
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}
	}

}
