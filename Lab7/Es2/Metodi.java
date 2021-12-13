public class Metodi{
  public static int stringtoInt(String n){
    char charCode, c;
    int numero = 0,  dec = 1;
    for (int i = 0; i < n.length(); i++) {
      charCode = n.charAt(n.length() - (i + 1));
      numero = numero + (dec * (charCode - 48));
      dec *= 10;
    }
    return numero;
  }
  public static int[][] creaMondo(){
    int[][] mondo = new int[20][20];
    return mondo;
  }

  public static boolean aggiungiObiettivo(int [][] mondo, int riga, int colonna){
    boolean aggiunto = false;
    if (riga >= 0 && riga <= 20 && colonna >= 0 && colonna <= 20) {
      if (mondo[riga][colonna] == 0) {
        mondo[riga][colonna] = 1;
        aggiunto = true;
      }
    }
    return aggiunto;
  }

  public static void aggiungiOstacolo(int [][] mondo){
    boolean aggiunto = false;
    int riga, colonna;
    while (!aggiunto) {
      riga = (int) (Math.random() * 20);
      colonna = (int) (Math.random() * 20);
      System.out.println(riga + " " + colonna);
      if (mondo[riga][colonna] == 0) {
        mondo[riga][colonna] = 2;
        aggiunto = true;
        System.out.println("Ostacolo aggiunto!");
      }
    }
  }

  public static int aggiungiPosizioniMondo(int[][] mondo, String percorso){
    boolean exit = false;
    int riga = 0, colonna = 0, returnValue = 0;
    char direzione;
    for (int i = 0; i < percorso.length() && !exit; i++) {
      direzione = percorso.charAt(i);
      switch (direzione) {
        case 's':
          riga += 1;
        break;
        case 'e':
          colonna += 1;
        break;
        case 'n':
          riga -= 1;
        break;
        case 'o':
          colonna -=  1;
        break;
        default:
          System.out.println("You screwed up");
        break;
      }
      if (riga < 0 || riga > 20 || colonna < 0 || colonna > 20) {
        returnValue = 3;
        exit = true;
      }else{
        if (mondo[riga][colonna] > 0 && mondo[riga][colonna] != 3) {
          returnValue = mondo[riga][colonna];
          exit = true;
        }else{
          mondo[riga][colonna] = 3;
        }
      }
    }
    return returnValue;
  }

  public static void stampaMondo(int [][] mondo){
    for (int i = 0; i < 22; i++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 0; i < mondo.length; i++) {
      System.out.print('*');
      for (int j  = 0; j < mondo[0].length; j++) {
        switch (mondo[i][j]) {
          case 1:
            System.out.print('X');
          break;
          case 2:
            System.out.print('#');
          break;
          case 3:
            System.out.print('O');
          break;
          default:
            System.out.print(" ");
          break;
        }
      }
      System.out.print('*');
      System.out.println();
    }
    for (int i = 0; i < 22; i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
