package Labs.Week_1.scr;
import java.util.Scanner;

public class SalesBarChart 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int[] sales = new int[5];
        //int stores = 0;

        for(int i=0; i<5; i++)
        {
            System.out.println("Enter today's sales for store "+(i+1)+": ");
            sales[i] = keyboard.nextInt();
        }
        
        System.out.println("\nSales Bar Chart");
        System.out.println("Each * = $100");

        for(int i=0; i<5; i++)
        {
            int ast = (int)(sales[i]/100);
            System.out.print("\nStore "+(i+1)+": ");
            for(int j=0; j<ast; j++)
            {
                System.out.print("*");
            }
        }
        keyboard.close();

    }
    
}
