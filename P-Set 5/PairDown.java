import java.util.*;

public class PairDown {
    public int[] fold(int[] list) {
        int length = list.length;
        ArrayList<Integer> half = new ArrayList<>();
        for(int i = 0; i < length-1; i+=2)
        {
            int pair = list[i] + list[i+1];
            half.add(pair);
        }
        if(length % 2 != 0)
        {
            half.add(list[length-1]);
        }
        int[] out = new int[half.size()];
        for(int i = 0; i < half.size(); i++)
        {
            out[i] = half.get(i);
        }
        return out;
    }
}