package org.example;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    public Node(){left=null;
        right=null;}
    public Node(int val){this.val=val;
        left=null;
        right=null;}
}
public class TreesQuestion {
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        c.left=a;
        c.right=b;
        inorder(c);
    }
}