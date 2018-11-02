package com.example.consultants.week2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    1. Convert a given string to a linkedList of characters in the String. Do not use LinkedList class in Java
//            but create it from scratch
//2. Implement a Queue using Stack. Queue should have enqueue and dequeue methods
//3. Create a custom arraylist using generics. The size of the array would be doubled when array limit is reached.
//4. Create and Binary Search tree with Add and print(preorder) method.

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        //1. converts string to char linked list, removes first, then prints output
        myLinkedList.convertString("Hello");
        myLinkedList.removeFirst();
        myLinkedList.printList();

        //2. Queues values, shows queue, removes first in queue, and shows result
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();

        //3. After adding 1 element, array size is 2(which is the starting/default value)
        //after adding 2 more elements, the array size expands to 4, and holds all 3 elements
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("1");
        System.out.println(myArrayList.getCurrentSize());
        myArrayList.add("2");
        myArrayList.add("3");
        System.out.println(myArrayList.getCurrentSize());
        myArrayList.printArrayList();

        //4.

    }
}
