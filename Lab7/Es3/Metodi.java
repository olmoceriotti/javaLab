import  java.util.Scanner;
public class Metodi{
  public static int[] creaMatrice(int n, int m){
    int misura = n*m;
    int[] array = new int[misura];
    return array;
  }

  public static int stampaMenu(){
    Scanner input = new Scanner(System.in);
    int sceltaUtente;
    System.out.println("Inserire codice operazione desiderata:");
    System.out.println("1) Scrivi elemento");
    System.out.println("2) Leggi elemento");
    System.out.println("3) Stampa matrice");
    System.out.println("0) Termina programma");
    do {
      sceltaUtente = input.nextInt();
      if (sceltaUtente < 0 || sceltaUtente > 3) {
        System.out.println("Inserire un operazione valida");
      }
    } while (sceltaUtente < 0 || sceltaUtente > 3);
    return sceltaUtente;
  }

  public static void scriviElemento(int [] array, int n, int m, int i, int j, int elemento){
    int posizione = (i*m) + j; //moltiplico il valore i che indica la riga della finta matrice a cui accedere per m, numero di colonne per ogni "riga", in modo da ritovarmi all'indice iniziale della finta riga poi aggiungo la posizione a cui accedere
    array[posizione] = elemento;
  }

  public static int leggiElemento(int [] array, int n, int m, int i, int j){
    int posizione = (i*m) + j;
    return array[posizione];
  }

  public static void stampaMatrice(int [] array, int n, int m){
    for (int i =0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(leggiElemento(array, n, m, i, j) + " ");
      }
      System.out.println();
    }
  }
}
