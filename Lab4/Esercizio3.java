import java.util.Scanner;
public class Esercizio3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int i = 2;
    int iEx = 0, counter = 0;
    int variabCounter = 1;
    String risultato;
    System.out.print("Numero letto: " + n + "\nFattori: ");
    while(n > 1){
      while(n % i!=0){
        i++;
      }
      n =  n / i;
      if(iEx == i){
        variabCounter = variabCounter + 1;
      }else if(iEx != 0){
        System.out.print(iEx + " (" + variabCounter + " volte), ");
        variabCounter = 1;
      }
      if(n <= 1){
        System.out.print(i + " (" + variabCounter + " volte) ");
        variabCounter = 1;
      }
      iEx = i;
      i=2;
      counter++;
    }
    System.out.println();
  }
}
