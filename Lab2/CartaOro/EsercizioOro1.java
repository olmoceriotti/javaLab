package CartaOro.Lab2;

import java.util.Scanner;
public class EsercizioOro1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      String stringa1 = input.nextLine();
      int result = 0;
      String stringaResult = "";
      int counter = 0;

      for(int i = 0; i < stringa1.length(); i++){
         if((i == 0 || i == (stringa1.length() - 1)) && (stringa1.charAt(i) == '+' || stringa1.charAt(i) == '-') ){
            System.out.println("la stringa deve iniziare e terminare con un numero");
            System.exit(0);
         }
         if((stringa1.charAt(i) < '0' || stringa1.charAt(i) > '9' )&&( stringa1.charAt(i) != '+' && stringa1.charAt(i) != '-')){
            System.out.println("la stringa contiene un carattere non autorizzato");
            System.exit(0);
         }
      } 

      while(counter < stringa1.length()){
         while(counter < stringa1.length() && stringa1.charAt(counter) != '+' && stringa1.charAt(counter) != '-'){
            stringaResult = stringaResult + stringa1.charAt(counter);
            counter++;
         }
         result = result + Integer.parseInt(stringaResult);
         stringaResult = "";
         if(counter < stringa1.length()){
            if(stringa1.charAt(counter) == '-'){
               stringaResult = "-";
            }
            counter++;
         }     
      }

      System.out.println(result);

      
      input.close();
   } 
}
