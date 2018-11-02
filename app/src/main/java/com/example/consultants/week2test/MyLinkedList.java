package com.example.consultants.week2test;

public class MyLinkedList {
    private Node head;
    private int elementCount;

    //simple node with next pointer and char data
    class Node
    {
        char data;
        Node next;
        Node(char c)
        {
            data = c;
            next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        elementCount = 0;
    }

    public MyLinkedList convertString(String input)
    {
        //loops through string backwards, since add function adds to start of list
        for (int i = input.length() - 1; i >= 0 ; i--) {
            add(input.charAt(i));
        }

        return null;
    }

    //adds to front of linkedlist
    public void add(char c)
    {
        Node newNode = new Node(c);
        newNode.next = head;

        head = newNode;
        elementCount += 1;
    }

    //removes from front of linkedlist
    public void removeFirst()
    {
        if (elementCount > 0)
        {
            head = head.next;
            elementCount -= 1;
        }
    }

    // prints linked list
    void printList()
    {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }
}
