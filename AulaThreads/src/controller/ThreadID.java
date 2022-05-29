package controller;

//extends Thread 
//parametros por construtor
//metodo run()

public class ThreadID extends Thread {
	
	private int idThread;
	
	public ThreadID(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		// só se executa o que está aqui dentro	
		System.out.println(idThread);
	}
	
}
