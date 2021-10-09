import java.util.Scanner;

public class Exerciciocap9 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a acount number");
		int account = sc.nextInt();
		bank.setAccountnumber(account);
		
		System.out.print("Enter the holder's name");
		sc.nextLine();
		String name = sc.nextLine();
		bank.setName(name);
		
		System.out.print("Is there initial deposit(y/n)?");
		char dp = sc.next().charAt(0);
		
		if (dp == 'y') {
			double inideposit = sc.nextDouble();
			bank.setAccount(inideposit);
		}
		System.out.println(bank);
		System.out.println("Enter a deposit");
		double value = sc.nextDouble();
		bank.deposit(value);
		System.out.println(bank);
		System.out.println("Enter a withdraw");
		value = sc.nextDouble();
		bank.withdraw(value);
		sc.close();
		System.out.println(bank);
		

	}

}
