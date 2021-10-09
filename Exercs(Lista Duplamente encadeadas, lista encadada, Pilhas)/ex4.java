

import java.util.Scanner;


public class ex4 {

     public static void main(String[] args) {
         int number;
         Scanner scan = new Scanner(System.in);
         number = scan.nextInt();
         scan.close();
         System.out.printf(" Digite um número para saber se ele é par ou impar");
         if (number % 2 == 0 ) {
            System.out.printf("o número é par ");
             
         }
        else
        {
            System.out.printf(" o número é impar ");

        }
    }    
    
}
