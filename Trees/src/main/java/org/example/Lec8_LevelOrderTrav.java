package org.example;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int item){
        data=item;
        left=right=null;
    }
}
public class Lec8_LevelOrderTrav {
    Node root;

    void LevelOrderTraversal(){
        if(root==null) return ;

        Queue<Node> queue=new LinkedList<>();         //remember queue linkedlist k under aata hai
        queue.add(root);

        while(!queue.isEmpty()){
            Node current=queue.poll();
            System.out.print(current.data+" ");

            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        Lec8_LevelOrderTrav tree=new Lec8_LevelOrderTrav();

        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println("Level Order Traversal:");
        tree.LevelOrderTraversal();

    }
}


//       /**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> ans=new ArrayList<>();
//
//        if(root==null){
//            return ans;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();                              //We use a queue because BFS requires FIFO (First In, First Out) order.
//        queue.add(root);
//
//        while(!queue.isEmpty()){
//            int levelLen=queue.size();
//            List<Integer> currentLevel=new ArrayList<>();
//
//            for(int i=0 ; i<levelLen ;i++){
//                TreeNode current=queue.poll();
//                currentLevel.add(current.val);
//
//                if(current.left!=null) queue.add(current.left);
//                if(current.right!=null) queue.add(current.right);
//            }
//            ans.add(currentLevel);
//        }
//        return ans;
//    }
//}
