import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    do {
      System.out.println("Inserisci due nueri positvi maggiori o uguali a 0 da sommare");
      a = input.nextInt();
      b = input.nextInt();
      if (a < 0 || b < 0) {
        System.out.println("Numeri negativi non validi");
      }
    } while (a < 0 || b < 0);

    System.out.println("La somma di " + a + " e " + b + " è " + Metodi.somma(a, b));
  }
}
