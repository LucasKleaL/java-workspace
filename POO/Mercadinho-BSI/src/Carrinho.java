
public class Carrinho {
	
	private static int maximo = 10;
	private static int quantidade = 0;
	private static int inseridos = 0;
	private static int removidos = 0;
	private static double preco_unitario = 10.00;
	
	public static void inserir() {
		
		assert (quantidade < maximo): "Erro: carrinho cheio, qunatidade maxima excedida."; //pre-condicao
		quantidade ++;
		inseridos ++;
		assert (quantidade == inseridos - removidos); //invariante
	}
	
	public static void remover() {
		
		assert (quantidade > 0): "Erro: carrinho vazio."; //pre-condicao
		quantidade--;
		removidos++;
		assert (quantidade == inseridos - removidos): "Erro: quantidade de itens inconsistente."; //invariante
	}
	
	public static int quantidade() {
		
		return quantidade;
	}
	
	public static double totalizar(double preco_maximo) {
		
		double preco_total = preco_unitario * quantidade;
		
		assert (preco_total <= preco_maximo): "Erro: preço maior que o valor maximo."; //pos condicao
		
		return preco_total;
	}
}
