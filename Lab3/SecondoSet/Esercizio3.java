package SecondoSet;
import java.util.Scanner;
public class Esercizio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int risultato = 1;
        int esponente;
        do{
            System.out.println("Inserire numero maggiore di zero");
            esponente = input.nextInt();
        }while(esponente <0);
    
        for(int i = 0; i < esponente; i++){
            risultato = risultato * base;
        } 

        System.out.println(risultato);

        input.close();
    }
    
}
