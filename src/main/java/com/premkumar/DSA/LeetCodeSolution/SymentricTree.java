package com.premkumar.DSA.LeetCodeSolution;
  class TreeNode {
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

public class SymentricTree {
    public static void main(String[] args) {
        String s=String.valueOf(122);
        s.substring(1,+1);


         TreeNode node=new TreeNode(1);
         node.left=new TreeNode(2);
         node.right=new TreeNode(2);
         node.left.left=new TreeNode(3);
         node.right.right=new TreeNode(3);
         node.left.right=new TreeNode(4);
         node.right.left=new TreeNode(4);
        System.out.println(isSymmetric(node));
    }
   static public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return traversalTwoSides(root.left,root.right);
    }
    static public boolean traversalTwoSides(TreeNode l,TreeNode r)
    {
        if(l==null && r==null) return true;
        if(l==null || r==null) return false;
        if(l.val!=r.val) return false;
        return traversalTwoSides(l.left,r.right) || traversalTwoSides(l.right,r.left);
    }
}
