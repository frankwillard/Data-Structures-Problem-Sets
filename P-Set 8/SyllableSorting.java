import java.util.*;

public class SyllableSorting {

    public static void main(String[] args)
    {
        String[] words = {"xiaoxiao", "yamagawa", "gawayama"};
        System.out.println(sortWords(words));
    }



    public static String[] sortWords(String[] words) {
        // you write code here
        HashMap<String, ArrayList<String>> map = findSyllables(words);
        ArrayList<ArrayList<String>> lists = new ArrayList<>();
        for(String s: map.keySet())
        {
            ArrayList<String> sorted = new ArrayList<>(map.get(s));
            Collections.sort(sorted);
            lists.add(sorted);
        }
        Comparator<String> comp = Comparator.comparing((a)->Collections.frequency(dataList, a));
        Collections.sort(list2, comp.reversed());
        return new String[0];
    }

    @Override
    public int compare(ArrayList<String>)
    {

    }

    public static HashMap<String, ArrayList<String>> findSyllables (String[] words)
    {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        String[] vowels = {"a", "e", "i", "o", "u"};
        ArrayList<String> vowel_list = new ArrayList<>(Arrays.asList(vowels));
        for(String s: words)
        {
            map.put(s, new ArrayList<>());
            int start = 0;
            boolean prevVowel = false;
            for(int j = 0; j < s.length(); j++)
            {
                if(vowel_list.contains(s.substring(j, j + 1)))
                {
                    prevVowel = true;
                }
                else if (prevVowel)
                {
                    String syllable = s.substring(start, j);
                    start = j;
                    map.get(s).add(syllable);
                    prevVowel = false;
                }
            }
            map.get(s).add(s.substring(start, s.length()));
        }
        return map;
    }
}