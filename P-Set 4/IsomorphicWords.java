import java.util.HashMap;

public class IsomorphicWords {
    public int countPairs(String[] words) {
        // fill in code here
        int sum = 0;
        for(int i = 0; i < words.length; i++)
        {
         for(int j=i+1; j < words.length; j++)
         {
             if(iso(words[i]).equals(iso(words[j])))
             {
                 sum+=1;
             }
         }
        }
        return sum;
    }

    public String iso(String s)
    {
        String out= "";
        HashMap<Character,Character> chars = new HashMap<>();
        int min_char = 97;
        for(int i = 0; i < s.length(); i++)
        {
            char current = s.charAt(i);
            char current_encrypted;
            if(!chars.containsKey(current))
            {
                current_encrypted = (char) min_char;
                chars.putIfAbsent(current, current_encrypted);
                min_char++;
            }
            else
            {
                current_encrypted = chars.get(current);
            }
            out += Character.toString(current_encrypted);
        }
        return out;
    }
}