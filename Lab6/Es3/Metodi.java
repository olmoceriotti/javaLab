public class Metodi{
  public static boolean controllaValiditaEspressione(String [] args){
    boolean valido = true;
    int lun = args.length;
    for (int i = 0; i < lun; i++) {
      if (i == 0 || i == (lun-1)) {
        for (int j = 0; j < args[i].length(); j++) {
          if ((args[i].charAt(j) < '0' || args[i].charAt(j) > '9')){
            valido = false;
          }
        }
      }else{
        for (int j = 0; j < args[i].length(); j++) {
          if ((args[i].charAt(j) < '0' || args[i].charAt(j) > '9') && (args[i].charAt(j) != '+' && args[i].charAt(j) != '-')){
            valido = false;
          }
        }
      }
    }
    return valido;
  }
  public static int valutaEspressione(String [] args){
    int lun = args.length, risultato = 0, currentNumber;
    boolean sign = false;
    for (int i = 0; i < lun; i++) {
      if (args[i].charAt(0) >= '0' && args[i].charAt(0) <= '9' ){
        currentNumber = valutaOperando(args[i], sign);
        risultato = risultato + currentNumber;
      }else{
        if (args[i].charAt(0) == '-') {
          sign = true;
        }
      }
    }
    return risultato;
  }
  public static int valutaOperando(String s, boolean sign){
    int operando = 0, lun = s.length(), charCode, dec = 1;
    for (int i = 1; i <= lun; i++ ) {
      charCode = s.charAt(lun - i);
      charCode = charCode - 48;
      operando = operando + charCode *dec ;
      dec *= 10;
    }
    if (sign == true) {
      operando = -operando;
    }
    return operando;
  }
}
