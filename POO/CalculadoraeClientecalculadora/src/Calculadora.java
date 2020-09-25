
public class Calculadora {
	//Definindo os atributos
	static int contadorAdicao = 0;
	static int contadorSubtracao = 0;
	
	//Definindo os métodos
	static int soma(int a, int b) {
		contadorAdicao++;
		return a + b;
	}
	static int subtracao(int a, int b) {
		contadorSubtracao++;
		return a - b;
	}
}
