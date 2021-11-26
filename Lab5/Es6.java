import java.util.Scanner;
public class Es6{
  public static boolean check(String s1){
    boolean risultato = true;
    for (int i = 0; i < s1.length(); i++) {
      if(s1.charAt(i) != 'A' && s1.charAt(i) != 'C' && s1.charAt(i) != 'G' && s1.charAt(i) != 'T'){
        risultato = false;
      }
    }
    return risultato;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String genoma = "", proteina = "", tempS, occorrenze = "";
    boolean check = true;

    while(check){
      System.out.println("Inseire due stringhe composte dalle lettere A, C, G, T che andranno a comporre genoma e proteina:");
      genoma = input.nextLine();
      proteina = input.nextLine();
      if(check(proteina) && check(genoma)){
        check =false;
      }else{
        System.out.println("Carattere non consentito");
      }
    }

    if(proteina.length() > genoma.length()){
      System.out.println("Nessuna occorrenza");
    }else{
      int pLt = proteina.length();
      for (int i = 0; i < (genoma.length() - (pLt -1)); i++){
        tempS = genoma.substring(i, i + pLt);
        if(tempS.equalsIgnoreCase(proteina)){
          occorrenze = occorrenze + " " + (i +1);
        }
      }
    }
    System.out.println("La sequenza " + proteina + " compare in " + genoma + " nelle seguenti posizioni: " + occorrenze);

  }
}
