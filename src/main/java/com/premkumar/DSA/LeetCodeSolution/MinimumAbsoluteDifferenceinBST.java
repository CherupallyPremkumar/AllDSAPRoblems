package com.premkumar.DSA.LeetCodeSolution;

public class MinimumAbsoluteDifferenceinBST {
    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(4);
        treeNode.left=new TreeNode(2);
        treeNode.left.left=new TreeNode(1);
        treeNode.left.right=new TreeNode(3);
        treeNode.right=new TreeNode(6);
        System.out.println( getMinimumDifferenc(treeNode));
    }
       static public int getMinimumDifference(TreeNode root) {
            return getMinimumDifferenc(root);
        }
      static   public int getMinimumDifferenc(TreeNode root) {
            {
                if(root==null ) return 0;
                getMinimumDifferenc(root.left);
               int val=root.val;
                getMinimumDifferenc(root.right);

               return min;
            }
        }
}
