package CartaOro;
import java.util.Scanner;
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        double y;
        do{
            y = input1.nextDouble();
            if( y >= 1){
                System.out.println("Valore non valido, selezionare valore inferiore a 1");
            }
        }while(y >= 1);
        double x, n=0;
        double EstremoInf = 1-y;
        do{
            x = n/(n+1);
            if(x<=EstremoInf || x >= 1){
                n++;
            }
        }while(x<= EstremoInf || x >= 1);
        System.out.println(n);
        input1.close();
    }
}
