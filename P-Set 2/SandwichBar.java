import java.util.Arrays;
import java.util.*;

public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        // fill in code here
        int pref = -1;
        for(int i = 0; i < orders.length; i++)
        {
            List<String> order_elements = new ArrayList(Arrays.asList(orders[i].split(" ")));
            for(int j = 0; j < order_elements.size(); j++)
            {
                String elem = order_elements.get(j);
                if(contains(available, elem))
                {
                    order_elements.remove(j);
                    j--;
                }
            }
            if(order_elements.isEmpty())
            {
                return i;
            }
        }
        return pref;
    }

    private boolean contains(String[] arr, String elem)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(elem))
            {
                return true;
            }
        }
        return false;
    }

}