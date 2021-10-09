
import java.util.Scanner;

public class t2ex3 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Digite o primeiro e segundo numero respectivamente : ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        scan.close();
    
        if (n1 > n2) {
            System.out.printf("O numero maior é o %d", n1);
            
        }
        
        else{
            System.out.printf("O numero maior é o %d", n2);
        }
    
    }  

}
