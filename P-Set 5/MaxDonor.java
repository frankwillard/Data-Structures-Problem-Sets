import java.util.*;

public class MaxDonor {

    public static void main(String[] args)
    {
        String[] orgs = {"red cross", "girl scouts", "red cross", "girl scouts", "moma", "unicef"};
        int[] amount = {10,20,50,29,49,51};
        System.out.println(generous(orgs,amount));
    }

    public static String generous(String[] orgs, int[] amount) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < orgs.length; i++)
        {
            map.putIfAbsent(orgs[i], 0);
            map.put(orgs[i], map.get(orgs[i]) + amount[i]);
        }
        String maxstring = "";
        int max = 0;
        for(String key : map.keySet())
        {
            if(map.get(key) > max)
            {
                maxstring = key;
                max = map.get(key);
            }
        }
        return maxstring + ":$" + max;
    }
}