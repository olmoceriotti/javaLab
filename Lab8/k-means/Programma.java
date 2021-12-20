import java.util.*;
import java.io.*;
public class Programma{
  public static void main(String[] args) throws FileNotFoundException{
    /*Valori N e M non richieste ma tratti da dataset*/
    int numeroCluster = 3, iter = 1000, nIter = 0;
    double obiettivo = 0, alfa = 0.1, precisione = 0, precisioneN = 0, precisioneM;
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
        precisione = precisioneN-precisioneM;
      }
      nIter++;
    } while (precisione > alfa && nIter  < iter);
    System.out.println("Cluster: ");
    for (int i = 0; i < cluster.length; i++) {
      System.out.println(cluster[i]);
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
  }
}
