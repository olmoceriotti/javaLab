import java.util.Scanner;
public class Metodi{
  public static int mostraMenu(){
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire codice per azione desiderata:");
    System.out.println("1) Aggiungi Elemento");
    System.out.println("2) Rimuovi ELemento");
    System.out.println("3) Stampa array");
    System.out.println("0) Termina programma");
    int sceltaUtente;
    do {
      sceltaUtente = input.nextInt();
      if (sceltaUtente < 0 || sceltaUtente > 3) {
        System.out.println("Inserire opzione valida");
      }
    } while (sceltaUtente < 0 || sceltaUtente > 3);
    return sceltaUtente;
  }

  public static int[] creaArray(){
    int [] array = new int[100];
    return array;
  }

  public static boolean aggiungiElemento(int [] array, int numeroElementi, int elemento){
    boolean presente = false;
    if (numeroElementi < 101) {
      for (int i = 0; i < numeroElementi; i++) {
        if (array[i] == elemento) {
          presente = true;
        }
      }
      if (!presente) {
        array[numeroElementi] = elemento;
      }
      return !presente;
    }else{
      return presente;
    }
  }

  public static boolean rimuoviElemento(int [] array, int numeroElementi, int elemento){
    boolean presente = false;
    int indice = 0;
    if (numeroElementi > 0) {
      for (int i = 0; i< numeroElementi; i++) {
        if (array[i] == elemento) {
          presente = true;
          indice = i;
        }
      }
      if (presente) {
        for (int i =  indice; i < numeroElementi - 1; i++) {
          array[i] = array[i +  1];
        }
      }
    }
    return presente;
  }

  public static void stampaArray(int [] array, int numeroElementi){
    for (int i = 0; i < numeroElementi; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
