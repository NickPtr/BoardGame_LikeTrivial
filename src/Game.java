
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game 
{
    String questTab[]=new String[10];
    String ansTab[]=new String[10];
    int i;
    int points=0;
    int r = new Random().nextInt(i+1);
    
    public Game(String q[], String ans[], int i)
    {
        this.i=i;
         for(int j=0; j<=i; j++)
        {
            questTab[j]=q[j];
            ansTab[j]=ans[j];
        }
        
    }
    
    public void StartGame()
    {
        List<String> solution = new ArrayList<>();
        
        for(int j=0; j<=i; j++)
        {
           solution.add(questTab[j]);
        }
        Collections.shuffle(solution);
        for(int j=0; j<=i; j++)
        {
            System.out.println(solution.get(j));
            System.out.print("Give your answear: ");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if(solution.get(j).startsWith("1"))
            {
                if(input.equals(ansTab[0]))
                {
                    points=points+10;
                }
                else
                {
                    System.out.println(ansTab[0]);
                }
            }
            else if(solution.get(j).startsWith("2"))
            {
                if(input.equals(ansTab[1]))
                {
                    points=points+10;
                }
                else
                    System.out.println(ansTab[1]);
            }
            else if(solution.get(j).startsWith("3"))
            {
                if(input.equals(ansTab[2]))
                {
                    points=points+10;
                }
                else
                    System.out.println(ansTab[2]);
            }
            else if(solution.get(j).startsWith("4"))
            {
                if(input.equals(ansTab[3]))
                {
                    points=points+10;
                }
                else
                    System.out.println(ansTab[3]);
            }
            else if(solution.get(j).startsWith("5"))
            {
                if(input.equals(ansTab[4]))
                {
                    points=points+10;
                }
                else
                    System.out.println(ansTab[4]);
            }
            else if(solution.get(j).startsWith("6"))
            {
                if(input.equals(ansTab[5]))
                {
                    points=points+20;
                }
                else
                    System.out.println(ansTab[5]);
            }
            else if(solution.get(j).startsWith("7"))
            {
                if(input.equals(ansTab[6]))
                {
                    points=points+20;
                }
                else
                    System.out.println(ansTab[6]);
            }
            else if(solution.get(j).startsWith("8"))
            {
                if(input.equals(ansTab[7]))
                {
                    points=points+20;
                }
                else
                    System.out.println(ansTab[7]);
            }
            else if(solution.get(j).startsWith("9"))
            {
                if(input.equals(ansTab[8]))
                {
                    points=points+20;
                }
                else
                    System.out.println(ansTab[8]);
            }
            else if(solution.get(j).startsWith("0"))
            {
                if(input.equals(ansTab[9]))
                {
                    points=points+20;
                }
                else
                    System.out.println(ansTab[9]);
            }
        }
       
        System.out.println("To teliko poso pou sigentrosate einai: "+points+"€");    
    }
}
