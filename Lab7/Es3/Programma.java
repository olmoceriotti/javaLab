import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, m, i, j, elemento;
    boolean uscita = false;
    do {
      System.out.println("Inserisci numero righe e colonne");
      n = input.nextInt();
      m = input.nextInt();
      if (n < 1 || m < 1) {
        System.out.println("Numero non valido");
      }
    } while (n < 1 || m < 1);

    int [] array = Metodi.creaMatrice(n, m);

    while (!uscita) {
      switch (Metodi.stampaMenu()) {
        case 1:
          System.out.println("Inserisci indici i e j");
          i = input.nextInt();
          j = input.nextInt();
          if (i > n || i < 0 || j > m || j < 0 || array.length != (m*n)) {
            System.out.println("Indici non validi, uscita in corso...");
            uscita = true;
          }else{
            System.out.println("Inserisci elemento da scrivere alla posizione [" + i + "][" + j + "]");
            elemento = input.nextInt();
            Metodi.scriviElemento(array, n, m, i, j, elemento);
          }
        break;
        case 2:
          System.out.println("Inserisci indici i e j");
          i = input.nextInt();
          j = input.nextInt();
          if (i > n || i < 0 || j > m || j < 0 || array.length != (m*n)) {
            System.out.println("Indici non validi, uscita in corso...");
            uscita = true;
          }else{
            System.out.println("L'elemento alla posizione [" + i + "][" + j + "] è" + Metodi.leggiElemento(array, n, m, i, j));
          }
        break;
        case 3:
          System.out.println("stampa in corso...");
          Metodi.stampaMatrice(array, n, m);
        break;
        case 0:
          System.out.println("Uscita in corso...");
          uscita = true;
        break;
      }
    }
    System.out.println("Programma terminato");
  }
}
