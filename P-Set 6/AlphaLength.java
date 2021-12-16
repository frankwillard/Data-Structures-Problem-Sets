import java.util.*;

public class AlphaLength {

    public ListNode create (String[] words) {
        // replace statement below with code you write
        TreeSet<String> set = new TreeSet<String>();
        for(String s: words)
        {
            set.add(s);
        }
        String[] sorted_words = new String[set.size()];
        set.toArray(sorted_words);

        ListNode first = null;
        for(int i = sorted_words.length - 1; i >= 0; i--)
        {
            first = new ListNode(sorted_words[i].length(), first);
        }
        return first;
    }
}