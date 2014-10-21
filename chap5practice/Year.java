import java.util.Scanner;

/**
 * Write a description of class Year here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Year
{
    private boolean leapYear;
    private int year;
    
    public Year(int year)
    {
        year = year;
    }
    
    public void isLeapYear()
    {    
        if ((year % 4) == 0)
        {
            if ((year % 100) == 0)
            {
                if ((year % 400) == 0)
                {
                    this.leapYear = true;
                }
                else 
                {
                    this.leapYear = false;
                }
            }
            else
            {
                this.leapYear = true;
            }
        }
        else
        {
            this.leapYear = false;
        }
        
        if (leapYear == true)
        {
            System.out.println("This is a leap year.");
        }
        else
        {
            System.out.println("This is not a leap year.");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a year: ");
        Year year = new Year(in.nextInt());
        year.isLeapYear();
    }
}

