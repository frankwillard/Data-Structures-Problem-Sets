import java.util.*;

public class SetAside {
    public String common(String[] list) {
        Set<String> first = new TreeSet<>(Arrays.asList(list[0].split(" ")));
        for(int i = 1; i < list.length; i++)
        {
            Set<String> current = new TreeSet<>(Arrays.asList(list[i].split(" ")));
            first.retainAll(current);
        }
        //String[] sorted_arr = first.toArray(new String[0]);
        String out = String.join(" ", first);
        return out;
    }
}