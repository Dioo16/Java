
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		double x1,x2;
        double y1,y2;
        double dist;
        
        System.out.println("Escreva o valor dos dois pontos, x e y, respectivamente");
        Scanner scan = new Scanner(System.in);
        x1 = scan.nextFloat();
        x2 = scan.nextFloat();
        y1 = scan.nextFloat();
        y2 = scan.nextFloat();
        
        dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        
        
        
        System.out.printf("O valor da distancia  é: %,.2f", dist);
        scan.close();
	}
}

/*Ler as coordenadas (x, y) de dois pontos P1 e P2, calcular a distância entre eles e exibir o resultado. 
A distância é dada por  . Pesquise na classe Math do Java para o uso da raiz quadrada.*/
    