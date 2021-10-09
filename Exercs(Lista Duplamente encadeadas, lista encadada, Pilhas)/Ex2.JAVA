
import java.util.Scanner;

public class circ {

    public static void main(String[] args) {
        double raio;
        double area;
        double volume;
        
        System.out.println("Escreva o valor do raio");
        Scanner scan = new Scanner(System.in);
        raio = scan.nextFloat();
        
        area = Math.PI * Math.pow(raio, 2);
        volume = Math.pow(raio,3)/ 3;
        
        System.out.printf("O valor da area é %,.2f \n e o valor do volume é: %,.2f", area, volume);
        scan.close();

    }