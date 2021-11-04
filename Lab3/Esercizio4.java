import java.util.Scanner;
public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String player1;
        String player2;
        String scelta;

        do{

            player1 = input.nextLine();
            player2 = input.nextLine();

            if(!player1.equalsIgnoreCase("forbice") && !player2.equalsIgnoreCase("forbice") && !player1.equalsIgnoreCase("sasso") && !player2.equalsIgnoreCase("sasso") && !player1.equalsIgnoreCase("carta") && !player2.equalsIgnoreCase("carta")){
                System.out.println("valore non consentito");
            }
    
            if(player1.equalsIgnoreCase(player2)){
                System.out.println("Pareggio!");
            }else if(player1.equalsIgnoreCase("sasso")){
                if(player2.equalsIgnoreCase("carta"))
                    System.out.println("Vince il giocatore 2");
                else 
                    System.out.println("Vince il giocatore 1");
            }else if(player1.equalsIgnoreCase("forbice")){
                if(player2.equalsIgnoreCase("sasso"))
                    System.out.println("Vince il giocatore 2");
                else 
                    System.out.println("Vince il giocatore 1");
            }else if(player1.equalsIgnoreCase("carta")){
                if(player2.equalsIgnoreCase("forbice"))
                    System.out.println("Vince il giocatore 2");
                else 
                    System.out.println("Vince il giocatore 1");
            }
    
            System.out.print("Ripetere partita? (si)");
            scelta = input.nextLine();
        }while(scelta.equalsIgnoreCase("si"));

        input.close();
    }
}
