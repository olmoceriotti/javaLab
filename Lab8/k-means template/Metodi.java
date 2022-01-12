import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Metodi{
  public static int calcolaNumeroOggetti() throws FileNotFoundException{
    File dataset = new File("Data/iris.data");
    Scanner input = new Scanner(dataset);
    int counter = 0;
    while(input.hasNext()){
      input.nextLine();
      counter++;
    }
    return counter;
  }

  public static int calcolaNumeroAttributi() throws FileNotFoundException{
    File dataset = new File("Data/iris.data");
    Scanner input = new Scanner(dataset);
    String line = input.nextLine();
    String[] lineAr = line.split(",");
    return lineAr.length;
  }

  public static double[] fromStringToDouble(String[] array){
    double[] dArray = new double[4];
    char  c;
    double risultato = 0.0, temp;
    double dec = 1;
    for (int i = 0; i < array.length; i++) {
      risultato = 0;
      dec = 1;
      for (int j = 0; j < array[i].length(); j++) {
        c = array[i].charAt(j);
        if (c >= '0' && c <= '9') {
          temp = Math.round(c - 48);
          risultato = risultato + temp * dec;
          dec /= 10;
        }
      }
      dArray[i] = Math.round(risultato * 10.0) / 10.0;
    }
    return dArray;
  }

  public static double[][] inizializzaDati() throws FileNotFoundException{
    File dataset = new File("Data/iris.data");
    Scanner input = new Scanner(dataset);
    int numeroOggetti = calcolaNumeroOggetti();
    int numeroAttributi = calcolaNumeroAttributi();
    String currentLine;
    String[] currentArray;
    System.out.println(numeroOggetti + " " + numeroAttributi);
    double [][] dati = new double[numeroOggetti][numeroAttributi];
    for (int i = 0; i < numeroOggetti; i++) {
      currentLine = input.nextLine();
      currentArray = currentLine.split(",");
      dati[i] = fromStringToDouble(currentArray);
    }
    return dati;
  }
}
