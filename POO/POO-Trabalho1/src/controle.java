
public class controle {
	
	public static void main(String[] args) {

		System.out.println("Vermelho");
		
		//laço de repetição 10 vezes mudando a cor
		int cont = 0;
		while (cont < 10){
			semaforo.mudaProximaCor();
			cont += 1;
			if (semaforo.cor == 0) {
				System.out.println("Vermelho");
			}else if (semaforo.cor == 1) {
				System.out.println("Amarelo");
			}else if (semaforo.cor == 2) {
				System.out.println("Verde");
			}
		}
		//fixa a cor do semaforo em amarelo
		if (cont == 10) {
			semaforo.cor = 1;
			System.out.println("Semaforo fixo em amarelo");
		}
	}

}
