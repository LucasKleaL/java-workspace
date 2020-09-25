import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private  ContaCorrente contaCorrente;
	
	
	public Cliente (String nome , int numero) {
		this.nome = nome;
		this.contaCorrente = new ContaCorrente(numero);
		this.contaCorrente.setCliente(this);
		this.contaCorrente.setSaldo(0);
	}
	
	public void operar() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Cliente: " + this.nome);
		System.out.println("Digite o valor de deposito: ");
		double valor = ler.nextDouble();
		
		this.contaCorrente.depositar(valor);
		
		System.out.println("Digite o valor de saque: ");
		valor = ler.nextDouble();
		
		this.contaCorrente.retirar(valor);
		this.contaCorrente.imprimir();
	}
	public String getNome() {
		return nome;
	}


}
