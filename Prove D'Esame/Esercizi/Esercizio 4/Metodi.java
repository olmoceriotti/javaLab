public class Metodi{
  public static void riempi(int[][] matrice){
    int step = (int) Math.pow(matrice.length, 2), n = 1;
    int a = matrice.length, row = -1, col = -1, b = 0;
    while(n < step){
      for (col++, row++; col < a; col++) {
        System.out.println("Step " + n + " row: " + row + " col: " + col);
        matrice[row][col] = n;
        n++;
      }
      for (row ++, col --; row < a; row++) {
        System.out.println("Step " + n + " row: " + row + " col: " + col);
        matrice[row][col] = n;
        n++;
      }
      for (col--, row--; col >= b; col--) {
        System.out.println("Step " + n + " row: " + row + " col: " + col);
        matrice[row][col] = n;
        n++;
      }
      for(row--, col++; row > b; row--){
        System.out.println("Step " + n + " row: " + row + " col: " + col);
        matrice[row][col] = n;
        n++;
      }
      a--;
      b++;
    }
  }
  public static void stampa(int[][] matrice){
    for (int i = 0; i < matrice.length; i++) {
      for (int j = 0; j < matrice[0].length; j++) {
        System.out.print(matrice[i][j] + " ");
      }
      System.out.println();
    }
  }
}
