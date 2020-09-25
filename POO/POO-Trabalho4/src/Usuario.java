import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String nome;
	private ArrayList<Contato> contatos;
	private String nomeContato;
	
	
	String inputContato, mensagem;
	Scanner scanner = new Scanner(System.in);
	
	
	public Usuario(String nome) {
		
		this.nome = nome;
		this.contatos = new ArrayList<Contato>();
		
	}
	
	
	public void inserirContato(String nomeContato) { //metodo para inserir um contato (nome) no array
		
		Scanner leitorContato = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------");
		System.out.println("1 - Adicionar Contato");
		System.out.println("Digite o nome do contato: ");
		System.out.println();
		inputContato = leitorContato.nextLine();
		
		System.out.println("Operacao realizada com sucesso.");
		System.out.println("Tecle algo e pressione enter para continuar...");
		
		nomeContato = inputContato;
		this.contatos.add(new Contato(nomeContato));
		
		System.out.println(contatos);
		
	}
	
	public void enviarMensagem(String nomeContato, String mensagem) { //metodo para enviar uma mensagem
		
		System.out.println("---------------------------------------------------");
		System.out.println("2 - Enviar Mensagem");
		System.out.println("Digite o contato para enviar a mensagem: ");
		System.out.println();
		this.nomeContato = scanner.nextLine();
		System.out.println("---------------------------------------------------");
		System.out.println("Digite a mensagem para [" + this.nomeContato + "]");
		System.out.println();
		this.mensagem = mensagem;
		this.mensagem = scanner.nextLine();
		System.out.println();
		
		Contato contato = this.encontraContato(this.nomeContato);
		if (contato != null) {
			contato.getMensagens().add(new Mensagem ("[ENVIAR]" + this.mensagem));
			System.out.println("Mensagem enviada com sucesso.");
		}else
			System.out.println("Contato inexistente. Por favor tente novamente.");
		
	}
	
	public void receberMensagem(String nomeContato, String mensagem) { //metodo para receber uma mensagem
		
		System.out.println("---------------------------------------------------");
		System.out.println("3 - Receber Mensagem");
		System.out.println("Digite o contato que você deseja receber a mensagem: ");
		System.out.println();
		this.nomeContato = scanner.nextLine();
		System.out.println();
		System.out.println("Mensagens de: [" + this.nomeContato + "]");
		System.out.println();
		this.mensagem = mensagem;
		this.mensagem = scanner.nextLine();
		System.out.println();
		
		Contato contato = this.encontraContato(this.nomeContato);
		if (contato != null) {
			contato.getMensagens().add(new Mensagem ("[RECEBER]" + this.mensagem));
		}else
			System.out.println("Contato [" + this.nomeContato + "] inexistente.");
	}
	
	public void imprimirMensagem(String nomeContato) { //metodo para imprimir as mensagens (print)
		
		System.out.println("---------------------------------------------------");
		System.out.println("4 - Imprimir Mensagens");
		System.out.println("Conversas de: [" + this.nome + "]");
		System.out.println();
		
		for (Contato c:this.contatos) {
			System.out.println();
			System.out.println("Contato [" + c.getNomeContato() + "] tem [" + c.getMensagens().size() + "] mensagens.");
			System.out.println();
			c.imprimirMensagens();
		}
		
	}
	
	public Contato encontraContato(String nomeContato) { //metodo que busca um nome fornecido dentro da array de contatos
		
		for (Contato c : this.contatos) {
			if (c.getNomeContato().equals(this.nomeContato)) {
				return c;
			}
		}
		return null;
		
	}
	
	public void conversar() { //metodo que possui um menu onde o usuario pode selecionar oque deseja executar 
		
		int opcao;
		boolean fim = false;
		Scanner scannerOpt = new Scanner(System.in);
		
		while(!fim) {
			
			System.out.println("-----------------------------------------------");
			System.out.println("                    MENU");
			System.out.println("-----------------------------------------------");
			System.out.println("1 - Adicionar contato.");
			System.out.println("2 - Enviar mensagem para um contato.");
			System.out.println("3 - Receber mensagem de um contato.");
			System.out.println("4 - Imprimir mensagens.");
			System.out.println("5 - Finalizar.");
			System.out.println("Digite a opcao desejada: ");
			
			opcao = scannerOpt.nextInt();
			
			switch(opcao) {
			
			case 1: //adicionar contato
				
				inserirContato(nomeContato);
				break;
				
			case 2: //enviar mensagem
				
				enviarMensagem(this.nomeContato, this.mensagem);
				break;
				
			case 3: //receber mensagem de outro contato
				
				receberMensagem(this.nomeContato, this.mensagem);
				break;
				
			case 4: //imprimir mensagens
				
				imprimirMensagem(this.nomeContato);
				break;
				
			case 5: //finaliza o programa
				fim = true;
				System.out.println("Programa finalizado.");
				break;
				
			default:
				System.out.println("Opção solicitada invalida. Por favor tente novamente.");
				break;
			
			}
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Usuario lucas = new Usuario("Lucas");
		lucas.conversar();
		
	}
	

}
