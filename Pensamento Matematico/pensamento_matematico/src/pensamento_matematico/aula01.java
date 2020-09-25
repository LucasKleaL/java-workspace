package pensamento_matematico;
import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in); //scanner é uma classe que faz leitura do teclado
		
		System.out.println("Digite o valor verdade de A: ");
		boolean a = leitura.nextBoolean();
		
		System.out.println("Digite o valor verdade de B: ");
		boolean b = leitura.nextBoolean();
		
		if (a == true && b == true) {
			System.out.println("O resultado de A ^ B = verdadeiro");
		} 
		else
			if(a == true && b == false); {
				System.out.println("O resultado de A ^ B = falso");
			}
		
	}

}
