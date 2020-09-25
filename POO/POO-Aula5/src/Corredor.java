
public class Corredor extends Atleta {
	private double velocidade;
	
	public Corredor(String nome, int numero, double velocidade) {
		super(nome, numero); 	// chama construtor da superclasse
		this.velocidade = velocidade;
	}
	public void imprimir() {
		super.imprimir(); 		// chama m�todo da superclasse
		System.out.println(velocidade);
	}
	public void correr(double velocidade) {
		this.velocidade = velocidade;
	}

}
