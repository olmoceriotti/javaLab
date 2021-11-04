package SecondoSet;
import java.util.Scanner;
public class Esercizio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire dimensioni zaino");
        int dimZaino = input.nextInt();
        int pesoTotaleOggeti = 0;
        int ultimoOggetto = -1;
        int oggettoMax = 0;
        int oggettoMin = 1000;
        int counter = 0;
        double media;

        while(pesoTotaleOggeti <= dimZaino && ultimoOggetto !=0){
            System.out.println("Inserisci peso oggetti");
            ultimoOggetto = input.nextInt();
            
            if(pesoTotaleOggeti + ultimoOggetto >dimZaino)
                ultimoOggetto = 0;
            else{
                pesoTotaleOggeti = pesoTotaleOggeti + ultimoOggetto;
                counter++;

                if(ultimoOggetto > oggettoMax)
                oggettoMax = ultimoOggetto;
            
                if(ultimoOggetto < oggettoMin)
                oggettoMin = ultimoOggetto;
            }               
        }

        media = (double) pesoTotaleOggeti/counter;
        System.out.println("Capacità zaino: " + dimZaino + "\nNumero oggeti: " + counter + "\nPeso totale oggetti: " + pesoTotaleOggeti + "\nOggetto più pesante: " + oggettoMax + "\nOggetto più leggero: " + oggettoMin + "\n Media peso oggetti: " + media + "\n");
        input.close();
    }
}
