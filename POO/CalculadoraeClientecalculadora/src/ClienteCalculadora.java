
public class ClienteCalculadora {
	public static void main (String[] args) {
		//invocação de metodos da classe calculadora
		int z;
		z = Calculadora.soma(5, 8);
		System.out.println(z);
		z = Calculadora.subtracao( 10, 20);
		System.out.println(z);
		
		//exibe os atributos da classe Calculadora
		System.out.println("Total de somas = " + Calculadora.contadorAdicao);
		System.out.println("Total de subtracões = " + Calculadora.contadorSubtracao);
	}
}
