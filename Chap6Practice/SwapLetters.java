import java.util.Scanner;
import java.util.Random;

public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter a word: ");
        
        String word = in.next();
        String first = " ";
        String middle = " ";
        String last = " ";
        
        for(int x = 1;x<2;x++)
        {
            int i = rand.nextInt(word.length()-1);
            
            int j = rand.nextInt(word.length()-1-i);
            j = j+1+i;
            first = word.substring(0,i);
            middle = word.substring(i+1,j);
            last = word.substring(j+1,word.length());
            
            word = first + word.charAt(j) + middle + word.charAt(i) + last; 
        }
        
        System.out.println(word);
    }
}