import java.util.Iterator;
import java.util.Scanner;

public class vetorzim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vect = new double[100];
		int[] quarto = new int[9];
		String[] nomeEmail = new String[18];
		vect[1] = 5;
		
		System.out.println(vect[1]);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Say the number of room that you do to choice?");
			quarto[i] = sc.nextInt();
			System.out.println("Enter your name and email, respectively");
			sc.nextLine();
			nomeEmail[i] = sc.nextLine();
			nomeEmail[i+10] = sc.nextLine();
		}
		
		for( int i =0; i < 3; i++) {
			int count = 0;
			for(int x = 0; x<3; x++) {
				if(quarto[i] < quarto[x] ) {
					count++;
					
					if(count == 2) {
						System.out.println(quarto[i] + "\n" + nomeEmail[i] + "\n"+ nomeEmail[i+10]);
					}
				}
			}
		}
		
		
		
		
	}

}
