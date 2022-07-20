package com.company;

import java.util.Scanner;

public class Main {
    public class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.left = null;
            this.right=null;
            this.data=data;
        }
    }
    TreeNode root;
    Main()
    {
        root=null;
    }
    public  TreeNode insert(TreeNode root,int datatobeinsert)
    {
        if(root==null)
        {
            root = new TreeNode(datatobeinsert);
        }
        if(root.data>datatobeinsert)
        {
            root.left = insert(root.left,datatobeinsert);
        }
        else if (root.data<datatobeinsert)
        {
            root.right = insert(root.right,datatobeinsert);
        }
        return root;
    }
    public TreeNode serach(TreeNode root,int datatobeinsert) {
        if (root == null) {
            return root;
        }
        if (root.data > datatobeinsert) {
            return serach(root.left, datatobeinsert);
        } else {
            return serach(root.right, datatobeinsert);
        }

    }
    public void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public void insertIntoTree(int datatobeinsert)
    {
        root = insert(root,datatobeinsert);
    }
    public TreeNode searchTree(int datatobeinsert)
    {
        return serach(root,datatobeinsert);
    }
    public void inorderTravcersal()
    {
        inOrder(root);
    }

    public static void main(String[] args) {
        Main bst = new Main();
        int n,num;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("enter the "+n+" number ");
        for (int i=0;i<n;i++)
        {
            num = sc.nextInt();
            bst.insertIntoTree(num);
        }
        System.out.println("tree inseration done");
        System.out.println("enter number to be searched");
        n = sc.nextInt();
        if(bst.searchTree(n)!=null)
        {
            System.out.println("number is found");
        }
        else
        {
            System.out.println("number is not found");
        }
        System.out.println("Inorder traversal of binary search tree");
        bst.inorderTravcersal();


    }
}
