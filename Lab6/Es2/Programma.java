import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String parola = Metodi.estraiStringaCasuale();
    char [] parolaC = new char[parola.length()];
    boolean [] map = new boolean[(parola.length() + 1)];
    int tentativi = 0;
    map[parola.length()] = false;
    char letteraUtente;
    System.out.println(parola);
    for (int i = 0; i < parola.length(); i++) {
      parolaC[i] = parola.charAt(i);
    }
    while (map[parola.length()] == false && tentativi < 20) {
      Metodi.stampaLettereIndovinate(parolaC, map);
      System.out.println("Inserire una lettere da verificare:");
      letteraUtente = input.nextLine().charAt(0);
      Metodi.scopriLettera(parolaC, map, letteraUtente);
      tentativi++;
    }
    if (map[parola.length()] == true) {
      System.out.println("Indovinato, la parola era " + parola + "!");
    }else{
      System.out.println("Tentativi esauriti, la parola era " + parola);
    }
  }
}
