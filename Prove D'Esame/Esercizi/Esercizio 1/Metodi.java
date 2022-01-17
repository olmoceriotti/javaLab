public class Metodi{
  public static int[] creaArray(int n){
    boolean trovato = false;
    int[] array = new int [n];
    for (int i = 0; i < array.length; i++) {
      do {
        trovato = false;
        array[i] = (int) (Math.random()*100) + 1;
        for (int j = 0; j < i && !trovato; j++) {
          if (array[i] == array[j]) {
            trovato = true;
          }
        }
      } while (trovato);
    }
    return array;
  }

  public static void stampaArray(int[] array){
    for (int i = 0; i < array.length; i++) {
      if (array[i] != 0) {
        System.out.print(array[i] + " ");
      }
    }
    System.out.println();
  }

  /*Write a Java program to test if an array contains a specific value.*/
  public static boolean trovaElemento(int[] array, int n){
    boolean trovato = false;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        trovato = true;
      }
    }
    return trovato;
  }

  /*Write a Java program to find the indec of a specific value in an  array.*/
  public static int trovaIndice(int[] array, int n){
    int indice = -1;
    for (int i  = 0; i < array.length; i++) {
      if (array[i] == n) {
        indice = i;
      }
    }
    return indice;
  }
  /*Write a Java program to remove a specific element from an array and change the position of the others.*/
  public static void eliminaElemento(int[] array, int indice){
    for (int i = indice; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    array[array.length - 1] = 0;
  }
  /*Write a Java program to reverse an array of integer values*/
  public static void invertiArray(int[] array){
    int temp;
    for (int i = 0; i < array.length/2; i++) {
      temp = array[i];
      array[i] = array[array.length - (i + 1)];
      array[array.length - (i + 1)] = temp;
    }
  }
}
