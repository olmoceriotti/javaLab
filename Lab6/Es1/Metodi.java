public class Metodi{
  public static int estraiNumeroCasuale(){
    int numero = (int) (Math.random() * 100) +1;
    return numero;
  }
  public static int confrontaNumeri(int sceltaUtente, int numero){
    int indovinato = -1;
    if (sceltaUtente == numero) {
      indovinato = 1;
    }
    return indovinato;
  }
  public static void aggiornaInformazioniPartite(int [] numeriDaIndovinare, int []numeroTentativi, boolean [] indovinatoReg, int tentativi, int indovinato, int numero, int partite){
    if(partite < 5){
      numeriDaIndovinare[partite] = numero;
      numeroTentativi[partite] = tentativi;
      if (indovinato == -1) {
        indovinatoReg[partite] = false;
      }else{
        indovinatoReg[partite] = true;
      }
    }else{
      for (int i = 0; i < 4; i++ ) {
        numeriDaIndovinare[i] = numeriDaIndovinare[i+1];
        numeroTentativi[i] = numeroTentativi[i+1];
        indovinatoReg[i] = indovinatoReg[i+1];
      }
      numeriDaIndovinare[4] = numero;
      numeroTentativi[4] = tentativi;
      if (indovinato == -1) {
        indovinatoReg[4] = false;
      }else{
        indovinatoReg[4] = true;
      }
    }
  }
  public static void StampaPartite(int [] numeriDaIndovinare, int [] numeroTentativi, boolean [] indovinatoReg, int partite){
    int indice;
    if (partite < 5) {
      indice = partite + 1;
    }else{
      indice = 5;
    }
    System.out.println("Ultime "+ indice + " partite:");
    for (int i = 0;i < indice; i++) {
      System.out.print("Partita " + (partite - (indice - i) + 2) +  ": ");
      System.out.print("Obiettivo: " + numeriDaIndovinare[i] + " Tentativi: " + numeroTentativi[i] + " Indovinato: " + indovinatoReg[i] + ";\n");
    }
  }
}
