package com.hands_on;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {
    public static void main(String[] args) {
        // 1. Adding Elements:
        System.out.println("Created an LinkedList named integerList");
        LinkedList<Integer> integerList = new LinkedList<Integer>();
        //      1.Add the following integers to the list: 10, 20, 30, 40.
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        // 2. Removing Elements:
        //      1.Remove the integer at the second position from the integerList.
        System.out.println("Removed the index at the 2.");
        integerList.remove(2);
        //      2.Eliminate the first occurrence of the integer 20 from the integerList.
        System.out.println("Removed the value first occurrence of 20.");
        integerList.removeFirstOccurrence(20);
        // 3. Accessing Elements:
        //      1.Print out the integer stored at the second position in the integerList.
        try{
            System.out.println("The integer stored in second position is "+ integerList.get(2));
        } catch (Exception e){
            System.out.println(e);
        }
        //      2.Replace the integer at the first position in the integerList with the value 50.
        System.out.println("The integer in the first position get replaced with 50");
        integerList.set(0, 50);
        // 4. Searching and Checking:
        //      1.Determine if the integer 30 exists in the integerList and print the result.
        System.out.println("Is the integer 30 exists or not: "+ integerList.contains(30));
        //      2.Identify and print the index of the last occurrence of the integer 40 in the integerList.
        System.out.println("The Last occurrence of the integer '40' is "+ integerList.lastIndexOf(40));
        //      3.Check whether the integerList is empty and print the result.
        System.out.println("Is Empty: " + integerList.isEmpty());
        // 5. List Iteration and Conversion:
        //      1.Iterate through the elements of the integerList using a ListIterator and print each element.
        ListIterator<Integer> iterator = integerList.listIterator();
        System.out.print("Iteration using ListIterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        //      2.Create a sublist of the integerList containing elements from the second to the fourth position and print it.
        try{
            System.out.println(integerList.subList(2,4));
        } catch (Exception e){
            System.out.println("\n"+ e);
        }
        //      3.Convert the integerList into an array and print the resulting array.
        int[] intArray = integerList.stream().mapToInt(i -> i).toArray();
        System.out.print("integerList converted into array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        // 6. Size and Capacity:
        //      1.Determine and print the size of the integerList.
        System.out.println(integerList.size());
        //      2.Clear all elements from the integerList and print its size again.
        integerList.clear();
        System.out.println(integerList.size());
    }
}
