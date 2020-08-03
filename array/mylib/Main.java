package array.mylib;//package com.array.mylib;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        String[] array = new String[20];
        com.array.mylib.MyArray.printArray(array);
        com.array.mylib.MyArray.add("Hello",array, 0);
        com.array.mylib.MyArray.printArray(array);
        com.array.mylib.MyArray.addToFirst("I am First", array);
        com.array.mylib.MyArray.printArray(array);
        com.array.mylib.MyArray.addToLast("I am Last", array);
        com.array.mylib.MyArray.printArray(array);
        int counter = com.array.mylib.MyArray.count(array);
        System.out.println(counter);
        com.array.mylib.MyArray.remove(2, array);
        com.array.mylib.MyArray.printArray(array);
        System.out.println(array.length);
        com.array.mylib.MyArray.removeFirst(array);
        com.array.mylib.MyArray.printArray(array);
        com.array.mylib.MyArray.removeLast(array);
        com.array.mylib.MyArray.printArray(array);
        com.array.mylib.MyArray.update(0, "I am updated First", array);
        com.array.mylib.MyArray.printArray(array);
        com.array.mylib.MyArray.addToLast("Second", array);
        com.array.mylib.MyArray.printArray(array);
        String element = com.array.mylib.MyArray.find(1, array);
        System.out.println(element);
        int index = com.array.mylib.MyArray.findIndex("Second", array);
        System.out.println(index);
        int index1 = com.array.mylib.MyArray.findIndex("Third", array);
        System.out.println(index1);
        com.array.mylib.MyArray.mySort(array);
        com.array.mylib.MyArray.printArray(array);
        boolean includes = com.array.mylib.MyArray.includes("Second", array);
        System.out.println(includes);
        com.array.mylib.MyArray.addToLast("3rd", array);
        com.array.mylib.MyArray.addToLast("4th", array);
        com.array.mylib.MyArray.addToLast("6th", array);
        com.array.mylib.MyArray.addToLast("7th", array);
        com.array.mylib.MyArray.addToLast("8th", array);
        com.array.mylib.MyArray.addToLast("9th", array);
        com.array.mylib.MyArray.addToLast("10th", array);
        com.array.mylib.MyArray.printArray(array);
        String[] slicedArray=  com.array.mylib.MyArray.slice(6, 9, array);
        System.out.println(Arrays.toString(slicedArray));
        String [] slicedArray1 = com.array.mylib.MyArray.slice(5, array);
        System.out.println(Arrays.toString(slicedArray1));
        String [] slicedArray2 = com.array.mylib.MyArray.slice(array);
        System.out.println(Arrays.toString(slicedArray2));
        String arrayString = com.array.mylib.MyArray.join(' ', array);
        System.out.println(arrayString);
        com.array.mylib.MyArray.fill("Filled With start and End", 9, 16, array );
        com.array.mylib.MyArray.printArray(array);
        com.array.mylib.MyArray.fill("Filled Without end", 16, array);
        com.array.mylib.MyArray.printArray(array);

        String[] filledArray = new String[10];
        com.array.mylib.MyArray.fill("Mission accomplished :)", filledArray);
        com.array.mylib.MyArray.printArray(filledArray);
    }
}
