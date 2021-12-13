import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char sceltaUtente;
    boolean primaMossa;
    int [][] gioco = Metodi.creaNuovaConfigurazione();
    do {
      System.out.println("Vuoi effetturare la prima mossa? s/n");
      sceltaUtente = input.nextLine().charAt(0);
      if (sceltaUtente != 's' && sceltaUtente != 'n') {
        System.out.println("Inserire una risposta valida (s/n)");
      }
    }while (sceltaUtente != 's' && sceltaUtente != 'n');
    if (sceltaUtente == 's') {
      primaMossa = true;
    }else{
      primaMossa = false;
    }

    while(Metodi.verificaVittoria(gioco) == 0){
      if (primaMossa) {
        Metodi.mossaUtente(gioco);
        Metodi.stampaConfigurazioneDiGioco(gioco);
        if (Metodi.verificaVittoria(gioco) == 0) {
          Metodi.mossaComputer(gioco);
          Metodi.stampaConfigurazioneDiGioco(gioco);
        }
      }else{
        Metodi.mossaComputer(gioco);
        Metodi.stampaConfigurazioneDiGioco(gioco);
        if (Metodi.verificaVittoria(gioco) == 0) {
          Metodi.mossaUtente(gioco);
          Metodi.stampaConfigurazioneDiGioco(gioco);
        }
      }
    }

  }
}
