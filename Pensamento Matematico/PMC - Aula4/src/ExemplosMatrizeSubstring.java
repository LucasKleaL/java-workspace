import java.util.Scanner;

public class ExemplosMatrizeSubstring {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //leitura do teclado (input)
		
		String[][] matriz = new String [5][8]; //cria e instacina uma matriz com 5 linhas e 8 colunas
		matriz [0][0] = "p";
		matriz[1][0] = "v";
		
		//percorre a matriz
		for (int i=0; i < 5; i++) { //linha
			for (int j = 0; j < 8; j++) { //coluna
				matriz[i][j] = ("Indice linha: "+ i);
			}
		}
		
		//imprime a matriz
		System.out.println("Imprimindo a matriz");
		for (int i=0; i < 5; i++) { //linha
			
			for (int j = 0; j < 8; j++) { //coluna
				System.out.print(matriz[i][j]+ " ");
			}
		}
			
		
		
		
		
		
		
		
		
		System.out.println("Digite uma sentença: ");
		String stringLida = scanner.nextLine(); //input
		
		System.out.println("Tamanho da string: " + stringLida.length()); //analisa o tamanho total da lista em número de caracteres
		
		System.out.println(stringLida.substring(0, 1)); //reparte a string e pega o caractere 0
		System.out.println(stringLida.substring(1, 2));
		System.out.println(stringLida.substring(2, 3));
		
		System.out.println(stringLida.substring(1, 2).equals("^")); //reparte e verifica se o caracter é igual a "^"

	}

}
