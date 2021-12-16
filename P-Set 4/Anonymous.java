import java.util.*;

public class Anonymous {

    public int howMany(String[] headlines, String[] messages) {
        int count = 0;
        int[] headline_counts = getCounts(headlines);
        for(String m : messages)
        {
            int[] message_counts = getCounts(m.split(" "));
            for(int i = 97; i < 123; i++)
            {
                if(message_counts[i] > headline_counts[i])
                {
                    break;
                }
                if(i == 122)
                {
                    count++;
                }
            }
        }
        return count;
    }

    private int[] getCounts(String[] strings)
    {
        int[] counts = new int[123];
        for(String s: strings)
        {
            for (char ch : s.toLowerCase().toCharArray())
            {
                counts[ch]+=1;
            }
        }
        return counts;
    }

}