import java.util.Scanner;
//Scrivere un programma Java che calcola il valore assoluto di un numero intero, letto da tastiera.
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire un numero");
        int n = input.nextInt();
        int n2 = 0;
        
        if(n < 0)
            n2 = -n;
        else
            n2 = n;
        
        System.out.println("Il valore assoluto di " + n + " è " + n2);
        input.close();
    }
}