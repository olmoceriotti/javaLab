import java.util.Scanner;
public class Metodi{
  public static void stampaConfigurazioneDiGioco(int[][] gioco){
    for (int i = 0; i < gioco.length; i++) {
      for (int j = 0; j < gioco[0].length; j++) {
        switch (gioco[i][j]) {
          case 0:
            System.out.print(" ");
          break;
          case 1:
            System.out.print("O");
          break;
          case 2:
            System.out.print("X");
          break;
          default:
            System.out.println("Screwed up");
          break;
        }
        if (j < gioco[0].length - 1) {
          System.out.print("|");
        }
      }
      if (i < gioco.length - 1) {
        System.out.println("\n-+-+-");
      }else{
        System.out.println();
        System.out.println("***************");
      }
    }
  }

  public static int[][] creaNuovaConfigurazione(){
    int[][] gioco = new int[3][3];
    return gioco;
  }

  public static void mossaComputer(int [][] gioco){
    boolean posizione = false;
    for (int i = -1; i < 6 && !posizione; i++) {
      switch (i) {
        //PASSO AGGIUNTIVO FORSE SBAGLIATO (però funziona lol)
        //SE possibile vincere, vinci
        case -1:
        int rowCounter = 0, colCounter = 0, rDiagCounter = 0, lDiagCounter = 0;
          for (int j = 0; j < 3 && !posizione; j++) {
            rowCounter = 0;
            colCounter = 0;
            rDiagCounter = 0;
            lDiagCounter = 0;
            for (int a = 0; a < 3; a++) {
              if (gioco[j][a] == 2) {
                rowCounter +=1;
              }
              if (gioco[a][j] == 2) {
                colCounter +=1;
              }
              if (gioco[a][a] == 2) {
                rDiagCounter += 1;
              }
              if (gioco[2-a][a] == 2) {
                lDiagCounter += 1;
              }
            }
            if (rowCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[j][a] == 0) {
                  gioco[j][a] = 2;
                  posizione = true;
                }
              }
            }
            if (colCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[a][j] == 0) {
                  gioco[a][j] = 2;
                  posizione = true;
                }
              }
            }
            if (rDiagCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[a][a] == 0) {
                  gioco[a][a] = 2;
                  posizione = true;
                }
              }
            }
            if (lDiagCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[2-a][a] == 0) {
                  gioco[2-a][a] = 2;
                  posizione = true;
                }
              }
            }
          }
        System.out.println(i);
        break;
        //se l'avversario ha occupato due caselle di fila, occupare la casella rimanente;
        case 0:
        rowCounter = 0;
        colCounter = 0;
        rDiagCounter = 0;
        lDiagCounter = 0;
          for (int j = 0; j < 3 && !posizione; j++) {
            rowCounter = 0;
            colCounter = 0;
            rDiagCounter = 0;
            lDiagCounter = 0;
            for (int a = 0; a < 3; a++) {
              if (gioco[j][a] == 1) {
                rowCounter +=1;
              }
              if (gioco[a][j] == 1) {
                colCounter +=1;
              }
              if (gioco[a][a] == 1) {
                rDiagCounter += 1;
              }
              if (gioco[2-a][a] == 1) {
                lDiagCounter += 1;
              }
            }
            if (rowCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[j][a] == 0) {
                  gioco[j][a] = 2;
                  posizione = true;
                }
              }
            }
            if (colCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[a][j] == 0) {
                  gioco[a][j] = 2;
                  posizione = true;
                }
              }
            }
            if (rDiagCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[a][a] == 0) {
                  gioco[a][a] = 2;
                  posizione = true;
                }
              }
            }
            if (lDiagCounter == 2 && !posizione) {
              for (int a = 0; a < 3; a++) {
                if (gioco[2-a][a] == 0) {
                  gioco[2-a][a] = 2;
                  posizione = true;
                }
              }
            }
          }
        System.out.println(i);
        break;
        //se c'è una mossa che crea due coppie di caselle adiacenti in un colpo solo, scegliere quella;
        case 1:
          int twoCount = 0;
          for (int j = 0; j < 3 && !posizione; j++) {
            for (int a = 0; a < 3 && !posizione; a++) {
              if (gioco[j][a] == 0) {
                twoCount = 0;
                for (int e = j -1; e < 3; e++) {
                  for (int b = a -1; b < 3; b++) {
                    if (b >= 0 && b < 2 && e < 2 && e >= 0) {
                      if (gioco[e][b] == 2) {
                        twoCount += 1;
                      }
                    }
                  }
                }
                if (twoCount >= 2) {
                  gioco[j][a] = 2;
                  posizione = true;
                }
              }
            }
          }
        System.out.println(i);
        break;
        //se la casella centrale è libera, occuparla;
        case 2:
          if (gioco[1][1] == 0) {
            gioco[1][1] = 2;
            posizione = true;
          }
        System.out.println(i);
        break;
        //se l'avversario ha occupato una casella d'angolo, occupare la casella opposta;
        case 3:
        int jOpp, aOpp;
        for (int j = 0; j < 2 && !posizione; j++ ) {
          if (j == 1) {
            j += 1;
          }
          for (int a = 0; a < 2 && !posizione; a++) {
            if (a == 1) {
              a += 1;
            }
            if(j == 0){
              jOpp = 2;
            }else{
              jOpp = 0;
            }
            if (a == 0) {
              aOpp = 2;
            }else{
              aOpp = 0;
            }
            if (gioco[j][a] == 1 && gioco[jOpp][aOpp] == 0) {
              gioco[jOpp][aOpp] = 2;
              posizione = true;
            }
          }
        }
        System.out.println(i);
        break;
        //se c'è un angolo vuoto, occuparlo;
        case 4:
          for (int j = 0; j < 2 && !posizione; j++ ) {
            if (j == 1) {
              j += 1;
            }
            for (int a = 0; a < 2 && !posizione; a++) {
              if (a == 1) {
                a += 1;
              }
              if (gioco[j][a] == 0) {
                gioco[j][a] = 2;
                posizione = true;
              }
            }
          }
          System.out.println(i);
        break;
        //occupare una casella vuota qualsiasi.
        case 5:
          for(int j = 0; j < 3 && !posizione; j++){
            for (int a = 0; a < 3 && !posizione; a++) {
              if (gioco[j][a] == 0) {
                gioco[j][a] = 2;
                posizione = true;
              }
            }
          }
          System.out.println(i);
        break;
        default:
          System.out.println("ciaone");
        break;
      }
    }
  }

  public static void mossaUtente(int [][] gioco){
    Scanner input = new Scanner(System.in);
    boolean posizionneOccupata = false;
    System.out.println("Inserisci la posizione desiderata [riga][colonna]");
    int riga,colonna;
    do {
      posizionneOccupata = false;
      riga = input.nextInt();
      colonna = input.nextInt();
      if (riga >= 3 || riga < 0 || colonna >= 3 || colonna < 0) {
        System.out.println("Posizione non valida");
      }else{
        if (gioco[riga][colonna] != 0) {
          posizionneOccupata = true;
          System.out.println("Casella occupata, scegliere una posizione differente");
        }
      }
    } while (riga >= 3 || riga < 0 || colonna >= 3 || colonna < 0 || posizionneOccupata);

    gioco[riga][colonna] = 1;
  }

  public static int verificaVittoria(int [][] gioco){
    boolean vittoria = false;
    int vincitore = 0;
    if (!vittoria) {
      for (int i = 0; i < gioco.length && !vittoria; i++) {
        if (gioco[i][0] == gioco[i][1] && gioco[i][1] == gioco[i][2] && gioco[i][0] != 0) {
          vittoria = true;
          vincitore = gioco[i][0];
        }
      }
    }
    if (!vittoria) {
      for (int i = 0; i < gioco[0].length; i++) {
        if (gioco[0][i] == gioco[1][i] && gioco[1][i] == gioco[2][i] && gioco[0][1] != 0) {
          vittoria = true;
          vincitore = gioco[0][i];
        }
      }
    }
    if (!vittoria) {
      if (gioco[0][0] == gioco[1][1] && gioco[1][1] == gioco[2][2] && gioco[0][0] != 0) {
        vittoria = true;
        vincitore = gioco[0][0];
      }
    }
    if (!vittoria) {
      if (gioco[2][0] == gioco[1][1] && gioco[1][1] == gioco[0][2] && gioco[2][0] != 0) {
        vittoria = true;
        vincitore = gioco[2][0];
      }
    }
    if (vittoria) {
      if (vincitore == 2){
        vincitore = -1;
      }
    }
    return vincitore;
  }
}
