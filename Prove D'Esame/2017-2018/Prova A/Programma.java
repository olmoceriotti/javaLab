public class Programma{
  public static void main(String[] args) {
    int[] interi = new int[5];
    int [] copiaInteri = new int[5];
    int n =  Integer.parseInt(args[5]), diff;
    for (int i = 0; i < interi.length; i++) {
      interi[i] = Integer.parseInt(args[i]);
      copiaInteri[i] = interi[i];
    }
    Metodi.modificaArray(copiaInteri, n);
    Metodi.stampArray(interi);
    Metodi.stampArray(copiaInteri);
    diff = Metodi.valutaDifferenzeArray(interi, copiaInteri);
    if (diff == -1) {
      System.out.println("Errore");
      System.exit(-1);
    }else if(diff == 0){
      System.out.println("Array interi:");
      Metodi.stampArray(interi);
    }else{
      System.out.println("Array copiaInteri:");
      Metodi.stampArray(copiaInteri);
    }
  }
}
