package SecondoSet;
import java.util.Scanner;
public class Esercizio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int r;
        int yInit;
        int xinit;

        do{
        System.out.println("Inserire due numeri x > 0 e y >= 0");
        x = input.nextInt();
        y = input.nextInt();
        yInit = y;
        xinit = x;
        }while(x <= 0 && y < 0);
            
        while(y > 0){  
            r = x%y;
            x = y;
            y = r; 
        }

        System.out.println("MCD(" + xinit + "," + yInit + ") = " + x );
        input.close();
    }
}
