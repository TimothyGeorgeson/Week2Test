package com.example.consultants.week2test;

public class MyArrayList {

    private Object[] objectArray;
    private int currentIndex;
    private int maxSize;

    public MyArrayList()
    {
        currentIndex = 0;
        maxSize = 2;
        objectArray = new Object[maxSize];
    }

    public void add(Object object)
    {
        if (currentIndex == maxSize) //when reaching max size
        {
            //store array values in a temp array
            Object[] tempArray = objectArray;
            //double size and make a new object array
            maxSize = maxSize * 2;
            objectArray = new Object[maxSize];

            //add back in the elements that were in initial array
            for (int i = 0; i < tempArray.length; i++) {
                objectArray[i] = tempArray[i];
            }
        }

        //add current object and increment current index
        objectArray[currentIndex] = object;
        currentIndex += 1;
    }

    //gets current max size of array
    public int getCurrentSize()
    {
        return maxSize;
    }

    //prints array
    public void printArrayList()
    {
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(objectArray[i].toString() + " ");
        }
    }

}
