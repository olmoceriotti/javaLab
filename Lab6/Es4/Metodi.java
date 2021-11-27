public class Metodi{
  public static int [] [] generaMatriceCasuale(int righe, int colonne){
    int [] [] a = new int[righe][colonne];
    int temp;
    for (int i = 0;i < righe; i++) {
      for (int j = 0; j < colonne; j++) {
        temp = (int) (Math.random()*100);
        a[i][j] = temp;
      }
    }
    stampaMatrice(a);
    return a;
  }

  public static int [][] trasponiMatrice(int [][] a){
    int [][] b = new int[a[0].length][a.length];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j  < a[0].length; j++) {
        b[j][i] = a[i][j];
      }
    }
    return b;
  }

  public static void stampaMatrice(int [][] a){
    for (int i = 0;i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
