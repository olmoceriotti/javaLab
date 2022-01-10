public class Metodi{
  public static void modificaArray(int[] par, int a){
    int prod = 1, sum = 0;
    for (int i = 0; i < par.length; i++) {
      prod = prod * par[i];
      sum = sum + par[i];
    }
    if (a > (prod - sum) && a < (prod + sum)){
      for (int i = 0; i < par.length; i++) {
        if (par[i] > a) {
          par[i] = prod + sum;
        }
      }
    }else{
      for (int i = 0; i < par.length; i++) {
        if (par[i] < a) {
          par[i] = prod - sum;
        }
      }
    }
  }

  public static void stampArray(int[] array){
    for (int i = 0; i< array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static int valutaDifferenzeArray(int[] par1, int[] par2){
    int returnValue = 0;
    boolean uguale = true;
    if (par1.length == par2.length) {
      for (int i = 0; i < par1.length; i++) {
        if (par1[i] != par2[i]) {
          uguale = false;
        }
      }
      if (uguale) {
        returnValue = 0;
      }else{
        returnValue = 1;
      }
    }else{
      returnValue = -1;
    }
    return returnValue;
  }
}
