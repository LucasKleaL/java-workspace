package Matematica;

public class Retangulo {
	
	//atributos
	public float ladoH;
	public float ladoV;
	
	//métodos
	public static void definir_lados(float ladoH, float ladoV) {
	}
	
	public static float area(float ladoH, float ladoV) {
		return (ladoH * ladoV);
	}
	public static float perimetro(float ladoH, float ladoV) {
		return (2 * ladoH + 2 * ladoV);
	}
	
}
