public class Metodi{
  public static int somma( int a, int b){
    if (b == 0) {
      return a;
    }else{
      return somma(a + 1, b - 1);
    }
  }
}
