package controller;

public class Thread_5 extends Thread {
	
private long id5;
	
	public Thread_5 (long id5) {
	this.id5 = id5;
	}

	@Override
	public void run() {
		id5 = (int) getId();
		System.out.println("Id da Thread #5: " +id5);
	}
}