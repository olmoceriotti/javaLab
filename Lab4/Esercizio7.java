import java.util.Scanner;
public class Esercizio7{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Inserire due numeri dove il primo ha lo stesso numero o più cifre del secondo");

    String n = input.nextLine();
    String m = input.nextLine();
    int nInt = 0, mInt, decimal, index, charCode, nMulti, risultato;
    String multiRes = "";

    //check
    if(n.length() < m. length()){
      System.out.println("Numeri non validi");
      System.exit(0);
    }
    for(int i = 0; i < n.length(); i++){
      if(n.charAt(i) < '0' || n.charAt(i) > '9'){
        System.out.println("Carattere non consentito: " + n.charAt(i));
        System.exit(0);
      }
    }
    for(int i = 0; i < m.length(); i++){
      if(m.charAt(i) < '0' || m.charAt(i) > '9'){
        System.out.println("Carattere non consentito: " + m.charAt(i));
        System.exit(0);
      }
    }

    //m & n converter
    nInt = (int) n.charAt(n.length() - 1) - 48;
    decimal = 1;
    for(int i = 2; i <= n.length(); i++){

      decimal *= 10;
      index = n.length() - i;
      nInt = nInt + decimal * ((int) n.charAt(index) - 48);
    }

    mInt = (int) m.charAt(m.length() - 1) - 48;
    decimal = 1;
    for(int i = 2; i <= m.length(); i++){
      decimal = decimal * 10;
      index = m.length() - i;
      mInt = mInt + decimal * ((int) m.charAt(index) - 48);
    }

    System.out.println("******************************");
    multiRes = multiRes + mInt*nInt;

    System.out.println(nInt);
    for(int i = 0; i < (n.length() - m.length()); i++){
      System.out.print(" ");
    }
    System.out.println(mInt);

    for(int i= 0; i < multiRes.length(); i++){
      System.out.print("-");
    }
    System.out.println();

    for(int i = 1; i <= m.length(); i++){
      index = m.length() - i;
      nMulti = m.charAt(index) - 48;
      risultato = nMulti * nInt;
      System.out.print(risultato);
      for(int j = 0; j < (i -1); j++){
        System.out.print("-");
      }
      System.out.println();
    }

    for(int i= 0; i < multiRes.length(); i++){
      System.out.print("-");
    }
    System.out.println();
    System.out.println(multiRes);


  }
}
