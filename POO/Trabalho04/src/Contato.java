import java.util.ArrayList;

public class Contato {
	private String nome;
	private ArrayList<Mensagem> mensagens;

	
	
public Contato(String nome) { // Construtor
		this.nome = nome;
		this.mensagens = new ArrayList<Mensagem>();
		
	}

public String getNome() { // Coleta o nome
	return nome;
}

public ArrayList<Mensagem> getMensagens() { // Coleta a mensagem
	
	return this.mensagens;
}
	
public void imprimirMensagens() {
	for (Mensagem mensagem : mensagens) {
		System.out.println(mensagem.getTexto());
		}
	}
}


