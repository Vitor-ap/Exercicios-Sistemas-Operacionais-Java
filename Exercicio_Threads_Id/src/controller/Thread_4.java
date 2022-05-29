package controller;

public class Thread_4 extends Thread{

private long id4;
	
	public Thread_4 (long id4) {
	this.id4 = id4;
	}
	
	@Override
	public void run() {
		id4 = (int) getId();
		System.out.println("Id da Thread #4: " +id4);
	}
}