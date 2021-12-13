import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] array = Metodi.creaArray();
    int numeroElementi = 0;
    int elemento;
    boolean termina = false;
    while(!termina){
      switch(Metodi.mostraMenu()){
        case 1:
          System.out.println("Inserisci elemento da aggiungere");
          elemento = input.nextInt();
          if (Metodi.aggiungiElemento(array, numeroElementi, elemento)) {
            System.out.println("Elemento aggiunto alla posizione " + numeroElementi +"!");
            numeroElementi += 1;
          }else{
            if (numeroElementi < 101) {
              System.out.println("Numero già presente");
            }else{
              System.out.println("Array pieno");
            }
          };
        break;
        case 2:
        System.out.println("Inserisci elemento da rimuovere");
        elemento = input.nextInt();
        if (Metodi.rimuoviElemento(array, numeroElementi, elemento)) {
          System.out.println("Elemento rimosso");
          numeroElementi -= 1;
        }else{
          if (numeroElementi > 0) {
            System.out.println("Numero non presente");
          }else{
            System.out.println("Array vuoto");
          }
        };
        break;
        case 3:
          Metodi.stampaArray(array, numeroElementi);
        break;
        case 0:
          System.out.println("Uscita in corso");
          termina = true;
        break;
      }
    }
    System.out.println("Programma terminato");
  }
}
