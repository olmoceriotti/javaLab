import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero, tentativoUtente, max, min, partite = -1;
    String sceltaGioco;
    boolean sceltaUtente = true;
    int [] numeriDaIndovinare = new int[5];
    int [] numeroTentativi = new int[5];
    boolean [] indovinatoReg = new boolean[5];
    while(sceltaUtente){
      int [] scelte = new int[10];
      partite++;
      int indovinato = -1;
      numero = Metodi.estraiNumeroCasuale();
      max = numero;
      min = numero;
      System.out.println(numero);
      System.out.println("Indovina numero:");
      int i = 0;
      for (; i < 10 && indovinato !=1; i++) {
        tentativoUtente = input.nextInt();
        scelte[i] = tentativoUtente;
        indovinato = Metodi.confrontaNumeri(tentativoUtente, numero);
        if (indovinato == -1){
          if(tentativoUtente > numero){
            if (max ==  numero) {
              max = tentativoUtente;
              System.out.println("il numero " + tentativoUtente + " è più grande di quello da indovinare");
            }else if(tentativoUtente > max){
              System.out.println("Hai inserito " + tentativoUtente + ", ma se gia’ ti avevo detto che il numero da indovinare e’ piu’ piccolo di " + max + "...");
            }else{
              System.out.println("il numero " + tentativoUtente + " è più grande di quello da indovinare");
              max = tentativoUtente;
            }
          }else{
            if (min ==  numero) {
              min = tentativoUtente;
              System.out.println("il numero " + tentativoUtente + " è più piccolo di quello da indovinare");
            }else if(tentativoUtente < min){
              System.out.println("Hai inserito " + tentativoUtente + ", ma se gia’ ti avevo detto che il numero da indovinare e’ piu’ grande di " + min + "...");
            }else{
              System.out.println("il numero " + tentativoUtente + " è più piccolo di quello da indovinare");
              min = tentativoUtente;
            }
          }
        }else{
          System.out.println("Indovinato!");
        }
      }
      if (indovinato == 1) {
        System.out.println("Hai vinto!");
      }else{
        System.out.println("Andrà meglio la prossima volta! \nIl numero da indovinare era " + numero);
      }
      Metodi.aggiornaInformazioniPartite(numeriDaIndovinare, numeroTentativi, indovinatoReg, i, indovinato, numero, partite);
      Metodi.StampaPartite(numeriDaIndovinare, numeroTentativi, indovinatoReg, partite);
      System.out.println("Giocare ancora? si/no");
      input.nextLine();
      sceltaGioco = input.nextLine();
      if (sceltaGioco.equalsIgnoreCase("no")) {
        sceltaUtente = false;
      }
    }
  }
}
