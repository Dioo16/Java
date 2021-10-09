import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExecLista {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US); // Imprimir com ponto
		List<Employe> listemp = new ArrayList<>();
		System.out.println("How many employes will be registered?");
		int numberEmp = sc.nextInt();

		for (int i = 0; i < numberEmp; i++) {
			System.out.println("");
			System.out.println("Employe: " + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.next();
			while(hasId(listemp, id)) {
				System.out.println("The already taken, try again!");
				id = sc.nextInt();
			}
			sc.next();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employe emp = new Employe(id, name, salary);
			listemp.add(emp);
		}
		System.out.println("Enter the ID to increase salary");
		int cId = sc.nextInt();
		Integer conf = getId(listemp, cId);
		if (conf == null) {
			System.out.println("The id does not exists");
		} else {
			System.out.println("How many percent?");
			int percent = sc.nextInt();
			listemp.get(cId).IncreaseSalary(percent);
		}

		for (Employe emp : listemp) {
			System.out.println(emp);
		}
		sc.close();

	}

	public static Integer getId(List<Employe> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}

		return null;
	}

	public static boolean hasId(List<Employe> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return true;
			} 
			
		}
		return false;
	}

}