import java.util.*;

public class StringCuts {

    public String[] filter(String[] list, int minLength) {
        // replace this with your code
        ArrayList<String> words = new ArrayList<>();
        for(String s: list)
        {
            if(s.length() >= minLength && !words.contains(s))
            {
                words.add(s);
            }
        }
        String[] result = new String[words.size()];
        words.toArray(result);
        return result;
    }
}