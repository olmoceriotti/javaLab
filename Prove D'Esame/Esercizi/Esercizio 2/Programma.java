import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int lunghezzaArray = Metodi.stringToInt(args[0]), n;
    if ( lunghezzaArray <= 0) {
      System.out.println("Lunghezza array non valida");
      System.exit(-1);
    }
    int[] array1 = Metodi.creaArray(lunghezzaArray);
    int[] array2 = Metodi.creaArray(lunghezzaArray);
    Metodi.stampaArray(array1);
    Metodi.stampaArray(array2);
    System.out.println("Inserire target:");
    do {
      n = input.nextInt();
      if (n <= 0) {
        System.out.println("Inserire un numero valido");
      }
    } while (n <= 0);
    Metodi.cercaTarget(array1, array2, n);
    Metodi.riordinaArray(array1);
    Metodi.riordinaArray(array2);
    int[][] matrice = Metodi.creaMatrice(array1, array2);
    Metodi.stampMatrice(matrice);
    int[][] matriceIr = Metodi.creaMatriceIr();
    Metodi.stampMatrice(matriceIr);
  }
}
