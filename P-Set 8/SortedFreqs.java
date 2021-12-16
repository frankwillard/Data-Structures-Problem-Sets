import java.util.*;

    public class SortedFreqs {
        public int[] freqs(String[] data) {
            // fill in code here
            ArrayList<String> dataList = new ArrayList<>(Arrays.asList(data));
            TreeSet<String> set = new TreeSet<>(dataList);
            int[] unique_data = new int[set.size()];
            int i = 0;
            for(String s: set)
            {
                unique_data[i] = Collections.frequency(dataList, s);
                i++;
            }
            return unique_data;
        }
    }