public class Metodi{
  public static void occorrenzeElementi(int[] par, int a, int b){
    for (int i = 0; i < par.length; i++) {
      if (par[i] < a) {
        par[i] = b;
      }else if(par[i] > b){
        par[i] = a;
      }
    }
  }

  public static int[] modificaElementi(int[] par1, int[] par2){
    int[] interi3 = new int[par1.length + par2.length];
    for (int i = 0; i < interi3.length; i++) {
      if (i%2 == 0) {
        interi3[i] = par1[i/2];
      }else{
        interi3[i] = par2[i/2];
      }
    }
    return interi3;
  }

  public static void stampaArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
