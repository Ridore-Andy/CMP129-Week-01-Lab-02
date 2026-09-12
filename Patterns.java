package Labs.Week_1.scr;

public class Patterns 
{
    public static void main(String[] args)
    {
        System.out.println("Pattern A");
        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("+");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for(int i=10; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("+");
            }
            System.out.println();
        }
       
    }
    
}
