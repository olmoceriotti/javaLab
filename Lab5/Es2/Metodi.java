public class Metodi{
  public static void main(String[] args) {

  }
  public static int sommaDueInteri(int a, int b){
    int risultato = a +b;
    return risultato;
  }
  public static int divisioneIntera(int a, int b){
    int risultato = a/b;
    return risultato;
  }
  public static int restoDivisioneIntera(int a, int b){
    int risultato = a%b;
    return risultato;
  }
  public static double mediaTraDueDouble(double a, double b){
    double risultato = (a+b)/2;
    return risultato;
  }
  public static int valoreAssolutoIntero(int a){
    int risultato;
    if(a < 0){
      a = -a;
    }
    risultato = a;
    return risultato;
  }
  public static int lunghezzaStringaIntero(int a){
    String risultatoS = "" + a;
    int  risultato = risultatoS.length();
    return risultato;
  }
}
