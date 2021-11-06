import java.util.Scanner;
public class Esercizio6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire due stringhe formate dalle lettere maiuscole A C G T");
    String genoma = input.nextLine();
    String proteina = input.nextLine();
    String posizioni = "";
    int counter = 0;
    int exCounter;
    int genCounter;
    int j;
    boolean trovato = true;

    if(genoma.length() < proteina.length()){
      System.out.println("Errore: genoma più corto della proteina");
      System.exit(0);
    }

    for(int i = 0; i < genoma.length(); i++){
      if(genoma.charAt(i) != 'A' && genoma.charAt(i) != 'C' && genoma.charAt(i) != 'G' && genoma.charAt(i) != 'T' ){
        System.out.println("Carattere non autorizzato: " + genoma.charAt(i));
        System.exit(0);
      }
    }

    for(int i = 0; i < proteina.length(); i++){
      if(proteina.charAt(i) != 'A' && proteina.charAt(i) != 'C' && proteina.charAt(i) != 'G' && proteina.charAt(i) != 'T'){
        System.out.println("Carattere non autorizzato: " + proteina.charAt(i));
        System.exit(0);
      }
    }

    System.out.println("Lunghezza genoma: " + genoma.length());
    System.out.println("posizione finale: " + (genoma.length() - (proteina.length())));

    while(counter < genoma.length()){
      System.out.println(counter);
      if(genoma.charAt(counter) == proteina.charAt(0)){
        trovato = true;
        System.out.println("TROVATO");
        exCounter = counter;
        j = 0;
        genCounter = 0;
        while(j < proteina.length() && exCounter < genoma.length() && trovato){
          System.out.println("...");
          if(genoma.charAt(exCounter) != proteina.charAt(j)){
            trovato = false;
            System.out.println("FAKE");
          }else{
            genCounter++;
            exCounter++;
            j++;
          }

        }
        if(trovato|| genCounter == proteina.length()){
          posizioni = posizioni + " " + counter;
          System.out.println("AGGIUNTO");
        }
      }
      counter++;
    }

    System.out.println("La sequenza " + proteina + " compare in " + genoma + " nelle seguenti posizioni:" + posizioni);
  }
}
