import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire lunghezza array:");
    int n = input.nextInt(), indice;
    int[] array1 = Metodi.creaArray(n);
    Metodi.stampaArray(array1);
    System.out.println("Inserire elemento da cercare:");
    int a = input.nextInt();
    if (Metodi.trovaElemento(array1, a)) {
      indice = Metodi.trovaIndice(array1, a);
      System.out.println("Elemento trovato all'indice " + indice);
      Metodi.eliminaElemento(array1, indice);
      System.out.println("L'elemento è stato eliminato e l'array è ora il  seguente:");
      Metodi.stampaArray(array1);
      System.out.println("L'array è stato invertito ed è il seguente:");
      Metodi.invertiArray(array1);
      Metodi.stampaArray(array1);
    }else{
      System.out.println("Elemento non presente");
    }
  }
}
