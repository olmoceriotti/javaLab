package SecondoSet;
import java.util.Scanner;
public class Esercizio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String insieme1;
        String insieme2;
        String intersezione = "";
        String unione = "";
        do{
            System.out.println("Inserire due frequenze di 1 e 0 di uguale lunghezza");
            insieme1 = input.nextLine();
            insieme2 = input.nextLine();
        }while(insieme1.length() != insieme2.length());

        for(int i = 0; i < insieme1.length(); i++){
            if(insieme1.charAt(i) != '0' && insieme2.charAt(i) != '0' && insieme1.charAt(i) != '1' && insieme2.charAt(i) != '1' ){
                System.out.println("Elemento non consentito");
                System.exit(0);
            }
        }

        for(int i = 0; i < insieme1.length(); i++){
            if(insieme1.charAt(i) == '1' || insieme2.charAt(i) == '1'){
                unione = unione + '1';
            }else{
                unione = unione + '0';
            }

            if(insieme1.charAt(i) == '1' && insieme2.charAt(i) == '1'){
                intersezione = intersezione + '1';
            }else{
                intersezione = intersezione + '0';
            }
        }

        System.out.println("Insieme 1: " + insieme1 + "\nInsieme 2: " + insieme2 + "\nIntersezione: " + intersezione + "\nUnione: " + unione);
        input.close();
    }
        

}

