import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Programma{
  public static void main(String[] args) throws FileNotFoundException{
    /*Valori N e M non richiesti ma tratti da dataset*/
    int numeroCluster = 3, iter = 100000, nIter = 0;
    double obiettivo = 0, alfa = -1, precisione = 2, precisioneN = 0, precisioneM = 0;
    double [][] dati;
    dati = Metodi.inizializzaDati();
    //Metodi.stampaMatrice(dati);
    double [][] centri = Metodi.inizializzaCluster(dati, numeroCluster);
    int [] cluster = new int[dati.length];
    do {
      Metodi.calcolaCluster(dati, centri, cluster);
      Metodi.aggiornaCentri(dati, centri, cluster);
      obiettivo = Metodi.calcolaObiettivo(dati, centri, cluster);
      precisioneM = precisioneN;
      precisioneN = obiettivo;
      if (nIter > 1) {
        precisione = precisioneM - precisioneN;
      }
      nIter++;
    } while (precisione > alfa && nIter  < iter);
    int [] counters = new int[numeroCluster];
    for (int i = 0; i < cluster.length; i++) {
      System.out.print("Record numero " + i + ": ");
      for (int j = 0; j < dati[0].length; j++) {
        System.out.print(dati[i][j] + " " );
      }
      System.out.println("cluster: " + cluster[i]);
      counters[cluster[i]]++;
    }
    System.out.println("Numero iterazioni: " + nIter);
    System.out.println("Obiettivo in iterazione " + (nIter - 1) + ": " + precisioneM + " e obiettivo in iterazione " + nIter + ": " + precisioneN);
    System.out.println("Precisione: " + precisione);
    if (precisione <= alfa) {
      System.out.println("Terminazione per raggiungimento alfa");
    }else{
      System.out.println("Terminazione per raggiungimento numero massimo di iterazioni");
    }
    System.out.println("Massimo di iterazioni " + iter);
    for (int i = 0; i < counters.length; i++) {
      System.out.println("Cluster " + (i + 1) + " : " + counters[i] + " elementi");
    }
  }
}
