import java.util.Scanner;
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringa1 = input.nextLine();
        String primaParola;
        String ultimaParola;

        if(stringa1.length() == 0){
            System.out.println("la frase non contiene parole");
        }else if(stringa1.indexOf(" ") == -1 && stringa1.length()>0){
            System.out.println("La frase contiene una sola parola");
            System.out.println(stringa1 + ", lunga: " + stringa1.length());
        }else if(stringa1.indexOf(" ") != -1 && stringa1.length()>0){
            System.out.println("La frase contiene più di una sola parola");
            primaParola = stringa1.substring(0, stringa1.indexOf(" "));
            ultimaParola = stringa1.substring(stringa1.lastIndexOf(" "), stringa1.length());
            System.out.println(primaParola + " " + primaParola.length() + ", lunga:" + ultimaParola + ", lunga: " + ultimaParola.length());
        }

        input.close();
    }
}
