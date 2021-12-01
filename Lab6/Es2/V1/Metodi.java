public class Metodi{
  public static char[] estraiStringaCasuale(){
    String parole = "hotel poem advice death poet king writer volume cabinet media dirt client hair length surgery lady oven bread injury speaker police writing idea thing health cheek cousin power paper wife honey actor farmer youth virus bedroom drawing college chest ratio cell sister worker meat series exam pie climate recipe world";
    String [] dizionario = parole.split(" ");
    int n = (int) (Math.random()* dizionario.length);
    String parola = dizionario[n];
    System.out.println(parola);
    char [] stringa = new char[parola.length()];
    for (int i = 0; i < parola.length(); i++) {
      stringa[i] = parola.charAt(i);
    }
    return stringa;
  }
  public static void tentativi(char [] tentativi, int numero){
    System.out.print("Tentativi effettuati:");
    for (int i = 0; i < (numero+1); i++) {
      System.out.print(tentativi[i] + " ");
    }
    System.out.println();
  }
}
