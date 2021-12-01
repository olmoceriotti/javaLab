public class Metodi{
  public static String estraiStringaCasuale(){
    String parole = "hotel poem advice death poet king writer volume cabinet media dirt client hair length surgery lady oven bread injury speaker police writing idea thing health cheek cousin power paper wife honey actor farmer youth virus bedroom drawing college chest ratio cell sister worker meat series exam pie climate recipe world";
    String [] dizionario = parole.split(" ");
    int indiceParola = (int) (Math.random()*(dizionario.length - 1));
    String parola = dizionario[indiceParola];
    return parola;
  }

  public static void stampaLettereIndovinate(char [] caratteri, boolean [] map){
    for (int i = 0; i < caratteri.length; i++) {
      if (map[i]) {
        System.out.print(caratteri[i]);
      }else{
        System.out.print('-');
      }
    }
    System.out.println();
  }

  public static void scopriLettera(char[] caratteri, boolean [] map, char letteraUtente){
    boolean carattereTrovato = false, completo = true, giaTrovato = false;
    for (int i = 0; i < caratteri.length; i++) {
      if (caratteri[i] == letteraUtente) {
        if (map[i]) {
          giaTrovato = true;
        }else{
          map[i] = true;
          carattereTrovato = true;
        }
      }
    }
    if (giaTrovato) {
      System.out.println("Lettera già inserita");
    }else if(carattereTrovato){
      System.out.println("Il carattere è nella stringa");
    }else{
      System.out.println("Lettera non presente");
    }
    for (int i = 0; i < caratteri.length; i++) {
      if (map[i] == false) {
        completo = false;
      }
    }
    if (completo == true) {
      map[caratteri.length] = true;
    }
  }
}
