import java.util.*;

public class SortByFreqs {
    public String[] sort(String[] data) {
        // fill in code here
        ArrayList<String> dataList = new ArrayList<>(Arrays.asList(data));
        TreeSet<String> set = new TreeSet<>(dataList);
        List<String> list2 = new ArrayList<>(set);
        Comparator<String> comp = Comparator.comparing((a)->Collections.frequency(dataList, a));
        Collections.sort(list2, comp.reversed());
        return list2.toArray(new String[0]);
    }
}