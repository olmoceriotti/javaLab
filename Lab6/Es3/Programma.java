import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    boolean valida = Metodi.controllaValiditaEspressione(args);
    if(!valida){
      System.out.println("Espressione non valida");
      System.exit(-1);
    }else{
      System.out.println(Metodi.valutaEspressione(args));
    }
  }
}
