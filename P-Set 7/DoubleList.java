public class DoubleList {
    public ListNode bigify(ListNode list) {
        // replace statement below with code you write
        if(list == null)
        {
            return null;
        }
        ListNode next = bigify(list.next);
        list.next = new ListNode(list.info, next);
        return list;
    }
}