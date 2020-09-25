package br.pucpr.Principal;

import java.util.Scanner;

import br.pucpr.TabelaVerdade.TabelaVerdade;

public class Principal {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		TabelaVerdade tabelaVerdade = new TabelaVerdade();
		int controle = 1;
		
		while (controle != 5) {
		
		System.out.println("Escolha a operação: 1-e; 2-ou; 3-implicação; 4-bicondicional; 5-finalizar o programa: "); //faz a leitura de um inteiro a partir do teclado
		int opcao = SC.nextInt(); //armazena a leitura do teclado
		
		System.out.println("Digite true ou false para A: ");
		boolean a = SC.nextBoolean();
		
		System.out.println("Digite true ou false para B: ");
		boolean b = SC.nextBoolean();
		
		switch (opcao) {
		
		case 1:
			tabelaVerdade.operacaoE(a, b);
			break;
		
		case 2:
			tabelaVerdade.operacaoOU(a, b);
			break;
			
		case 3:
			tabelaVerdade.operacaoIMP(a, b);
			break;
			
		case 4:
			tabelaVerdade.operacaoBI(a, b);
			break;
		
		case 5:
			controle = 5;
			break;
			}
		}
		
	}

}
