import java.util.*;

public class SortedLeaves {

    ArrayList<String> list;

    public String[] values(TreeNode tree) {
        // replace with working code
        list = new ArrayList<String>();
        doWork(tree);
        Collections.sort(list);
        return list.toArray(new String[0]);
    }

    public void doWork(TreeNode t) {
        if(t == null){
            return;
        }
        if(t.left == null && t.right == null)
        {
            list.add("" + ((char) t.info));
        }
        else
        {
            doWork(t.left);
            doWork(t.right);
        }
    }



}