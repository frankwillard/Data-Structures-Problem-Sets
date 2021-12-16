import java.util.*;

public class CounterAttack {
    /*public int[] analyze(String str, String[] words) {
        // change this code
        String[] chars = str.split(" ");
        ArrayList<String> word_list = new ArrayList<>(Arrays.asList(chars));
        int[] freqs = new int[words.length];
        for(int i = 0; i < words.length; i++)
        {
            freqs[i] = Collections.frequency(word_list, words[i]);
        }
        return freqs;
    }*/

    public int[] analyze(String str, String[] words)
    {
        int[] freqs = new int[words.length];
        HashMap<String, Integer> map = new HashMap<>();
        for(String s: str.split(" "))
        {
            map.putIfAbsent(s,0);
            map.put(s, map.get(s) + 1);
        }
        for(int k = 0; k < words.length; k++)
        {
            freqs[k] = map.getOrDefault(words[k], 0);
        }

        return freqs;
    }


}