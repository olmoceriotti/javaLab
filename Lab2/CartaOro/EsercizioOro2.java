package CartaOro;

import java.util.Scanner;
public class EsercizioOro2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String stringa1 = input.nextLine();
        String stringa2 = input.nextLine();
        char char1;
        int charCode;

        for(int i = 0; i < stringa1.length(); i++){
            if(stringa1.charAt(i) < 'a' || stringa1.charAt(i) > 'z' ){
                System.out.println("La prima stringa contiene un carattere non autorizzato");
                System.exit(0);
            }
        }
        for(int i = 0; i < stringa2.length(); i++){
            if(stringa2.charAt(i) < 'A' || stringa2.charAt(i) > 'Z' ){
                System.out.println("La seconda stringa contiene un carattere non autorizzato");
                System.exit(0);
            }
        }
        for(int i = 0; i < stringa1.length(); i++){
            for(int f = 0; f < stringa2.length(); f++){
                charCode = stringa1.charAt(i) - 32;
                char1 = (char) charCode;
                System.out.println(char1 + "" + stringa2.charAt(f));
            }
        }
        input.close();
    }
}
