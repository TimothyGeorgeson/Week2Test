package com.example.consultants.week2test;

import java.util.Stack;

public class MyQueue {

    private Stack<String> origStack = new Stack<>();
    private Stack<String> reverseStack = new Stack<>();

    public void enqueue(String input)
    {
        origStack.push(input);
    }

    public void dequeue()
    {
        if (origStack.size() > 0)
        {
            //reverseStack adds in every element in reverse order of the origStack
            int stackSize = origStack.size();
            for (int i = 0; i < stackSize; i++) {
                reverseStack.push(origStack.pop());
            }

            //then we pop an element to dequeue the first one that was pushed into the origStack
            reverseStack.pop();

            //reconstructs the origStack (now with one less element)
            stackSize = reverseStack.size();
            for (int i = 0; i < stackSize; i++) {
                origStack.push(reverseStack.pop());
            }
        }
    }

    public void printQueue()
    {
        System.out.println(origStack);
    }

}
