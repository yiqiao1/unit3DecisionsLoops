public class StringCompare
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if (word1.compareTo("aaa") == 0)
        {
            System.out.println(word1 + " and 'aaa' have the same number of characters.");
        }
        else if (word1.compareTo("aaa") > 0)
        {
            System.out.println(word1 + " has more characters than 'aaa'");
        }
        else
        {
            System.out.println(word2 + " has more characters than 'aaa'");
        }
        
        if (word1.equals(word2))
        {
            System.out.println(word1 + " and " + word2 + "have the same number of characters.");
        }
        else if (word1.compareTo(word2) > 0)
        {
            System.out.println(word1 + " has more characters than" + word2);
        }
        else
        {
            System.out.println(word2 + " has more characters than" + word1);
        }
    }
}