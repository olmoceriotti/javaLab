public class Programma{
  public static void main(String[] args) {
    char[] caratteri = new char[5];
    char[] copiaCaratteri = new char[5];
    char c = args[5].charAt(0);
    int diff;
    for (int i = 0; i < caratteri.length; i++) {
      caratteri[i] = args[i].charAt(0);
      copiaCaratteri[i] = caratteri[i];
    }
    Metodi.modificaArray(copiaCaratteri, c);
    Metodi.stampaArray(caratteri);
    Metodi.stampaArray(copiaCaratteri);
    diff = Metodi.valutaDifferenzeArray(caratteri, copiaCaratteri);
    if (diff == -1) {
      System.out.println("Errore");
      System.exit(-1);
    }else if(diff  == 0){
      System.out.println("copiaCaratteri:");
      Metodi.stampaArray(copiaCaratteri);
    }else{
      System.out.println("caratteri:");
      Metodi.stampaArray(caratteri);
    }

  }
}
