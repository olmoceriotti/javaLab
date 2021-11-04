import java.util.Scanner;
//Scrivere un programma Java che, letti in input due numeri interi, calcola la divisione tra interi. Utilizzando il metodo exit(), il programma deve evitare la divisione per zero.
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,  b, result;
        a = input.nextInt();
        b = input.nextInt();
        

        if(b != 0){
            result = a/b;
            System.out.println(result);
        }else{
            System.out.println("no");
            System.exit(0);
        }
        input.close();
    }
}
