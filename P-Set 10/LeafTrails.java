import java.util.*;

public class LeafTrails {

    TreeMap<Integer, String> map;

    public String[] trails(TreeNode tree) {
        // replace with working code
        map = new TreeMap<>();
        findLeaves(tree, "");
        String[] ret = map.values().toArray(new String[0]);
        return ret;
    }

    public void findLeaves(TreeNode t, String path)
    {
        if(t == null)
        {
            return;
        }
        if(t.left == null && t.right == null)
        {
            map.put(t.info, path);
        }
        else
        {
            findLeaves(t.left, path + "0");
            findLeaves(t.right, path + "1");
        }
    }
}