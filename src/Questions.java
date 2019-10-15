public class Questions 
{
    String quest[]=new String[10];
    String ans[]=new String[10];
    int i;
    Game gm;
    
    public Questions(String quest[],String ans[], int i)
    {
        this.i=i;
        for(int j=0; j<=i; j++)
        {
            this.quest[j]=quest[j];
            this.ans[j]=ans[j];
        }
        gm = new Game(this.quest, this.ans, this.i);
    }
    
}
