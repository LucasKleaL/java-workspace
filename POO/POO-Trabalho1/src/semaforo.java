
public class semaforo {
	
	static int cor = 0;
	
	static void mudaProximaCor () {
		switch (cor) {
		case 0:
			cor = 1;
			break;
			
		case 1:
			cor = 2;
			break;
			
		case 2:
			cor = 0;
		}
	}
	static void mudaCorFixa(int novaCor) {
		
		cor = novaCor;
	}
	
	static int mostraCor() {
		return cor;
	}

}
