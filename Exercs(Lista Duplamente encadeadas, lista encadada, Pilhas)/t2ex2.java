public class t2ex2 {
    public static void main(String[] args) {
        int vet[] = new int[50];
        
        for(int i=0; i<vet.length; i++){
            vet[i] = 101 + i;
        }
        for(int i=0; i<vet.length; i++){
            System.out.printf("O vetor na posição [%d] é igual a  %d\n", i, vet[i]);
        }

    }
    
}
