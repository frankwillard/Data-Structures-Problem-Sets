public class ListLastFirst {
    public ListNode move(ListNode list) {
        // replace statement below with code you write
        if(list == null || list.next == null)
        {
            return list;
        }
        ListNode sec_last = list;
        ListNode first = list;
        while(sec_last.next.next != null)
        {
            sec_last = sec_last.next;
        }
        int info = sec_last.next.info;
        sec_last.next = null;
        ListNode new_first = new ListNode(info, first);
        return new_first;
    }
}