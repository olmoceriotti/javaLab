import java.util.Scanner;
public class Programma{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean uscita = false;
    String sceltaUtente, risultato = "";
    int a, b;
    double aD, bD;
    do{
      sceltaUtente = "";
      risultato = "";
      System.out.println("Menù:");
      System.out.println("a) somma di due numeri interi");
      System.out.println("b) divisione intera e resto tra due numeri interi");
      System.out.println("c) media tra due numeri double");
      System.out.println("d) valore assoluto di un numero intero");
      System.out.println("e) lunghezza della stringa che rappresenta un numero intero");
      System.out.println("t) termina il programma");
      sceltaUtente = input.nextLine();
      switch (sceltaUtente) {
        case "a":
        case "A":
          System.out.println("Inserire due numeri interi:");
          a = input.nextInt();
          b = input.nextInt();
          risultato = "Somma: " + Metodi.sommaDueInteri(a, b);
        break;
        case "b":
        case "B":
          System.out.println("Inserire due numeri interi:");
          a = input.nextInt();
          b = input.nextInt();
          if(b!=0){
            risultato ="Risultato: " + Metodi.divisioneIntera(a, b);
            risultato = risultato + " resto: " + Metodi.restoDivisioneIntera(a, b);
          }else{
            System.out.println("Numero non consentito");
            break;
          }
        break;
        case "C":
        case "c":
          System.out.println("Inserire due numeri con la virgola");
          aD = input.nextDouble();
          bD = input.nextDouble();
          risultato = "risultato: " + Metodi.mediaTraDueDouble(aD, bD);
        break;
        case "d":
        case "D":
          System.out.println("Inserire un numero intero:");
          a = input.nextInt();
          risultato = "Risultato: " + Metodi.valoreAssolutoIntero(a);
        break;
        case "e":
        case "E":
          System.out.println("Inserire un numero intero");
          a = input.nextInt();
          risultato = "Risultato: " + Metodi.lunghezzaStringaIntero(a);
        break;
        case "t":
        case "T":
          uscita = true;
          risultato = "Programma terminato";
        break;
        default:
          System.out.println("Carattere non autorizzato: " + sceltaUtente);
        break;
      }
      input.nextLine();
      System.out.println(risultato);
    }while(!uscita);

  }
}
