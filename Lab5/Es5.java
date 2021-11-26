import java.util.Scanner;
public class Es5{
  public static  int menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("Inserire il numero a sinistra dell'operazione desiderata:");
    System.out.println("1) Decimale → Binario");
    System.out.println("2) Binario → Decimale");
    System.out.println("3) Uscita");
    int scelta = input.nextInt();
    return scelta;
  }

  public static String convertiDecInBin(int num){
    String bin = "";
    if(num == 1){
      bin = "1";
    }else if(num == 0){
      bin = "0";
    }

    while(num > 0){
      if(num%2 == 0){
        bin = "0" + bin;
        num  = num/2;
      }else if(num%2 == 1){
        bin = "1" + bin;
        num  = num/2;
      }else{
        System.out.println("Errore");
        System.exit(-1);
      }
    }

    return bin;
  }

  public static int convertiBinInDec(int num){
    String s1 = "" + num;
    char c;
    int n, n2 = 0, pow = 1;
    for(int i = 1; i <= s1.length(); i++){
      c = s1.charAt((s1.length() - i));
      n = c - 48;
      n2 = n2 + n * pow;
      pow *= 2;
    }
    return n2;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean uscita = false;
    int num;
    while(!uscita){
      switch(menu()){
        case 1:
        System.out.println("Inserire un numero decimale positivo:");
        num = input.nextInt();
        if(num >= 0){
          System.out.println("Il numero decimale convertito in binario è: " + convertiDecInBin(num));
        }else{
          System.out.println("Numero non valido");
        }
        break;
        case 2:
          System.out.println("Inserire un numero binario:");
          num = input.nextInt();
          if(num >= 0){
            System.out.println("Il numero binario convertito in decimale è: " + convertiBinInDec(num));
          }else{
            System.out.println("Numero non valido");
          }

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
