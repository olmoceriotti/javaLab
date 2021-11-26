import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ultimoTent = '#';
    int presCount, counterT = 0;
    String temp;
    char [] stringa = Metodi.estraiStringaCasuale();
    int [] pres = new int[stringa.length];
    char [] tentativi = new char[20];
    boolean indovinato  = false;

    while (!indovinato && counterT < 20) {
      int i = 0, count = 0, count2 = 0;

      for(; i < stringa.length; i++){
        if (pres[i] == 1) {
          System.out.print(stringa[i]);
          if (stringa[i] == ultimoTent) {
            count2++;
          }
        }else{
          System.out.print('-');
          count++;
        }
      }
      System.out.println("\n**************");
      if (count2 == 0 && ultimoTent != '#') {
        System.out.println("Lettera non presente");
      }
      if (counterT != 0) {
        tentativi[counterT] = ultimoTent;
        Metodi.tentativi(tentativi, counterT);
      }
      if (count == 0) {
        System.out.println("Indovinato!");
        indovinato = true;
      }
      if (!indovinato) {
        System.out.println("Inserire una lettera:");
        temp = input.nextLine();
        ultimoTent = temp.charAt(0);
        for (int j = 0; j < pres.length; j++ ) {
          if (stringa[j] == ultimoTent) {
            pres[j] = 1;
          }
        }
        counterT++;
      }
    }
  }
}
