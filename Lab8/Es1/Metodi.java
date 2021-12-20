public class Metodi{
  public static boolean checkEspr(String s1){
    boolean check = true;
    for (int i = 0; i < s1.length(); i++) {
      if (i%2 == 0) {
        if ((s1.charAt(i) < 'A' || s1.charAt(i) > 'E') && (s1.charAt(i) < '0' || s1.charAt(i) > '9')) {
          check = false;
        }
      }else{
        if (s1.charAt(i) != '+' && s1.charAt(i) != '-') {
          check = false;
        }
      }
    }
    if (s1.charAt(s1.length() - 1) <'A' || s1.charAt(s1.length() - 1) > 'E') {
      check = false;
    }
    return check;
  }
  public static boolean checkValori(String s1){
    boolean check = true;
    if (s1.length()%3 != 0) {
      check = false;
    }else{
      for (int i = 0; i < s1.length(); i++) {
        if (i % 3 == 0) {
          if (s1.charAt(i) < 'A' || s1.charAt(i) > 'E') {
            check = false;
            System.out.println(i);
          }
        }else if(i % 3 == 1){
          if (s1.charAt(i) != ':') {
            check = false;
            System.out.println(i);
          }
        }else{
          if (s1.charAt(i) < '0' || s1.charAt(i) > '9') {
            check = false;
            System.out.println(i);
          }
        }
      }
    }
    return check;
  }

  public static void estraiValori(String valori, int [] tabella){
    int indice, numero;
    char charCode;
    for (int i = 0; i < valori.length(); i += 3) {
      charCode = valori.charAt(i);
      indice = charCode - 65;
      numero = valori.charAt(i+2) - 48;
      tabella[indice] = numero;
    }
  }

  public static String sostituisci(String espressione, int [] tabella){
    int indice;
    String s  = "";
    for (int i = 0; i < espressione.length(); i++) {
      if (espressione.charAt(i) >= 'A' && espressione.charAt(i) <= 'E') {
        indice = espressione.charAt(i) - 65;
        s = s + tabella[indice];
      }else{
        s = s + espressione.charAt(i);
      }
    }

    return s;
  }

  public static int calcola(String daCalc){
    int risultato = 0, numero;
    boolean operando = false;
    for (int i = 0; i < daCalc.length(); i++) {
      if (daCalc.charAt(i) >= '0' && daCalc.charAt(i) <= '9') {
        numero = daCalc.charAt(i) - 48;
        if (operando) {
          risultato -= numero;
        }else{
          risultato += numero;
        }
      }else{
        if (daCalc.charAt(i) == '-') {
          operando = true;
        }else if(daCalc.charAt(i) == '+'){
          operando = false;
        }else{
          return -1;
        }
      }
    }
    return risultato;
  }
}
