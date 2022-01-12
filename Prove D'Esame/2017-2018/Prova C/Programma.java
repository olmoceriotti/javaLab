import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire numero elementi:");
    int n = input.nextInt(), a, b, modCounter = 0;
    int[] interi = new int[n];
    int[] copiaInteri = new int[n];
    System.out.println("Inserire contenuto array:");
    for (int i = 0; i < n; i++) {
      interi[i] = input.nextInt();
      copiaInteri[i] = interi[i];
    }
    System.out.println("Inserire due numeri, il primo più piccolo del secondo");
    do {
      a = input.nextInt();
      b = input.nextInt();
      if (a >= b) {
        System.out.println("Il primo numero deve essere minore del secondo");
      }
    } while (a >= b);
    Metodi.occorrenzeElementi(copiaInteri, a, b);
    Metodi.stampaArray(interi);
    Metodi.stampaArray(copiaInteri);
    for (int i = 0; i < interi.length; i++) {
      if (interi[i] != copiaInteri[i]) {
        modCounter++;
      }
    }
    if (modCounter > (n/2)) {
      int[] interi3 = Metodi.modificaElementi(interi, copiaInteri);
      Metodi.stampaArray(interi3);
    }
  }
}
