package controller;

public class Thread_3 extends Thread{

private long id3;
	
	public Thread_3 (long id3) {
	this.id3 = id3;
	}
	
	@Override
	public void run() {
		id3 = (int) getId();
		System.out.println("Id da Thread #3: " +id3);
	}
}