import javax.swing.JOptionPane;

public class Controle {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(); //invocação do metodo contrutor da classe Pessoa
		Pessoa p2 = new Pessoa();
		
		String n = JOptionPane.showInputDialog(null, "Nome da pessoa 1: ");
		String sn = JOptionPane.showInputDialog(null, "Sobrenome da pessoa 1: ");
		
		p1.setNome(n);
		p1.setSobrenome(sn);
		
		n = JOptionPane.showInputDialog(null, "Nome da pessoa 2: ");
		sn = JOptionPane.showInputDialog(null, "Sobrenome da pessoa 2: ");
		
		p2.setNome(n);
		p2.setSobrenome(sn);
		
		p1.imprimePessoa();
		p2.imprimePessoa();
		
	}
}
