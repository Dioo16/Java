
public class Função {

	public static void main(String[] args) {
		
		int n1 = 5, n2 = 4;
		
		show(sum(n1,n2));
		
		
		
	}
	
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static void show(int total) {
		System.out.println(total);
	}

}
