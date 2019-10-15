
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        String questTab[]=new String[10];
        String ansTab[]=new String[10];
        
        questTab[0]="1) Poioi dwrisan stous Amerikanous to agalma ths Eleutherias?";
        ansTab[0]="Oi Galloi";
        questTab[1]="2) Pote arxise o Deuteros Pagkosmios Polemos?";
        ansTab[1]="1939";
        questTab[2]="3) Poios ithopoios protagwnistei sthn tainia Rabo?";
        ansTab[2]="Silvester Stalone";
        questTab[3]="4) Giati sunelhfthei to 1931 o Al Capone?";
        ansTab[3]="Forodiafigi";
        questTab[4]="5) Pote itan h teleutaia fora pou diorganothikan oi Olimpiakoi Agwnes sthn Ellada?";
        ansTab[4]="2004";
        questTab[5]="6) Poios anakalipse thn Ameriki to 1492?";
        ansTab[5]="Kolombos";
        questTab[6]="7) Poios einai o sugkrafeas tou muthistorimatos <<Egklima kai Timoria>>?";
        ansTab[6]="Ntostogiefski";
        questTab[7]="8) Poia einai i proteuousa tou Nepal?";
        ansTab[7]="Katmantou";
        questTab[8]="9) Poios anakalipse kai edwse onoma sta netronia?";
        ansTab[8]="James Chadwuic";
        questTab[9]="0) Poios filotexnise tin orofh ths Kapela Sistina?";
        ansTab[9]="Mixahl Aggelos";
        
        Questions q = new Questions(questTab, ansTab, 9);
        System.out.println("Patiste 1 gia enarksi paixnidiou: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input==1)
            q.gm.StartGame();
        else
            System.out.println("Lathos epilogi!!");
        
    }
    
}
