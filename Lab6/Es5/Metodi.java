import java.util.Scanner;
public class Metodi{
  public static int sceltaMenu(){
    Scanner input = new Scanner(System.in);
    System.out.println("---------------------------------------------------");
    System.out.println("Menu - Inserire il numero dell'opzione desiderata");
    System.out.println("1 – Inserisci/cambia la parola chiave");
    System.out.println("2 – Cifra un messaggio");
    System.out.println("3 – Decifra un messaggio");
    System.out.println("0 – Esci dal programma");
    int SceltaUtente;
    do {
      SceltaUtente = input.nextInt();
      if (SceltaUtente > 3 || SceltaUtente < 0) {
        System.out.println("Inserire un opzione valida!");
      }
    } while (SceltaUtente > 3 || SceltaUtente < 0);
    return SceltaUtente;
  }

  public static String cambiaParolaChiave(){
    String key;
    Scanner input = new Scanner(System.in);
    boolean chiaveIdonea;
    do {
      System.out.println("Inserisci parola chiave minuscola:");
      chiaveIdonea = true;
      key = input.nextLine();
      for (int i = 0; i < key.length(); i++) {
        if (key.charAt(i) < 'a' || key.charAt(i) > 'z') {
          System.out.println("Chiave non idonea");
          chiaveIdonea =  false;
        }
      }
    } while (!chiaveIdonea);
    return key;
  }

  public static char[][] creaMatrice(){
    char [][] matrice = new char[26][26];
    char c;
    int charCode, a, b;
    for (int i = 0; i < matrice.length; i++) {
      for (int j = 0; j < matrice[0].length; j++) {
        if (97 + i + j <= 122) {
          charCode = 97 + i + j;
        }else{
          charCode = 71 + i + j; //alfabeto riparte da capo
        }
        c = (char) charCode;
        matrice[i][j] = c; //assegnamento valori a matrice
      }
    }
    return matrice;
  }

  public static String cifraMessaggio(String messaggio, String key){
    String messaggioCifrato = "";
    char currentChar, keyChar;
    int indice = 0;
    for (int i = 0; i < messaggio.length(); i++) {
      keyChar = key.charAt(indice);
      indice++;
      if (indice == key.length()) {
        indice = 0;
      }
      currentChar = messaggio.charAt(i);
      messaggioCifrato = messaggioCifrato + cifraLettera(currentChar, keyChar);
    }
    return messaggioCifrato;
  }

  public static char cifraLettera(char currentChar, char keyLetter){
    char [][] matrice = creaMatrice();
    boolean let1 = false, let2 = false;
    int i = 0, j = 0;
    char carattereCifrato;
    while(!let1){
      if (matrice[i][0] == currentChar) {
        let1 = true;
      }else{
        i++;
      }
    }
    while(!let2){
      if (matrice[0][j] == keyLetter) {
        let2 = true;
      }else{
        j++;
      }
    }
    carattereCifrato = matrice[i][j];
    return carattereCifrato;
  }

  public static String decifraMessaggio(String messaggioCifrato, String key){
    String messaggio = "";
    char currentChar, keyChar;
    int indice = 0;
    for (int i = 0; i < messaggioCifrato.length(); i++) {
      keyChar = key.charAt(indice);
      indice++;
      if (indice == key.length()) {
        indice = 0;
      }
      currentChar = messaggioCifrato.charAt(i);
      messaggio = messaggio + decifraLettera(currentChar, keyChar);
    }
    return messaggio;
  }

  public static char decifraLettera(char currentChar, char keyLetter){
    char [][] matrice = creaMatrice();
    boolean let1 = false, let2 = false;
    int i = 0, j = 0;
    char carattereCifrato;
    while(!let1){
      if (matrice[0][j] == keyLetter) {
        let1 = true;
      }else{
        j++;
      }
    }
    while(!let2){
      if (matrice[i][j] == currentChar) {
        let2 = true;
      }else{
        i++;
      }
    }
    carattereCifrato = matrice[i][0];
    return carattereCifrato;
  }
}
