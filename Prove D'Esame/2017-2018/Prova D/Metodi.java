public class Metodi{
  public static void modificaArray(char[] pari, char[] dispari){
    char a;
    if (pari.length > dispari.length) {
      for (int i = 0; i < dispari.length;  i++) {
        a = dispari[i];
        if (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u') {
          dispari[i] -= 32;
        }
      }
    }else{
      for (int i = 0; i < pari.length;  i++) {
        a = pari[i];
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
          pari[i] -= 32;
        }
      }
    }
  }
}
