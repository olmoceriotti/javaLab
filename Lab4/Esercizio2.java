import java.util.Scanner;
public class Esercizio2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserire due parole con un prefisso comune");
    String s1 = input.nextLine();
    String s2 = input.nextLine();
    int ln = 0;
    int i = 0;
    boolean uguale = true;
    int sMax;

    if(s1.length() > s2.length()){
      sMax = s2.length();
    }else{
      sMax = s1.length();
    }

    while(uguale && i < sMax){
      if(s1.charAt(i) == s2.charAt(i)){
        ln++;
      }else{
        uguale = false;
      }
      i++;
    }

    System.out.println("Il massimo prefisso comune tra le stringhe \"" + s1 +"\" e \"" + s2 + "\" ha lunghezza " + ln);



  }
}
