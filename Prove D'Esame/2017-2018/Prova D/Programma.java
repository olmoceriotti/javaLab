public class Programma{
  public static void main(String[] args) {
    String stringa = args[0];
    int countP = 0, countD = 0;
    char[] pari = new char[stringa.length()/2];
    char[] dispari = new char[stringa.length()/2];
    for (int i = 0; i < stringa.length(); i++) {
      if (i%2 == 0) {
        pari[countP] = stringa.charAt(i);
        countP++;
      }else{
        dispari[countD] = stringa.charAt(i);
        countD++;
      }
    }
  }
}
