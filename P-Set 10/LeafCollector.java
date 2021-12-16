import java.util.*;

public class LeafCollector {

    ArrayList<String> list;

    public String[] getLeaves(TreeNode tree) {
        // replace with working code
        list = new ArrayList<>();
        ArrayList<String> out = new ArrayList<>();
        int start = 0;
        //Change to while tree has chldren
        while(tree.left != null || tree.right != null)
        {
            collectAndRemove(tree, list);
            out.add(String.join(" ", list.subList(start, list.size())));
            start = list.size();
        }
        out.add("" + tree.info);
        String[] ret = out.toArray(new String[0]);
        return ret;
    }


    private void collectAndRemove(TreeNode root, List<String> list) {
        if(root == null)
        {
            return;
        }
        if(root.left != null && isLeaf(root.left))
        {
            list.add(""+root.left.info);
            root.left = null;
        }
        collectAndRemove(root.left, list);
        if(root.right != null && isLeaf(root.right))
        {
            list.add(""+root.right.info);
            root.right = null;
        }
        collectAndRemove(root.right, list);
    }


    private boolean isLeaf(TreeNode t)
    {
        return t.left == null && t.right == null;
    }

}