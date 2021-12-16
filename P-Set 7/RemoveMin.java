public class RemoveMin {
    public ListNode remove (ListNode list) {
        // replace statement below with code you write
        if(list.next == null)
        {
            return null;
        }
        int min = findMin(list);
        ListNode ret = list;
        if(list.info == min)
        {
            ret = ret.next;
        }
        else
        {
            ListNode next_min = list;
            while(next_min.next.info != min)
            {
                next_min = next_min.next;
            }
            next_min.next = next_min.next.next;
        }
        return ret;
    }

    private int findMin(ListNode list)
    {
        int min = list.info;
        ListNode temp = list;
        while(temp != null)
        {
            if(temp.info < min)
            {
                min = temp.info;
            }
            temp = temp.next;
        }
        return min;
    }
}