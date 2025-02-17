public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        int result= dfs(root);
        if(result == -1){
            return false;
        }else{
            return true;
        }

    }
    public int dfs(TreeNode root){
        if(root==null) return 0;


        int left= dfs(root.left);
        int right=dfs(root.right);
        if(Math.abs(left-right)>1 || right==-1 || left == -1){
            return -1;
        } else {
            return Math.max(left,right)+1;
        }
    }






      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
             this.right = right;
          }
      }

}
