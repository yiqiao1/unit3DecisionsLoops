import java.util.Scanner;

public class Diamonds
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side length of the triangle: ");
        
        int length = in.nextInt();
        int timesThrough = 2*length-1;
        int i = 1;
        int spaceBeforeStar = Math.abs(length-i);
        int printSpace = 0;
        int numOfStars = timesThrough - (2*spaceBeforeStar);
        int printStar = 0;
        
        while (i<=timesThrough)
            {
            
            while (printSpace < spaceBeforeStar)
            {
                System.out.print(" ");
                printSpace++;
            }
            
            printSpace = 0;
            
            while (printStar < numOfStars)
            {
                System.out.print("*");
                printStar++;
            }
            
            printStar = 0;
            i++;
            spaceBeforeStar = Math.abs(length-i);
            numOfStars = timesThrough - (2*spaceBeforeStar);
            System.out.print("\n");
        }
    }
}