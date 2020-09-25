import javax.swing.JOptionPane;

public class Pessoa {
	
	//atributos
	private String nome;
	private String sobrenome;
	
	//metodos
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setSobrenome(String novoSobrenome) {
		this.sobrenome = novoSobrenome;
	}
	public String getNome() {
		return this.nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void imprimePessoa() {
		JOptionPane.showMessageDialog(null, "Pessoa: " + this.getNome() + "" + this.getSobrenome());
	}
}
