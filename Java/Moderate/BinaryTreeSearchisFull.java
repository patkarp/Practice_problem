//Java Program to check if the ree is bindary tree or not
import java.io.*;
class Node{
    int data;
    Node left, right;
    Node(int item)
    {
        data=item;
        left=right=null;

    }
}
class BinaryTreeSearchisFull{
    Node root;
    boolean isFullTree(Node node){
        //empty tree
        if (node==null){
            return true;
        }
        if(node.left==null &&node.right==null){
            return true;
        }
        //if both left and right are not nul
        if(node.left!=null && node.right!=null){
            return (isFullTree(node.left) && isFullTree(node.right));
        }
        return false;
    }
    public static void main(String[] args){
        BinaryTreeSearchisFull tree = new BinaryTreeSearchisFull();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);

        if(tree.isFullTree(tree.root))
            System.out.print("Full");
        else 
            System.out.print("Not Full");
            
    }
}