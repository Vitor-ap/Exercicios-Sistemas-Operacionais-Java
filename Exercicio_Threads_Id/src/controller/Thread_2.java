package controller;

public class Thread_2 extends Thread {

private int id2;
	
	public Thread_2 (int id2) {
	this.id2 = id2;
	
	}
	@Override
	public void run() {
		id2 = (int) getId();
		System.out.println("Id da Thread #2: " +id2);
	}
}