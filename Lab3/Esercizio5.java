import java.util.Scanner;
public class Esercizio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nSel;
        String player1 = "";
        String player2;
        String scelta;

        do{
            nSel = (int)(Math.random()*3);
            System.out.println(nSel);
            switch(nSel){
                case 0:
                    player1 = "forbice";
                break; 
                case 1:
                    player1 = "carta";
                break;
                case 2:
                    player1 = "sasso";
                break;
            }


            System.out.println("Inserire sasso, carta o forbice");
            player2 = input.nextLine();

            if(!player2.equalsIgnoreCase("forbice") && !player2.equalsIgnoreCase("sasso") && !player2.equalsIgnoreCase("carta")){
                System.out.println("valore non consentito");
                System.exit(0);
            }
    
            if(player1.equalsIgnoreCase(player2)){
                System.out.println("Pareggio!");
            }else if(player1.equalsIgnoreCase("sasso")){
                if(player2.equalsIgnoreCase("carta"))
                    System.out.println("Vince il giocatore");
                else 
                    System.out.println("Vince il computer");
            }else if(player1.equalsIgnoreCase("forbice")){
                if(player2.equalsIgnoreCase("sasso"))
                    System.out.println("Vince il giocatore");
                else 
                    System.out.println("Vince il computer");
            }else if(player1.equalsIgnoreCase("carta")){
                if(player2.equalsIgnoreCase("forbice"))
                    System.out.println("Vince il giocatore");
                else 
                    System.out.println("Vince il computer");
            }
    
            System.out.print("Ripetere partita? (si)");
            scelta = input.nextLine();
        }while(scelta.equalsIgnoreCase("si"));

        input.close();
    }
}
