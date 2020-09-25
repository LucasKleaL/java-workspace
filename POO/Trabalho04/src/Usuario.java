import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String nome;
	private ArrayList<Contato> contatos;
	private ArrayList<Mensagem> mensagens;
	
	String inputContato, mensagem;
	Scanner scanner = new Scanner(System.in);
	
	
	
	public Usuario(String nome) {
		this.contatos = new ArrayList<Contato>();
		this.nome = nome;
		
	}
		
	public static void main(String[] args) {
		
		Usuario jose = new Usuario("Jose da silva");
		jose.conversar();
		
	}
	
	public void inserirContato(String nome) { //metodo para inserir um contato (nome) no array
		
		System.out.println("Digite o nome do contato: ");
		inputContato = scanner.next();		
		Contato meusContatos = new Contato(inputContato);
		System.out.println("Operacao realizada com sucesso.");
		
	}
	
	public void enviarMensagem(String nome, String mensagem) { //metodo para enviar uma mensagem
		Contato contato = this.encontraContato(nome);
		if (contato != null) {
			contato.getMensagens().add(new Mensagem("[ENVIAR] " + mensagem));
			System.out.println("/n-- operação realizada com sucesso!");			
		}else {
			System.out.println("Contato [" + nome + "] não foi localizado!");
		}
		
		
	}
	
	public void receberMensagem(String nome, String mensagem) { //metodo para receber uma mensagem
		Contato contato = this.encontraContato(nome);
		if (contato != null) {
			contato.getMensagens().add(new Mensagem("[RECEBER] " + mensagem));
			System.out.println("/n-- operação realizada com sucesso!");			
		}else {
			System.out.println("Contato [" + nome + "] não foi localizado!");
		} 
		
		
	}
	
	public void imprimirMensagem(String nome) { //metodo para imprimir as mensagens (print)
		System.out.println("Conversas de: [" + this.nome + "]");
		System.out.println();
		for(Contato c : this.contatos) {
			System.out.println();
			System.out.println("Contato [" + c.getNome() + "] tem [" + c.getMensagens().size() + "] mensagens.");
			c.imprimirMensagens();
		}
		
		
	}
	
	public Contato encontraContato(String nome) { //metodo que busca um nome fornecido dentro da array de contatos
		for (Contato c : this.contatos) {
			if (c.getNome().equals(nome)) 
				return c;
			
		}
		return null;
		
		
	}
	
	public void conversar() { //metodo que possui um menu onde o usuario pode selecionar oque deseja executar 
		int opcao;
		String entrada, mensagem;
		boolean fim = false;
		
		
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
			
			opcao = scanner.nextInt();
			
			switch(opcao) {
			
			case 1: // Adicionar contato
				System.out.println("1 - Adicionar contato");
				System.out.println("Insira o nome do contato: ");
				entrada = scanner.next();
				// Insere o contato
				this.contatos.add(new Contato(entrada));
				System.out.println("/n-- operação realizada com sucesso!");
				System.out.println("Tecle algo para continuar...");
				scanner.next();

				break;
				
				
			case 2: //enviar mensagem
				Scanner leitor = new Scanner(System.in);
				System.out.println("2 - Enviar mensagem");
				System.out.print ("\n* Insira o nome do contato ");
				System.out.println();
				this.nome = leitor.nextLine();
				System.out.println("\n* Insira a mensagem para [" + this.nome +"]:");
				this.mensagem = leitor.nextLine();
				enviarMensagem(this.nome, this.mensagem); // Faz o envio da mensagem para a lista de mensagens
				System.out.println("\nTecle algo para continuar...");
				scanner.nextLine();
				System.out.flush();
				break;
				
			case 3: //receber mensagem de outro contato
				Scanner leitor2 = new Scanner(System.in);
				System.out.println("3 - Receber mensagem");
				System.out.println("Insira o nome do contato");
				entrada = leitor2.nextLine();
				System.out.println("Insira a mensagem de [" + entrada +"]:");
				mensagem = leitor2.nextLine();
				this.receberMensagem(entrada, mensagem); // Faz o envio da mensagem para a lista de mensagens
				System.out.println("Tecle algo para continuar...");
				scanner.nextLine();
				System.out.flush();
				break;
				
			case 4: //imprimir mensagens
				System.out.println("4 - Imprimir conversa");
				System.out.println("\n*** Conversas de: [" + this.nome + "] ***");
				for(Contato c : this.contatos) {
					System.out.println("\n--- Contato [" + c.getNome() + "] tem [" + c.getMensagens().size() + "] mensagens");
					c.imprimirMensagens();
				}
				
			case 5: //finaliza o programa
				fim = true;		
				
			default:
				System.out.println("Opção inválida, tente novamente!");

			}			
			this.cls();
		}	
	}
			public void cls() {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
			}
}
