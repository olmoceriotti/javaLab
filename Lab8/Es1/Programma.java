public class Programma{
  public static void main(String[] args) {
    String espressione = args[0], valori = args[1], daCalc;
    int [] tabella = new int[5];
    if (!Metodi.checkEspr(espressione)) {
      System.out.println("Stringa non valida\nUScita in corso...");
      System.exit(-1);
    }else{
      System.out.println("Espressione valida");
    }
    if (!Metodi.checkValori(valori)) {
      System.out.println("Valori non validi");
      System.exit(-1);
    }else{
      System.out.println("Valori validi");
    }
    Metodi.estraiValori(valori, tabella);
    daCalc = Metodi.sostituisci(espressione, tabella);
    System.out.println(espressione + " -> " + Metodi.calcola(daCalc));
  }
}
