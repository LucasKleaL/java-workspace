package br.pucpr.TabelaVerdade;

public class TabelaVerdade {

	public void operacaoE(boolean a, boolean b) {
		if (a == true && b == true) {
			System.out.println("O resultado é verdadeiro.");
		}else 
			System.out.println("O resultado é falso.");
	}
	
	public void operacaoOU(boolean a, boolean b) {
		if (a == false && b == false) {
			System.out.println("O resultado é falso."); // F v F = F
		}else {
			System.out.println("O resultado é verdadeiro."); 
		}
	}
	
	public void operacaoIMP(boolean a, boolean b) {
		if (a == true && b == true) {
			System.out.println("O resultado é verdadeiro.");
		}
		else if (a == true && b == false) {
			System.out.println("O resultado é falso.");
		}
		else if (a == false && b == true) {
			System.out.println("O resultado é verdadeiro.");
		}
		else if (a == false && b == false) {
			System.out.println("O resultado é verdadeiro.");
		}
		
	}
	
	public void operacaoBI(boolean a, boolean b) {
		if (a == true && b == true) {
			System.out.println("O resultado é verdadeiro.");
		}
		else if (a == true && b == false) {
			System.out.println("O resultado é falso.");
		}
		else if (a == false && b == true) {
			System.out.println("O resultado é falso.");
		}
		else if (a == false && b == false) {
			System.out.println("O resultado é verdadeiro.");
		}
		
	}
}
