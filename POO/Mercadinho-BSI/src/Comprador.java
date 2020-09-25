
public class Comprador {

	public static void main(String[] args) {
		
		int max_insercao = 10;
		int max_remocao = 4;
		double max_preco = 80.00;
		
		for (int i = 0; i < max_insercao; i++)
			Carrinho.inserir();
		System.out.println("Total de itens inseridos: " + Carrinho.quantidade());
		
		for (int i = 0; i < max_remocao; i++)
			Carrinho.remover();
		System.out.println("Quantidade do carrinho: " + Carrinho.quantidade());
		
		System.out.println("Preco a pagar: " + Carrinho.totalizar(max_preco));
		

	}

}
