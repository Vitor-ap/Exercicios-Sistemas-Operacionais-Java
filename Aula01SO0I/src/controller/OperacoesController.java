package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
		//concatena 32768 caracteres 1 a1, em uma var. String
		public void concatenaString() {
			String cadeia = "";
			double tempoinicial = System.nanoTime(); //<ctrl + 1>
			for(int i = 0 ; i < 32768 ; i++) {
				cadeia = cadeia + "a";
			}
			double tempofinal = System.nanoTime();
			double tempototal = tempofinal - tempoinicial;
			// tempo total está em nanosegundos - 10^-9 s
			tempototal = tempototal / Math.pow(10, 9);
			System.out.println("string ==> "+tempototal+"s.");
		}
		
		//concatena 32768 caracteres 1 a1, em um buffer de Strings
		public void concatenaBuffer() {
			StringBuffer buffer = new StringBuffer();
			double tempoinicial = System.nanoTime(); //<ctrl + 1>
			for(int i = 0 ; i < 32768 ; i++) {
				buffer.append("a");
			}
				double tempofinal = System.nanoTime();
				double tempototal = tempofinal - tempoinicial;
				// tempo total está em nanosegundos - 10^-9 s
				tempototal = tempototal / Math.pow(10, 9);
				System.out.println("Buffer ==> "+tempototal+"s.");
			}
		
		// recebe uma frase, divida em palavras e imprime cada palavra
		
		public void vetor1k() {
		    int v[] = new int[1000]; // declaração do vetor "v";
		    int i;
		    double tempoinicial = System.nanoTime();
			for(i = 0 ; i < 1000 ; i++) {
				v[i] = i;
			}
			double tempofinal = System.nanoTime();
			double tempototal = tempofinal - tempoinicial;
			System.out.println("vetor mil posições ==> "+tempototal+"Ns.");
		
		}
		
		public void vetor10k() {
		    int v[] = new int[10000]; // declaração do vetor "v";
		    int i;
		    double tempoinicial = System.nanoTime();
			for(i = 0 ; i < 10000 ; i++) {
				v[i] = i;
			}
			double tempofinal = System.nanoTime();
			double tempototal = tempofinal - tempoinicial;
			System.out.println("vetor 10 mil posições ==> "+tempototal+"Ns.");
}
		
		public void vetor100k() {
		    int v[] = new int[100000]; // declaração do vetor "v";
		    int i;
		    double tempoinicial = System.nanoTime();
			for(i = 0 ; i < 100000 ; i++) {
				v[i] = i;
			}
			double tempofinal = System.nanoTime();
			double tempototal = tempofinal - tempoinicial;
			System.out.println("vetor 100 mil posições==> "+tempototal+"Ns.");
}

}