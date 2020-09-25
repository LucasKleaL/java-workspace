import java.util.ArrayList;

public class TesteArray {
	
	private ArrayList<Integer> vetor; //Atributo da classe é uma colecao de objetos Integer em um Arraylist

	public TesteArray() {
		this.vetor = new ArrayList<Integer>(); //cria o vetor 
	}
	
	public static void main(String[] args) {
		
		TesteArray objTeste = new TesteArray(); //objeto
		
		objTeste.vetor.add(new Integer(10)); //Colocando objetos no Arraylist. Não tem limite, tamanho dinâmico
		objTeste.vetor.add(new Integer(8)); //Colocando objetos no Arraylist. Não tem limite, tamanho dinâmico
		objTeste.vetor.add(new Integer(9)); //Colocando objetos no Arraylist. Não tem limite, tamanho dinâmico
		objTeste.vetor.add(new Integer(6)); //Colocando objetos no Arraylist. Não tem limite, tamanho dinâmico
		
		double somaValores = 0;
		
		for (Integer i : objTeste.vetor) { //percorre todos os elementos do vetor/arraylist
			somaValores += i;
		}

		double media = somaValores / objTeste.vetor.size(); //vetor.size = obtem o total de elementos dentro do Arraylist
		
		System.out.println("Acumulado = " + somaValores);
		System.out.println("Total de elementos = " + objTeste.vetor.size()); 
		System.out.println("Media = " + media);
	}

}
