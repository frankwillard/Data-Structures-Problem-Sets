import java.util.*;

public class AllPaths {

    ArrayList<String> paths;

    public String[] paths(TreeNode t) {
        // replace with working code
        paths = new ArrayList<>();
        findPaths(t, "");
        Collections.sort(paths);
        String[] ret = paths.toArray(new String[0]);
        return ret;
    }

    public void findPaths(TreeNode t, String path)
    {
        if(t == null)
        {
            return;
        }
        if(t.left == null && t.right == null)
        {
            paths.add(path + t.info);
        }
        else
        {
            findPaths(t.left, path + t.info + "->");
            findPaths(t.right, path + t.info + "->");
        }
    }
}