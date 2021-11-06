import java.util.Scanner;
public class Esercizio1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserisci un numero");
    int n = input.nextInt();
    int pot = 1;
    while(pot < n){
      pot *= 2;
    }
    System.out.println(pot);
  }
}
