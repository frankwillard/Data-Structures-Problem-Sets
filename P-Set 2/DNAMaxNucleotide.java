import java.util.*;

public class DNAMaxNucleotide {

    public String max(String[] strands, String nuc) {
        // fill in code here
        int max_value = 1;
        String max_string = "";
        for(String s: strands)
        {
            int myCount = count(s, nuc);
            if((myCount > max_value) || (myCount == max_value && s.length() > max_string.length()))
            {
                max_string = s;
                max_value = myCount;
            }
        }
        return max_string;
    }

    /*
    public int count(String s, String nuc)
    {
        int t = s.length() - s.replace(nuc,"").length();
        return t;
    }*/

    public int count(String s, String nuc)
    {
        String[] all = s.split("");
        return Collections.frequency(Arrays.asList(all), nuc);
    }


}