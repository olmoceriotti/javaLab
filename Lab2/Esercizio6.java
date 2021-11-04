import java.util.Scanner;
/*Scrivere un programma Java che legga da tastiera due stringhe di 5 caratteri ciascuna, formate dai caratteri + e -. Ad esempio:
Inserisci la prima stringa: +++--
Inserisci la seconda stringa: -+--+
Se le stringhe inserite non sono entrambe di 5 caratteri, o se i caratteri sono diversi da + e -, il programma stampa un messaggio d’errore e termina l’esecuzione.
Siano poi a e b due variabili intere, inizializzate rispettivamente con i valori 0 e 4.
La prima stringa indica le operazioni di incremento e di decremento da fare al valore della variabile a; analogamente, la seconda stringa indica le operazioni di incremento e decremento da applicare al valore della variabile b. Il programma deve applicare il primo incremento/decremento specificato per entrambe le variabili, poi il secondo incremento/decremento ad entrambe, e così via, stampando ogni volta a video i valori ottenuti per le due variabili. Se dopo un incremento/decremento di entrambe le variabili dovesse capitare che a e b assumono lo stesso valore, stampare un messaggio a video e terminare l’esecuzione del programma.*/
public class Esercizio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 4;

        String uno = input.nextLine();
        String due = input.nextLine();
        if(uno.length() == 5 && due.length() == 5){
            for(int i = 0; i < uno.length(); i++){
                if(uno.charAt(i) != '+' && uno.charAt(i) != '-' || due.charAt(i) != '+' && due.charAt(i) != '-'  ){
                    System.out.println("Caratere non autorizzato");
                    System.exit(0);
                }
            }
        }else{
            System.out.println("Errore, la stringa deve avere lunghezza 5");
            System.exit(0);
        }

        for(int i=0; i< 5; i++){
            if(uno.charAt(i) == '+'){
                a++;
            }else{
                a--;
            }
            if(due.charAt(i) == '+'){
                b++;
            }else{
                b--;
            }
            System.out.println("Il valore di a e’ " + a + ", il valore di b e’ " + b);
        }

        if(a == b)
            System.out.println("Le variabili a e b hanno assunto lo stesso valore");

        input.close();
    }
}
