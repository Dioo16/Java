
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        int numero, num;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um número para ver a tabuada dele até o 10\n");
        numero = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            num = numero * i;
            System.out.printf( "\n %d X %d = %d",numero, i, num);
            
        }
        scan.close();

        
    }
    
}
