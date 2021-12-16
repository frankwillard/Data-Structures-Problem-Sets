import java.util.*;

public class BigWord {

    public String most(String[] sentences) {
        // you write code here
        HashMap<String, Integer> word_freqs = new HashMap<>();
        String max_string = "";
        int max = 0;
        for(String s: sentences)
        {
            String s_lower = s.toLowerCase();
            String[] words = s_lower.split(" ");
            for(String word: words)
            {
                if(!word_freqs.containsKey(word))
                {
                    word_freqs.put(word, 0);
                }
                int current = word_freqs.get(word) + 1;
                if(current > max)
                {
                    max_string = word;
                    max = current;
                }
                word_freqs.put(word, current);
            }
        }
        return max_string;
    }
}