package com.example.consultants.week2test;

public class MyBinarySearchTree {
    private Node root;
    private int elementCount;

    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int i)
        {
            data = i;
        }
    }

    public MyBinarySearchTree(int num)
    {
        root = new Node(num);
    }

    public void add(int num)
    {
        
    }
}
