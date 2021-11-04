package CartaOro;

import java.util.Scanner;
public class EsercizioOro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringa1 = input.nextLine();
        int m = input.nextInt();
        int n = input.nextInt();

        int k = stringa1.length();
        int lunStringa = k - 1;
        int charCode;
        int index;
        char temp;
        int counterLim;     
        String result = "";

        if(m < 0 || m > lunStringa || n < 0 || n > lunStringa){ 
            System.out.println("Valore non consentito");
            System.exit(0);
        }

        for(int i = 0; i < stringa1.length(); i++){
            if(stringa1.charAt(i) < 'a' || stringa1.charAt(i) > 'z' ){
                System.out.println("Lettera non consentita");
                System.exit(0);
            }  
        }

        //Algoritmo per generare una parola nuova
        /* SBAGLIATO
        for(int f = 0; f < k; f++ ){
            if(f == 0)
                index = m;
            else
                index = (m + f * n) % k;

            result = result + stringa1.charAt(index);
        }*/

        //Algoritmo per far idventare maiuscole le lettere selezionate dall'algoritmo
        
        
        result= stringa1;
        if(n%2 == 0){
            counterLim = k/2;
        }else{
            counterLim = k;
        }
        
        for(int f = 0; f < counterLim; f++ ){
            if(f == 0)
                index = m;
            else
                index = (m + f * n) % k;
            charCode = stringa1.charAt(index) - 32;
            temp = (char) charCode;

            result = result.substring(0, index) + temp + result.substring(index+1);
            System.out.println("    " + result);
        }
        
        
        System.out.println(result);

        input.close(); 
    }
}

