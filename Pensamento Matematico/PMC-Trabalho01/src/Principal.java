import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		TabelaVerdade tabelaverdade = new TabelaVerdade();
		
		tabelaverdade.atribuicaoValoresTabela();
		
		
		
		Scanner scanner = new Scanner(System.in); //leitura do teclado (input)
		
		System.out.println("Digite a sentença desejada. Modelos válidos: pvq / p->q");
		String stringLida = scanner.nextLine();
		
		int tamanhoSentenca = stringLida.length();
		System.out.println("Tamanho da sentença: " + tamanhoSentenca); //analisa o tamanho total da lista em número de caracteres
		
		if (tamanhoSentenca == 3) {
			String p1 = stringLida.substring(0, 1); //reparte a string e pega o caractere 0
			String p2 = stringLida.substring(1, 2); //reparte a string e pega o caractere 1
			String p3 = stringLida.substring(2, 3); //reparte a string e pega o caractere 2
			
			if (stringLida.substring(1, 2).equals("^")) { //operacao E
				tabelaverdade.operacaoE();
			}else { //operacao OU
				tabelaverdade.operacaoOU();
				
			}
		}
		else if(tamanhoSentenca == 4) {
			
			tabelaverdade.operacaoIMP(); //invoca a operacao de imposicao
			
			String p1 = stringLida.substring(0, 1); //reparte a string e pega o caractere 0
			String p2 = stringLida.substring(1, 2); //reparte a string e pega o caractere 1
			String p3 = stringLida.substring(2, 3); //reparte a string e pega o caractere 2
			String p4 = stringLida.substring(3, 4); //reparte a string e pega o caractere 3
			
		}else {
			String p1 = stringLida.substring(0, 1); //reparte a string e pega o caractere 0
			String p2 = stringLida.substring(1, 2); //reparte a string e pega o caractere 1
			String p3 = stringLida.substring(2, 3); //reparte a string e pega o caractere 2
			String p4 = stringLida.substring(3, 4); //reparte a string e pega o caractere 3
			String p5 = stringLida.substring(4, 5); //reparte a string e pega o caractere 4
			
			tabelaverdade.operacaoBI();
		}
		
		System.out.println("Imprimindo a matriz");
		for (int i=0; i < 5; i++) { //linha
			
			for (int j = 0; j < 8; j++) { //coluna
				System.out.print(tabelaverdade.matriz[i][j]+ " "); //print de cada elemento da matriz
			}
			System.out.println();
		}
		
		System.out.println("");
	}

}
