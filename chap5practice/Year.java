import java.util.Scanner;

/**
 * Write a description of class Year here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Year
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year;
        
        System.out.print("Please enter a year: ");
        year = in.nextInt();
        
        
        if ((year % 4) == 0)
        {
            if ((year % 100) == 0)
            {
                if ((year % 400) == 0)
                {
                    System.out.print(year + " is a leap year.");
                }
                else 
                {
                    System.out.print(year + " is not a leap year.");
                }
            }
            else
            {
                System.out.print(year + " is a leap year.");
            }
        }
        else
        {
            System.out.print(year + " is not a leap year.");
        }
    }
}
