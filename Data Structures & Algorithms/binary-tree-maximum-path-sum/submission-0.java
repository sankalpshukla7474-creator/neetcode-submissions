class Solution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        pass(root);
        return max;
    }

    private int pass(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = pass(root.left);
        int right = pass(root.right);

        int onlyRoot = root.val;
        int rootWithLeft = root.val + left;
        int rootWithRight = root.val + right;
        int completePath = root.val + left + right;

        max = Math.max(
            max,
            Math.max(
                onlyRoot,
                Math.max(
                    completePath,
                    Math.max(rootWithLeft, rootWithRight)
                )
            )
        );

        return Math.max(
            onlyRoot,
            Math.max(rootWithLeft, rootWithRight)
        );
    }
}