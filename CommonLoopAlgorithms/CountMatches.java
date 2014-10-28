import java.util.Scanner;

public class CountMatches
{
    /**
    * Count the number of spaces (' ') in the specified string.
    */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter a string: ");
        String str = in.nextLine();
        
        int spaces = 0;
        
        for( int index = 0; index < str.length(); index++)
        {
            char ch = str.charAt( index );
            
            if( ch == ' ' )
            {
                spaces++;
            }
        }
        
        System.out.println("Number of spaces: " + spaces);
    }
}