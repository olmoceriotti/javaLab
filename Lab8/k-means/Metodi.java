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

  public static void stampaMatrice(double [][] matrice){
    for (int i = 0; i< matrice.length; i++) {
      for (int j = 0; j < matrice[0].length; j++) {
        System.out.print(matrice[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static double[][] inizializzaCluster(double[][] dati, int k){
    double[][] centri = new double[k][dati[0].length];
    int indice;
    int [] numeriEstratti = new int [k];
    boolean presente;
    for (int i = 0; i < k; i++) {
      do {
        presente = false;
        indice = (int) (Math.random() * dati.length);
        for (int j = 0; j < numeriEstratti.length; j++) {
          if (numeriEstratti[j] == indice) {
            presente = true;
          }
        }
      } while (presente);
      numeriEstratti[i] = indice;
      centri[i] = dati[indice];
    }
    System.out.println("Numeri estratti: ");
    for (int i = 0; i < numeriEstratti.length; i++) {
      System.out.print(numeriEstratti[i] + " ");
    }
    System.out.println();
    return centri;
  }

  public static void calcolaCluster(double[][] dati, double[][] centri, int[] cluster){
    double distanza = 0, dTemp, minDist;
    int clusterIndex = -1;
    for (int i = 0; i < dati.length; i++) {
      minDist = 1000;
      for (int j = 0; j < centri.length; j++) {
        distanza = 0;
        for (int a = 0; a < dati[0].length; a++) {
          dTemp = Math.pow(dati[i][a] - centri[j][a], 2);
          distanza += dTemp;
        }
        distanza = Math.sqrt(distanza);
        if (distanza < minDist) {
          minDist = distanza;
          clusterIndex = j;
        }
      }
      cluster[i] = clusterIndex;
    }
  }

  public static void aggiornaCentri(double[][] dati, double[][] centri, int[] cluster){
    int cardCluster = 0;
    double somma = 0;
    for (int i = 0; i < centri.length; i++) {
      for (int a = 0; a < centri[0].length; a++) {
        somma = 0;
        cardCluster = 0;
        for (int j = 0; j < cluster.length; j++) {
          if (cluster[j] == i) {
            somma = somma + dati[j][a];
            cardCluster += 1;
          }
        }
        centri[i][a] = somma/cardCluster;
      }
    }
  }

  public static double calcolaObiettivo(double[][] dati, double[][] centri, int[] cluster){
    double distanza = 0, dTemp, obiettivo = 0;
    for (int i = 0; i < cluster.length; i++) {
      distanza = 0;
      for (int j = 0; j < dati[0].length; j++) {
        dTemp = Math.pow(dati[i][j] - centri[cluster[i]][j], 2);
        distanza += dTemp;
      }
      obiettivo += Math.sqrt(distanza);
    }
    return obiettivo;
  }
}
