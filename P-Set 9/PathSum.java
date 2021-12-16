public class PathSum {

    public int hasPath(int target, TreeNode tree){
        // replace with working code
        if(tree == null)
        {
            return 0;
        }
        if(tree.info == target)
        {
            return 1;
        }
        return hasPath(target - tree.info, tree.left) + hasPath(target - tree.info, tree.right);
    }
}