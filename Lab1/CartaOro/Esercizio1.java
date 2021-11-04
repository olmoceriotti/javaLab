package CartaOro;
import java.util.Scanner;
public class Esercizio1 {
    public static void main(String[] args) {
        //Esercizio 1
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int a = 2;
        for (int i = 0; i < count; i++) {
            a = (3 * a) - 2;
        }
        System.out.println(a);
        input.close();
    }
}
