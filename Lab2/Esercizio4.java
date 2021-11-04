import java.util.Scanner;
/*Scrivere un programma Java che legga da tastiera una stringa di 4 caratteri. Se la stringa non è di 4 caratteri, stampa un messaggio d’errore e termina l’esecuzione. Se ogni carattere è una cifra tra 0 e 9, calcola il numero intero rappresentato da tale stringa, altrimenti stampa un messaggio di errore. Di seguito vengono presentati tre esempi di I/O risultanti dall'esecuzione del programma Java implementato:
Inserisci una stringa di 4 caratteri: 123
La stringa non e’ di 4 caratteri!
Inserisci una stringa di 4 caratteri: 8192
Il numero corrispondente e’: 8192
Inserisci una stringa di 4 caratteri: 81a2
La stringa contiene caratteri non validi!*/
public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringa = input.nextLine();
        int counter = 0;
        char zero = '0';
        char nove = '9';
        while(counter < stringa.length()){
            if(stringa.charAt(counter) <= zero || stringa.charAt(counter) >= nove){
                System.out.println("La stringa contiene caratteri non validi");
                System.exit(0);
            }
            counter++;
        }
        if(stringa.length() == 4){
            System.out.println("Il numero corrispondente è " + stringa);
        }else{
            System.out.println("la stringa non è di 4 caratteri");
            
        }
        input.close();
    }
}
