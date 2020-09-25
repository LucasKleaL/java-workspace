package trabalho;

import trabalho.TabelaVerdade;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //cria um scanner 
		TabelaVerdade tabelaverdade = new TabelaVerdade();
		
		System.out.println("Digite uma sentença:");
		String entrada = sc.nextLine(); //armazena uma setenca recebida através de um input do usuario
		
		Integer tamanho = entrada.length(); //atribui a variavel tamanho com o numero total de caracteres da sentenca
		
		if(tamanho == 3) {
			Boolean c2 = entrada.substring(1,2).equals("^"); //verifica se a string na posicao 1 é igual a ^
			if(c2){ // se for verdadeiro = operacao E
				tabelaverdade.calculaE(); //invoca o metodo para a operacao E
				tabelaverdade.imprimeMatriz(); //invoca o metodo para imprimir a matriz
				}else { // se não = operacao OU
					tabelaverdade.calculaOu(); //invoca o metodo para a operacao OU
					tabelaverdade.imprimeMatriz(); //invoca o metodo para imprimir a matriz
				}
		}
		if(tamanho == 4 && entrada.substring(0, 1).equals("p")) {
			tabelaverdade.calculaImplicacao(); //invoca o metodo para a operacao de implicacao
			tabelaverdade.imprimeMatriz(); //invoca o metodo para imprimir a matriz
		}else if(tamanho == 4){
			tabelaverdade.implicacaoInversa(); //invoca o metodo para a operacao de implicacao com valores inversos
			tabelaverdade.imprimeMatriz(); //invoca o metodo para imprimir a matriz
		}
		if(tamanho == 5) {
			tabelaverdade.calculaBiCondicional(); //invoca o metodo para a operacao bicondicional
			tabelaverdade.imprimeMatriz(); //invoca o metodo para imprimir a matriz
		}
	
		
		
		sc.close();
		}
	
}
