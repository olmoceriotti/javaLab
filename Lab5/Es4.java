import java.util.Scanner;
public class Es4{
  public static int menu(){
    Scanner input = new Scanner(System.in);
    int scelta;
    System.out.println("Inserire il numero a sinistra dell'operazione desiderata:");
    System.out.println("1) Fahrenheit → Celsius");
    System.out.println("2) Celsius → Fahrenheit");
    System.out.println("3) Uscita");
    scelta = input.nextInt();
    return scelta;
  }
  public static double convertiFinC(double temp){
    double ris = (temp - 32) /1.8;
    return ris;
  }
  public static double convertiCinF(double temp){
    double ris =(1.8*temp) +32;
    return ris;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean uscita = false;
    double temp;
    while(!uscita){
      switch (menu()){
        case 1:
          System.out.println("Inserisci temperatura in Fahrenheit:");
          temp = input.nextDouble();
          System.out.println("Celsius: " + convertiFinC(temp));
        break;
        case 2:
          System.out.println("Inserisci temperatura in Celsius:");
          temp = input.nextDouble();
          System.out.println("Fahrenheit: " + convertiCinF(temp));
        break;
        case 3:
          System.out.println("Uscita in corso ...");
          uscita = true;
        break;
        default:
        System.out.println("Operazione non consentita");
        break;
      }
    }
    System.out.println("Programma terminato");
  }
}
