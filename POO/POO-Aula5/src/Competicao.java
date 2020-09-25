
public class Competicao {

	public static void main(String[] args) {
		Atleta   falcao    = new Atleta  ("Paulo Roberto Falcao", 5);
		Saltador sotomayor = new Saltador("Javier Sotomayor", 76, 245);
		Corredor bolt      = new Corredor("Usain Bolt", 709, 37.58);
		
		falcao.imprimir();      // eh o proprio metodo da classe de falcao, ou seja, classe Atleta
		sotomayor.imprimir();   // eh metodo herdado da classe Atleta
		sotomayor.exibir();     // eh o proprio metodo da classe de sotomayor, Saltador
		bolt.imprimir();        // eh o proprio metodo da classe de bolt, Corredor
	}
}
