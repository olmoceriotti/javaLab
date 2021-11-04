import java.util.Scanner;
/*Scrivere un programma Java che legga da tastiera un numero intero n compreso tra 0 e 127, e stampi a video la sua rappresentazione in binario, usando sempre 7 bit. Se il numero inserito non è compreso tra 0 e 127, il programma deve stampare un messaggio d’errore e terminare subito l’esecuzione.*/
public class Esercizio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String bin = "0000000";
        if(n < 0 || n > 127){
            System.out.println("il numero deve essere compreso tra 0 e 127");
            System.exit(0);
        }
        for(int i = 0; i <7; i++){
            if(n%2 == 1){
                bin = bin.substring(0, 6-i) + "1" + bin.substring(7-i);
                n = n/2;
            }
            else{
                bin = bin.substring(0, 6-i) + "0" + bin.substring(7-i);
                n = n/2;
            }     
        }
        System.out.println(bin);
        input.close();
    }
}
