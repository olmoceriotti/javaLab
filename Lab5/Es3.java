import java.util.Scanner;
public class Es3{
  public static boolean cercaCarattere(String  s1, char c){
    boolean risultato;
    if(s1.indexOf(c) >= 0){
      risultato = true;
    }else{
      risultato = false;
    }
    return risultato;
  }

  public static String rimuoviCarattere(String s1, char c){
    String c2 = "" + c, s2 = s1.replace(c2, "");
    return s2;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire una stringa e un carattere:");
    String s1 = input.nextLine(), s2 = "";
    char c = input.nextLine().charAt(0);
    if(cercaCarattere(s1, c)){
      s2 = rimuoviCarattere(s1,c);
      System.out.println("La nuova stringa è: " + s2);
    }else{
      System.out.println("Il carattere " + c + " non è contenuto nella stringa " + s1);
    }

  }
}
