
public class Saltador extends Atleta{
	private int altura;
	
	public Saltador(String nome, int numero, int altura) {
		super(nome, numero);     // chama construtor da superclasse
		this.altura = altura;
	}
	public void exibir() {
		imprimir(); 				// chama método da superclasse
		System.out.println(altura);
	}
	public void saltar(int altura) {
		this.altura = altura;
	}


}
