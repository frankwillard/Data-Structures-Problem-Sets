public class RemoveLast {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        ListNode first = null;
        for(int i = arr.length-1; i >= 0; i--)
        {
            first = new ListNode(arr[i], first);
        }
        ListNode removed = remove(first);
        while(removed != null)
        {
            System.out.println(removed.info);
            removed = removed.next;
        }
    }

    public static ListNode remove(ListNode list) {
        // replace statement below with code you write
        if(list == null || list.next == null) return null;
        ListNode preLast = list;
        while (preLast.next.next != null) preLast = preLast.next;
        preLast.next = null;
        return list;
    }
}