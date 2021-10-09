
import java.util.Scanner;

public class t2ex4 {
    
    public static void main(String[] args) {
        int n1, n2, n3;
        double media;
        String type;
        String p = "P";
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Digite o tipo de média(P ou A), e as 3 notas, respectivamente ");
        type = scan.nextLine();
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
         

        if (type.equals(p)) {

            media = (n1 + n2 + n3) / 3; 
        }

        else
        {
            media = n1 + n2 + n3;
        }
        
        System.out.printf("A média(%s) é: %,.1f", type, media );
        scan.close();

    }
    
}
