import java.util.Scanner;
public class Es1{
  public static String aggiornaStringa(int n, String s1){
    s1 = s1 + n;
    return s1;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = "";
    int n = 1, posCount = 0;

    while(n != 0){
      do{
        System.out.println("Inserire un numero positivo");
        n = input.nextInt();
        if(n < 0){
          System.out.println("Numero negativo non consentito");
        }else{
          posCount++;
          if(posCount%2==0){
            s1  = aggiornaStringa(n, s1);
          }
        }
      }while(n < 0);
    }

    System.out.println("Stringa composta solo da numeri in posizioni pari della sequenza: " + s1);


  }
}
