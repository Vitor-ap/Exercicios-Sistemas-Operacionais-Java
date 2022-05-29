package controller;

public class ThreadVetor extends Thread {
	
	private int num;
	private int vet[] = new int[1000];

	
	public ThreadVetor(int[] vet, int num) {
		this.num= num;
		this.vet = vet;
		
	}
		@Override
		public void run() {
			if (num % 2 == 0) {
				metodoVetorFor();
			}
			else {
				metodoVetorForEach();
			}
		}
		
			private void metodoVetorFor() {
			double inicial1 = System.nanoTime();
				for (int i = 0; i < vet.length; i++) {
				}
			double final1 = System.nanoTime();
			double tempo1 = final1 - inicial1;
			tempo1 = tempo1 / Math.pow(10, 9);
			System.out.println("Tempo para percorrer o vetor #2 (usando for): "+ tempo1 + " segundos.");
					
		}
			
			
			private void metodoVetorForEach() {
				double inicial2 = System.nanoTime();
				for (int numero : vet) {
					numero = numero + 0;
				}
				double final2 = System.nanoTime();
				double tempo2 = final2 - inicial2;
				tempo2 = tempo2 / Math.pow(10, 9);
				System.out.println("Tempo para percorrer o vetor #1 (usando for each):  "+ tempo2 + " segundos.");
			}
}
