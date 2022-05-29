package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController op = new OperacoesController();
		op.concatenaString();
		op.concatenaBuffer();
		op.vetor1k();
		op.vetor10k();
		op.vetor100k();
		
				
	}

}
