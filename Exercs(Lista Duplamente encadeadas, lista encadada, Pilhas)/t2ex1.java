import java.util.Scanner;

public class t2ex1 {
    public static void main(String[] args) {
        int qt, nota,acul = 0;;
        float media;
        System.out.printf("Digite a quantidade de notas: ");
        Scanner scan = new Scanner(System.in);
        qt = scan.nextInt();
        
        for (int i = 0; i < qt; i++) {
            nota = scan.nextInt();
            acul = acul + nota;
        }

        media = acul / qt;
       
        System.out.printf("A média é: %,.2f", media);
        scan.close();

        
    }
}
