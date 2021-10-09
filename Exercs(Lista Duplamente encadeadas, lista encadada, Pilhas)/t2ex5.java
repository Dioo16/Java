import java.util.Scanner;
public class t2ex5 {
    public static void main(String[] args) {
        int n, nc,nd,nu,total;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um número para ver a soma do seus algarismos:\n ");
        n = scan.nextInt();
        scan.close();
        if (n>100) {
            nc = n / 100;
            nd = (n % 100) / 10;
            nu = n % 10;
            total = nc + nd + nu;
            System.out.printf("A soma é %d", total);
            
        }
        else
        {
            nd = n / 10;
            nu = n % 10;
            total = nd + nu;
            System.out.printf("A soma é %d", total);
        }

    }
    
}
