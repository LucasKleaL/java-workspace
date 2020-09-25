
public class aula02While {
	
		public static void main (String[] args) {
			int i = 5;
			do {
				i--;
				if (i == 3)
					continue;
				System.out.println("i = " + i);
			}while (i > 0 );
			
			System.out.println("Hello world");
		}

}
