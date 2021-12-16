import java.util.*;

public class Aaagmnrs {

    public String[] anagrams(String[] phrases) {
        ArrayList<String> anag = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        for(int i = 0; i < phrases.length; i++) {
            String phrase = phrases[i].replace(" ", "").toLowerCase();
            char[] phrase_arr = phrase.toCharArray();
            Arrays.sort(phrase_arr);
            String sorted = new String(phrase_arr);
            if (!anag.contains(sorted)) {
                anag.add(sorted);
                output.add(phrases[i]);
            }
        }
        String[] res = output.toArray(new String[0]);
        return res;
    }
}