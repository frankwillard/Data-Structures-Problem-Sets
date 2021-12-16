public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        // replace statement below with code you write
        ListNode first = list;
        while(list != null)
        {
            for(int k = 0; k < amount -1; k++)
            {
                list.next = new ListNode(list.info, list.next);
                list = list.next;
            }
            list = list.next;
        }
        return first;
    }
}