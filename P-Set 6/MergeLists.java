public class MergeLists {

    public ListNode weave(ListNode a, ListNode b) {
        ListNode first = new ListNode(a.info, new ListNode(b.info, null));
        ListNode last = first;
        //last.next = new ListNode(b.info, null);
        last = last.next;
        a = a.next;
        b = b.next;
        while (a != null || b != null) {
            if (a != null) {
                last.next = new ListNode(a.info, null);
                last = last.next;
                a = a.next;
            }
            if (b != null) {
                last.next = new ListNode(b.info, null);
                last = last.next;
                b = b.next;
            }
            }
            return first;
        }

    /*
    public ListNode weave(ListNode a, ListNode b) {
        // replace statement below with code you write
        ListNode temp = null;
        ListNode combo = temp;
        ListNode past = null;
        while (a != null || b != null) {
            if (a != null) {
                temp = new ListNode(a.info);
                if(past != null)
                {
                    past.next = temp;
                }
                past = temp;
                a = a.next;
            }
            if (b != null) {
                temp = new ListNode(b.info);
                if(past != null)
                {
                    past.next = temp;
                }
                past = temp;
                b = b.next;
            }
            temp = temp.next;
        }
        return temp;
    }*/
}