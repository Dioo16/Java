import java.util.Iterator;
import java.util.Scanner;//Necess�rio importar o java.util.Scanner

public class Program1 {

	public static void main(String[] args) {

		System.out.println("gay");

		// casting

		int a = 2;
		int b = 3;

		double c = (double) a / b;

		System.out.println(c);

		Scanner sc = new Scanner(System.in); // precisa criar o ''construtor'' para impress�o
		String x;
		String s1;
		char a1;
		int n;
		x = sc.next(); // Precisa indicar o next + o tipo que queremos
		n = sc.nextInt();

		a1 = sc.next().charAt(0);// Pegando s� um char(�nica letra)

		System.out.println(x);

		s1 = sc.nextLine(); // ler at� a prox linha

		System.out.println(s1);

		while (n > 5) {
			n++; //while
		}

		
		for(int i=0; i<n; i++ ) {
			System.out.println("gay");    //for
		
		}
		
		//Sempre usar camel case
		
		//Opera��es bitwise
		
		//Opera��es com string
		
		
		String original = "AAAAAAA";
		String lower = original.toLowerCase();
		lower.trim();//vai eliminar os espa�os em branc
		lower.substring(2, 10);//de caractere 2 at� o caractere 10
		lower.replace('A', 'x');//Sempre que achar 'A' ele vai trocar por 'x'
		lower.indexOf('A'); //Pega a primeira ocorrencia de 'A'
		lower.lastIndexOf('A');//Verifica a ultima ocorrencia
		System.out.println(lower);
		System.out.println(lower.toUpperCase());//transformando em upper case
		
		
		
	}

}
