import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    System.out.println("Inserire misura matrice");
    do {
      n = input.nextInt();
      if (n <=0 || n > 20) {
        System.out.println("Misura non valida");
      }
    } while (n <= 0 || n > 20);
    int[][] matrice = new int[n][n];
    Metodi.riempi(matrice);
    System.out.println("ciao");
    Metodi.stampa(matrice);
  }
}
