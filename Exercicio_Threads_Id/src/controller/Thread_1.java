package controller;

public class Thread_1 extends Thread {

	private int id1;
	
	public Thread_1 (int id1) {
	this.id1 = id1;
	}
	
	@Override
	public void run() {
		id1 = (int) getId();
		System.out.println("Id da Thread #1: " + id1);
	}
}
