import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    do {
      System.out.println("Inserire due numeri positivi per calcolo massimo comune divisore");
      a = input.nextInt();
      b =  input.nextInt();
      if (a <= 0 || b <= 0) {
        System.out.println("Numeri non validi");
      }
    } while (a <= 0 || b <= 0);

    System.out.println("Il massimo comun divisore di " + a + " e " + b + " è " + Metodi.mcd(a, b));
  }
}
