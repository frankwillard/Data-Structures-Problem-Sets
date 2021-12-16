import java.util.*;

public class Starter {

    public int begins(String[] words, String first) {
        // replace this code
        int sum = 0;
        HashSet<String> newwords = new HashSet<String>();
        for(int i = 0; i < words.length; i++)
        {
            newwords.add(words[i]);
        }
        for (String word : newwords)
        {
            String wordfirst = word.substring(0,1);
            if(wordfirst.equals(first))
            {
                sum+=1;
            }
        }
        return sum;
    }
}