public class Metodi{
  public static int[] creaArray(int n){
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 100);
    }
    return array;
  }

  public static void stampaArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static int stringToInt(String s){
    int dec = 1, risultato = 0;
    char c;
    for (int i = 0; i < s.length(); i++) {
      c = s.charAt(s.length() - (i + 1));
      risultato = (c - 48) * dec;
      dec *= 10;
    }
    return risultato;
  }

  //Trovare quali elementi nell'array hanno una determinata somma
  public static void cercaTarget(int[] array1, int[] array2, int n){
    int indice1, indice2;
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i] + array2[j] == n) {
          System.out.println("Trovato agli indici " + i + " e " + j);
        }
      }
    }
  }

  //Bubble sort
  public static void riordinaArray(int[] array){
    boolean ordinato = false;
    int temp;
    while(!ordinato){
      ordinato = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i+1]) {
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          ordinato = false;
        }
      }
    }
    stampaArray(array);
  }

  //crea matrice formata dalla moltiplicazione degli elementi dei due array1
  public static int[][] creaMatrice(int[] array1, int[] array2){
    int[][] matrice = new int[array1.length][array2.length];
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        matrice[i][j] = array1[i] * array2[j];
      }
    }
    return matrice;
  }

  public static void stampMatrice(int[][] matrice){
    for (int i = 0; i < matrice.length; i++) {
      for (int j = 0; j < matrice[i].length; j++) {
        System.out.print(matrice[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] creaMatriceIr(){
    int[][] matrice = new int[10][];
    for (int i = 0; i < matrice.length; i++) {
      int indice = (int)(Math.random() * 10);
      matrice[i] = new int[indice];
    }
    return matrice;
  }
}
