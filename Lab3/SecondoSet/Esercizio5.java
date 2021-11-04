package SecondoSet;
import java.util.Scanner;
public class Esercizio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire due numeri");
        int n = input.nextInt();
        int m = input.nextInt();
        int counter = 0;
        while(n >= m){
            n = n - m;
            counter++;
        }
        System.out.println("Risultato: " + counter + "\nResto: " + n);
        input.close();
    }
}
