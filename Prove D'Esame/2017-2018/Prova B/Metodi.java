public class Metodi{
  public static void modificaArray(char[] par, char c){
    int counter = 0;
    for (int i = 0; i < par.length; i++) {
      if (par[i] == c) {
        counter++;
      }
    }
    if (counter == 0) {
      for (int i = 0; i < par.length; i++) {
        if (i%2 == 0) {
          par[i] = c;
        }
      }
    }else if(counter < par.length){
      for (int i = 0; i < par.length; i++) {
        if (i%2 == 1) {
          par[i] = c;
        }
      }
    }
  }

  public static void stampaArray(char[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static int valutaDifferenzeArray(char[] par1, char[] par2){
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
