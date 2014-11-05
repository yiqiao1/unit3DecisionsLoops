import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in a word: ");
        
        String word = in.next();
        String wordSub = " ";
        int count = 0;
        int a = 0;
        int c = 1;
        int b = a+c;
        
        while (b<=word.length())
        {
            wordSub = word.substring(a,b);
            System.out.println(wordSub);
            a++;
            b++;
            count++;
            
            if (count == word.length())
            {
                a = 0;
                c++;
                b = a+c;
                count = c-1;
            }
        }
    }
}