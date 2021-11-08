import java.util.Scanner;
public class Esercizio5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    int i = 1;
    int max;
    do {
      System.out.println("Inserire numero maggiore di 1");
      max = input.nextInt();
    } while (max <= 1);
    
    while(i <= max){
      n = i;
      System.out.println("Provo la sequenza per n = " + i);
      while(n != 1){
        System.out.print(".");
        if(n%2==0){
          n = n/2;
        }else{
          n = (3*n) +1;
        }
      }
      System.out.println("\nTrovato!");
      i++;
    }


  }
}
