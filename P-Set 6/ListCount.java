public class ListCount {
    public int count (ListNode list) {
        // replace statement below with code you write
        int count = 0;
        while(list != null)
        {
            list = list.next;
            count++;
        }
        return count;
    }
}