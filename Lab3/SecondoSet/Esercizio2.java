package SecondoSet;
import java.util.Scanner;
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.println("Inserire numero maggiore di zero");
            n = input.nextInt();
        }while(n < 0);
        long risultato = 1;

        if(n == 0){
            
        }else{
            for(int i = 0; i < n; i++){
                risultato = risultato * (n-i);
            }
        }
        
        System.out.println(risultato);

        input.close();
    }
}
