import java.util.*;

public class Closet {
    public String anywhere(String[] list) {
        // replace this with your code
        TreeSet<String> set = new TreeSet<>();
        for(int i = 0; i < list.length; i++)
        {
            String[] words = list[i].split(" ");
            for(int j = 0; j < words.length;j++)
            {
                set.add(words[j]);
            }
        }
        String res = String.join(" ", set);
        return res;
    }
}