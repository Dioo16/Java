
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MatrizExec {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		List<Integer> numsn = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o indice da matriz");
		int ind = sc.nextInt();
		System.out.println("Digite a column da matriz");
		int col = sc.nextInt();

		int[][] myMat = new int[ind][col];// Criando uma matriz bidimensional

		int total = myMat.length * myMat.length;
		System.out.println(total);

		for (int i = 0; i < myMat.length; i++) {
			for (int x = 0; x < myMat.length; x++) {		
				myMat[i][x] = sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i < total; i++) {

			for (int x = 0; x < total; x++) {
			

				if(i == x) {
					System.out.println(myMat[i][x]);
				}
				
			}
		}
		
	
	}

}
