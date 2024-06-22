
package vetores;
import java.util.Scanner;
public class Vetores {
  
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas vão falar suas alturas ?");
        int N = sc.nextInt();
        
        System.out.println("Certo diga as "+N+ " alturas aqui embaixo:");
        double[] vetor = new double[N];
        
         double total = 0;
         
        for(int i=0 ; i<N ; i++){
            vetor[i] = sc.nextDouble();
            System.out.println("pessoa "+ N + " tem o tamanho de " + vetor[i]);
            System.out.println("");
            total = total + vetor[i];
        }
            
        double quantidadeMedia = total/N; 
        
        System.out.println("A altura media destas "+ N +"pessoas é de "+ quantidadeMedia);
        
        sc.close();
    }
    
}
