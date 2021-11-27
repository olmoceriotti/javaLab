import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input=  new Scanner(System.in);
    boolean uscita = false;
    int sceltaUtente;
    String parolaChiave = "", messaggio = "", messaggioCifrato = "";
    Metodi.creaMatrice();
    while (!uscita) {
      sceltaUtente = Metodi.sceltaMenu();
      switch (sceltaUtente) {
        case 1:
          parolaChiave = Metodi.cambiaParolaChiave();
        break;
        case 2:
          if (!parolaChiave.equals("")) {
            System.out.println("Inserire una parola da cifrare:");
            messaggio = input.nextLine();
            messaggioCifrato = Metodi.cifraMessaggio(messaggio, parolaChiave);
            System.out.println("Il messaggio cifrato è " + messaggioCifrato);
          }else{
            System.out.println("Inserire una parola chiave prima");
          }
        break;
        case 3:
          if (!parolaChiave.equals("")) {
            System.out.println("Inserire parola da decifrare:");
            messaggioCifrato = input.nextLine();
            messaggio = Metodi.decifraMessaggio(messaggioCifrato, parolaChiave);
            System.out.println("Il messaggio decifrato è " + messaggio);
          }else{
            System.out.println("inserire una parola chiave prima");
          }
        break;
        case 0:
          System.out.println("Uscita in corso...");
          uscita = true;
        break;
      }
    }
    System.out.println("Programma terminato");

  }
}
