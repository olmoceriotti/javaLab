public class Programma{
  public static void main(String[] args) {
    String stringa = args[0];
    int countP = 0, countD = 0;
    int arLength = stringa.length()/2;
    char[] dispari = new char[arLength];
    if (stringa.length()%2 == 1) {
      arLength += 1;
    }
    char[] pari = new char[arLength];
    for (int i = 0; i < stringa.length(); i++) {
      if (i%2 == 0) {
        pari[countP] = stringa.charAt(i);
        countP++;
      }else{
        dispari[countD] = stringa.charAt(i);
        countD++;
      }
    }
    Metodi.modificaArray(pari, dispari);
    //NON FINITO
  }
}
