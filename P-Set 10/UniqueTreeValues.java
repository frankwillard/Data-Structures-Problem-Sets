import java.util.*;

public class UniqueTreeValues {
    public int[] unique(TreeNode root) {
        // write code here
        TreeSet<Integer> set = new TreeSet<>();
        inOrder(root, set);
        int[] arr = settoArr(set);
        return arr;
    }

    public void inOrder(TreeNode root, TreeSet<Integer> set)
    {
         if(root != null)
         {
             inOrder(root.left, set);
             set.add(root.info);
             inOrder(root.right, set);
         }
    }

    public int[] settoArr(TreeSet<Integer> set)
    {
        int[] ret = new int[set.size()];
        int j = 0;
        for(Integer i: set)
        {
            ret[j] = i;
            j++;
        }
        return ret;
    }
}