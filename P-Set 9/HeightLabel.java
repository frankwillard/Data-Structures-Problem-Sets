public class HeightLabel {
    public TreeNode rewire(TreeNode t) {
        // replace with working code
        int height = height(t);
        TreeNode tree = change(t, height);
        return tree;
    }

    public TreeNode change(TreeNode t, int height)
    {
        if(t == null)
        {
            return null;
        }
        t.info = height;
        change(t.left, height(t.left));
        change(t.right, height(t.right));
        return t;
    }

    public int height(TreeNode t)
    {
        if(t == null)
        {
            return 0;
        }
        return 1 + Math.max(height(t.left), height(t.right));
    }
}