package SecondoSet;
import java.util.Scanner;
public class Esercizio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int counter = 2;
        int termineNmeno = 0;
        int termineN = 1;
        int mobile;

        if(n == 0){
            System.out.println(termineNmeno);
        }else if(n == 1){
            System.out.println(termineN);
        }else{
            System.out.print(termineNmeno + " ");
            System.out.print(termineN + " ");
            while (counter < n){
                counter++;
                mobile = termineN;
                termineN = termineN + termineNmeno;
                termineNmeno = mobile;
                System.out.print(termineN + " ");
            }
        }

        input.close();
    }
}
