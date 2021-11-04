import java.util.Scanner;
public class Esercizio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserire mese (1-12) e anno (1900 - 2099)");
        int month = input.nextInt();
        int year = input.nextInt();
        int daysInMonth = 0;
        if(month <1 || month > 12 || year < 1900 || year > 2099){
            System.out.println("Numero non consentito - mese o anno non esistente");
            System.exit(0);
        }
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
            break;
            case 2:
                if(year%4 == 0 && year%100 != 0){
                    daysInMonth = 29;
                }else if(year%4 == 0){
                    daysInMonth = 29;
                }else{
                    daysInMonth = 28;
                }

        }

        System.out.println(daysInMonth);
            
            
       
       input.close(); 
    }
}