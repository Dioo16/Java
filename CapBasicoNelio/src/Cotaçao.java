
import java.util.Scanner;

public class Cotaçao {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		System.out.println("How many dollars do you want to buy?");
		int qdollars = sc.nextInt();
		sc.close();
		
		currencyCorverter con = new currencyCorverter();
		
		System.out.println(con.Conversion(qdollars, price));
		System.out.println(con.withIOF(qdollars, price));
		
		
	}

}
