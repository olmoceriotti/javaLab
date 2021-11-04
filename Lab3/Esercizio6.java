import java.util.Scanner;
public class Esercizio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sceltaUtente;
        int  num1;
        int num2;
        int risultato = 0;
        do{
            System.out.println(" + per sommare \n - per sottrarre \n * per moltiplicare\n / per dividere \n u per uscire dal programma");
            sceltaUtente = input.nextLine();
            System.out.println("Inserire due numeri interi");
            num1 = input.nextInt();
            num2 = input.nextInt();
            switch(sceltaUtente){
                case "+":
                    risultato = num1 + num2;
                break;
                case "-":
                    risultato = num1 - num2;
                break;
                case "*":
                    risultato = num1 * num2;
                break;
                case "/":
                    if(num2 == 0){
                        System.out.println("Non si può dividere per zero");
                        sceltaUtente = "u";
                        break;
                    }
                    risultato = (int) num1/ num2;
                break;
                default:
                break;
            }
            if(sceltaUtente != "u")
                System.out.println(risultato);
        }while (sceltaUtente.equalsIgnoreCase("u"));

        input.close();
    }
}
