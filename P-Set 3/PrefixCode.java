import java.util.*;

public class PrefixCode {

    public String isOne(String[] words) {
        // fill in body of this function
        for(int i = 0; i < words.length; i++)
        {
            if(isPrefix(words, words[i]))
            {
                return "No, " + i;
            }
        }
        return "Yes";
    }

    private boolean isPrefix(String[] words, String s)
    {
        for(String word: words)
        {
            if(s.length() <= word.length() && !s.equals(word) && s.equals(word.substring(0, s.length())))
            {
                return true;
            }
        }
        return false;
    }



}