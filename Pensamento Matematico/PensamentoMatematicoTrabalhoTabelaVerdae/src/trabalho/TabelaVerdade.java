package trabalho;

public class TabelaVerdade {
	String [][] matriz = new String [5][8]; //cria uma matriz de 5 linhas x 8 colunas
	
	public void atribuicaoValoresTabela () {	//metodo que popula a matriz
		
			matriz[0][0] = " p ";
			matriz[1][0] = " V ";
			matriz[2][0] = " V ";
			matriz[3][0] = " F ";
			matriz[4][0] = " F ";
			
			matriz[0][1] = " q ";
			matriz[1][1] = " V ";
			matriz[2][1] = " F ";
			matriz[3][1] = " V ";
			matriz[4][1] = " F ";
			
			matriz[0][2] = "~p";
			matriz[1][2] = " F ";
			matriz[2][2] = " F ";
			matriz[3][2] = " V ";
			matriz[4][2] = " V ";
			
			matriz[0][3] = " ~q ";
			matriz[1][3] = " F ";
			matriz[2][3] = " V ";
			matriz[3][3] = " F ";	
			matriz[4][3] = " V ";	

			
	}
	
	public void imprimeMatriz() { //metodo que imprime a matriz
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
				}
		System.out.println();
		}
	}
	
	public void calculaImplicacao() { //metodo para calcular a operacao de implicacao
		matriz[0][0] = " p ";
		matriz[1][0] = " V ";
		matriz[2][0] = " V ";
		matriz[3][0] = " F ";
		matriz[4][0] = " F ";
		
		matriz[0][1] = " q ";
		matriz[1][1] = " V ";
		matriz[2][1] = " F ";
		matriz[3][1] = " V ";
		matriz[4][1] = " F ";

		matriz[0][2] = "p->q";
		matriz[1][2] = " V";
		matriz[2][2] = " F";
		matriz[3][2] = " V";	
		matriz[4][2] = " V";	
				
	}
	
	public void calculaE() { //metodo para calcular a operacao E
		matriz[0][0] = " p ";
		matriz[1][0] = " V ";
		matriz[2][0] = " V ";
		matriz[3][0] = " F ";
		matriz[4][0] = " F ";
		
		matriz[0][1] = " q ";
		matriz[1][1] = " V ";
		matriz[2][1] = " F ";
		matriz[3][1] = " V ";
		matriz[4][1] = " F ";
		
		matriz[0][2] = "p^q";
		matriz[1][2] = " V";
		matriz[2][2] = " F";
		matriz[3][2] = " F";	
		matriz[4][2] = " F";	
	}
	
	public void calculaOu() { //metodo para calcular a operacao OU
		matriz[0][0] = " p";
		matriz[1][0] = " V";
		matriz[2][0] = " V";
		matriz[3][0] = " F";
		matriz[4][0] = " F";
		
		matriz[0][1] = " q";
		matriz[1][1] = " V";
		matriz[2][1] = " F";
		matriz[3][1] = " V";
		matriz[4][1] = " F";
		
		matriz[0][2] = "pvq";
		matriz[1][2] = " V";
		matriz[2][2] = " V";
		matriz[3][2] = " V";	
		matriz[4][2] = " F";	
	}
	
	public void calculaBiCondicional() { //metodo para calcular a operacao bicondicional
		matriz[0][0] = "p";
		matriz[1][0] = "V";
		matriz[2][0] = "V";
		matriz[3][0] = "F";
		matriz[4][0] = "F";
		
		matriz[0][1] = " q";
		matriz[1][1] = " V";
		matriz[2][1] = " F";
		matriz[3][1] = " V";
		matriz[4][1] = " F";
		
		matriz[0][2] = " p<->q";
		matriz[1][2] = "   V";
		matriz[2][2] = "   F";
		matriz[3][2] = "   F";	
		matriz[4][2] = "   V";	
	}
	
	public void implicacaoInversa() { //metodo para calcular operacao com valores de implicacao com valores inversos
		matriz[0][0] = " q ";
		matriz[1][0] = " V ";
		matriz[2][0] = " V ";
		matriz[3][0] = " F ";
		matriz[4][0] = " F ";
		
		matriz[0][1] = " p ";
		matriz[1][1] = " V ";
		matriz[2][1] = " F ";
		matriz[3][1] = " V ";
		matriz[4][1] = " F ";

		matriz[0][2] = "q->p";
		matriz[1][2] = " V";
		matriz[2][2] = " F";
		matriz[3][2] = " V";	
		matriz[4][2] = " V";	
	}
	
	
	
}
