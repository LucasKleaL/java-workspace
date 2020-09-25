package Especialista;
import Matematica.Circulo;
import Matematica.Retangulo;

public class EngenheiroCivil {
	
	private static String nome = "Oscar Niemeyer";
	private static int idade = 104;
	public float n1 = (float) 4.7;
	public float n2 = (float) 8.2;
	private static void exibir_dados_pessoais() 
	
	{
		System.out.println( nome );
		System.out.println( idade + " anos");
	}
	public static void main(String[] args)
	{
		exibir_dados_pessoais();
		Retangulo.definir_lados( (float)4.7,  (float)8.2 );
		System.out.println( "Area do retangulo = " + Retangulo.area( (float)4.7,  (float)8.2 ));
		System.out.println( "Perimetro do retangulo = "+ Retangulo.perimetro( (float)4.7,  (float)8.2 ));
		System.out.println( "Area do circulo de raio 5 = " + Circulo.area( 5 ) );
		System.out.println( "Perimetro do circulo de raio 5 = " + Circulo.perimetro( 5 ) );
		System.out.println( "Com raio = 10:");
		Circulo.defina_raio( 10 );
		System.out.println( "area = " + Circulo.area() );
		System.out.println( "perimetro = "+ Circulo.perimetro());
	}
}