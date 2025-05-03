package org.example;

class Node2 {
    int data;
    Node2 left;
    Node2 right;

    public Node2(int key){
        data=key;
        left=null;
        right=null;
    }
}

public class Lec5_Traversal {
    Node2 root;

    void inOrder(Node2 node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    void preorder(Node2 node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    void postOrder(Node2 node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data +" ");
    }
    //----------------------//
    public static void main(String[] args) {
        Lec5_Traversal tree= new Lec5_Traversal();
        tree.root=new Node2(1);
        tree.root.left=new Node2(2);
        tree.root.right=new Node2(3);
        tree.root.left.left=new Node2(4);
        tree.root.left.right=new Node2(5);

        System.out.println("PreOrder:");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("InOrder:");
        tree.inOrder(tree.root);
        System.out.println();
        
        System.out.println("PostOrder:");
        tree.postOrder(tree.root);
    }
}