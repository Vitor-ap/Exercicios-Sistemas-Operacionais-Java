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
		// s� se executa o que est� aqui dentro	
		System.out.println(idThread);
	}
	
}
