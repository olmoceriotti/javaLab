import java.util.Scanner;
public class Esercizio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int votoTeoria;
        int votoPratica;
        int sommaVoti;
        do{
            System.out.println("Inserire i voti di teoria (-8 - 8) e pratica (0 - 24)");
            votoTeoria = input.nextInt();
            votoPratica = input.nextInt();
            sommaVoti = votoPratica + votoTeoria;
        }while(votoTeoria < -8 || votoTeoria > 8 || votoPratica < 0 || votoPratica > 24);

        if(votoTeoria > 0 && votoPratica > 18 && sommaVoti>= 18){
            if(sommaVoti >30)
                System.out.println("Congratulazioni: 30 e Lode");
            else
                System.out.println("Il tuo voto è: " + sommaVoti);       
        }else{
            if(votoTeoria <= 0 && votoPratica < 18)
            System.out.println("Bocciato, devi studiare ed esercitarti di più");
            else if(votoTeoria >= 0){
                System.out.println("Bocciato, devi esercitatrti di più");
            }else{
                System.out.println("Bocciato, devi studiare di più la teoria");
            }
        }

        input.close();
        
    }
}
