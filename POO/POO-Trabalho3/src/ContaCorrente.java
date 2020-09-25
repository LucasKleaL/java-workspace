
public class ContaCorrente {

	private int numero;
	private double saldo;
	private Cliente cliente; 
	
	public ContaCorrente(int numero) {
		this.numero = numero;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setSaldo(double saldo) { //metodo saldo
		this.saldo = saldo;
	}
	
	public void depositar(double valor) { //metodo depositrar
		this.saldo = saldo + valor; 
	}
	
	public void retirar(double valor) { //metodo sacar/retirar
		assert(this.saldo > 0): "Erro: o saldo não pode ser negativo."; //assert - o saldo nao pode ser negativo
		this.saldo = saldo - valor;
		//todo
	}
	
	public double verificar() {
		//todo
		return 0;
	}
	public void imprimir() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Dados da conta corrente: ");
		//todo:
		System.out.println("Nome do cliente: " + this.cliente.getNome()); //imprime o nome do cliente
		System.out.println("Saldo da conta: " + this.saldo); //imprime o saldo da conta
		System.out.println("Numero da conta: " + this.numero); //imprime o numero da conta
		System.out.println("-----------------------------------------------------");
	}
}
