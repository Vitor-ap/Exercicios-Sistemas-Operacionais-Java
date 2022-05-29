package view;

import controller.Thread_1;
import controller.Thread_2;
import controller.Thread_3;
import controller.Thread_4;
import controller.Thread_5;

public class Main5Threads {
	

	public static void main(String[] args) {
		int id1 = 0;
		int id2 = 0;
		int id3 = 0;
		int id4 = 0;
		int id5 = 0;
		Thread t1 = new Thread_1(id1);
		Thread t2 = new Thread_2(id2);
		Thread t3 = new Thread_3(id3);
		Thread t4 = new Thread_4(id4);
		Thread t5 = new Thread_5(id5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
