import java.util.*;

public class SortedListRemoval {
    public ListNode uniqify(ListNode list) {
        // write code here
        if (list == null) {
            return null;
        }
        ListNode temp = list;
        while (temp.next != null) {
            if (temp.info == temp.next.info) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return list;
    }
}