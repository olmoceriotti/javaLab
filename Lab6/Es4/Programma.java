import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int righe = 0, colonne = 0;
    do {
      System.out.println("Inserisci righe e colonne minori di 10");
      System.out.print("Righe:");
      righe = input.nextInt();
      System.out.print("Colonne:");
      colonne = input.nextInt();
      if (righe > 10  || colonne > 10 || righe < 1 || colonne < 1 ) {
        System.out.println("Inserire un numero valido");
      }
    } while (righe > 10  || colonne > 10 || righe < 1 || colonne < 1);

    int [] [] matrice = Metodi.generaMatriceCasuale(righe, colonne);
    int [] [] matrice2 = Metodi.trasponiMatrice(matrice);
    System.out.println("Matrice Trasposta:");
    Metodi.stampaMatrice(matrice2);
  }
}
