import java.util.Scanner;
public class Esercizio4{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci due numeri interi positivi");
    int n = input.nextInt();
    int m = input.nextInt();
    int i = 0;
    int f =n;
    while(i < m){
      n++;
      i++;
    }
    System.out.println("La somma di " + f + " e " + m  + " è " + n);
  }
}
