package SecondoSet;
import java.util.Scanner;
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire numero di controllo");
        int n = input.nextInt();
        int numeroInserito;

        do{
            numeroInserito = input.nextInt();
        }while(numeroInserito != n);
        input.close();
    }

}
