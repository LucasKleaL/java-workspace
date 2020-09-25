import java.util.ArrayList;

public class Contato {
	
	private String nomeContato;
	private ArrayList <Mensagem> mensagens;
	
	
	public Contato (String nomeContato) { //metodo contrutor
		
		this.nomeContato = nomeContato;
		this.mensagens = new ArrayList <Mensagem>();
		
	}
	
	public ArrayList<Mensagem> getMensagens(){
		return this.mensagens;
	}
	
	public String getNomeContato() { //get para o nome do contato
		return this.nomeContato;
	}
	
	public void setNomeContato(String nomeContato) { //set para o nome do contato
		this.nomeContato = nomeContato;
	}
	
	public void imprimirMensagens() {
		for(Mensagem mensagem: this.mensagens) {
			System.out.println(mensagem.getTextoMensagem());
		}
	}
	
}
