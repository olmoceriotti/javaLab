import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int riga = Metodi.stringtoInt(args[0]), colonna = Metodi.stringtoInt(args[1]), nOstacoli = 10;
    int [][] mondo = Metodi.creaMondo();
    String percorso = args[2];
    if (Metodi.aggiungiObiettivo(mondo, riga, colonna)) {
      System.out.println("Obiettivo aggiunto!");
    }else{
      System.out.println("Non è stato possibile posizionare l'obiettivo in questa posizione");
    }
    for (int i = 0; i < nOstacoli; i++) {
      Metodi.aggiungiOstacolo(mondo);
    }
    switch (Metodi.aggiungiPosizioniMondo(mondo, percorso)) {
      case 1:
        System.out.println("Il robot ha raggiunto l'obiettivo!");
      break;
      case 2:
        System.out.println("Il robot è finito contro un ostacolo!");
      break;
      case 3:
        System.out.println("Il robot ha tentato di scappare...");
      break;
      case 0:
        System.out.println("Il robot non ha raggiunto l'obiettivo");
      break;
    }
    System.out.println("Ecco cos'è successo:");
    Metodi.stampaMondo(mondo);
  }
}
