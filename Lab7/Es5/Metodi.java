public class Metodi{
  public static int mcd(int a, int b){
    int c;
    if(a == b){
      return a;
    }else{
      if (b > a ){
        return mcd(b, a);
      }else{
        return mcd(a-b, b);
      }
    }
  }
}
