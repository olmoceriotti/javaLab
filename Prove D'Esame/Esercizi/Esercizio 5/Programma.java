import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    int[] array = {1, 2, 3 , 4};
    stampa(array);
    int[] selection = selectionSort(array);
    int[] bubble = bubbleSort(array);
    stampa(selection);
    stampa(bubble);
  }

  public static int[] creaArray(int n){
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random() * 100);
    }
    return array;
  }

  public static int[] selectionSort(int[] array){
    int min = 1000, temp, indice = 0, accessCounter = 0;
    for (int i = 0; i < array.length; i++) {
      min = 1000;
      for (int j = i; j < array.length; j++) {
        if (array[j] < min) {
          min = array[j];
          indice = j;
        }
        accessCounter++;
      }
      temp = array[i];
      array[i] = min;
      array[indice] = temp;
    }
    System.out.println("Selection access " + accessCounter);
    return array;
  }

  public static int[] bubbleSort(int[] array){
    boolean ordinato = false;
    int temp, accessCounter = 0;
    while(!ordinato){
      ordinato = true;
      for (int i = 0; i < (array.length - 1); i++) {
        if (array[i] > array[i +1] && ordinato == true) {
          ordinato = false;
          temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
        }
        accessCounter++;
      }
    }
    System.out.println("bubble access " + accessCounter);
    return array;
  }

  public static void stampa(int[] array){
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
