package com.hands_on;

import java.util.ArrayList;
import java.util.Iterator;

public class ListPractice {
    public static void main(String[] args) {
        System.out.println("Created a ArrayList named stringList.");
        ArrayList<String> stringList = new ArrayList<String>();

        // 1. Adding Elements

        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("grape");

        // 2. Removing Elements
        //      i. removing element at the index 2 from the stringList
        System.out.println("Removed the value at index 2");
        stringList.remove(2);
        //      ii. removing the first occurence of string "banana" from the stringList
        System.out.println("Removed the value `banana`");
        stringList.remove("banana");

        // 3. Accessing Elements
        //      i. Print the element at index 1.
        System.out.println("The element at the index 1 = "+stringList.get(1));
        //      ii. Replace the element at index 0 with "pear".
        System.out.println("The value at the index 0 is replaced as `pear`");
        stringList.set(0, "pear");

        // 4. Search and Checking
        //      i. check if the list contains "orange" and print result
        System.out.println("Is the string contains `orange`: "+stringList.contains("orange"));
        //      ii. Find and print the index of last occurrence of grape
        System.out.println("The index of `grape`: "+stringList.lastIndexOf("grape"));
        //      iii. Check if the list is empty and print the result
        System.out.println("Is the ArrayList is empty: "+stringList.isEmpty());

        // 5. List Operations
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("kiwi");
        newList.add("pineapple");
        newList.add("melon");
        stringList.addAll(2, newList);

        // 6. Size and Capacity
        //      i. Print the size of the stringList
        System.out.println("Size of stringList: "+stringList.size());
        //      ii. Clear the stringList and print its size again
        System.out.println("Cleared the stringList");
        stringList.clear();
        System.out.println("Size of stringList: "+stringList.size());

        // 7. Iteration and Conversion
        //      i. Use an iterator to iterate over the elements in the newList and print each element
        System.out.print("Iteration over newList: ");
        Iterator<String> iterator = newList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.print(name +", ");
        }
        //      ii. Create a sublist of newList from index 1 to 3 and print it
        System.out.print("\nsub list of the newList from 1 to 3 :");
        System.out.println(newList.subList(1, 3));
        //      iii. Convert the newList to an array and print the array
        System.out.print("Converted into String Array: ");
        String[] strArray = newList.toArray(new String[0]);
        for (String str : strArray) {
            System.out.print(str + ", ");
        }

        // 8. Sorting and Ordering
        //      i. Sort the elements in newList in natural order and Print the sorted list
        System.out.print("\nnewList sorted in natural Order: ");
        stringList.sort(null);
        System.out.println(newList);
        //      ii. Check if stringList equals newList and print the result
        System.out.println("Is stringList and newList is equal: "+stringList.equals(newList));
        //      iii. Print the hash code of newList
        System.out.println("HashCode of newList: "+newList.hashCode());
        //      iv. Implement a custom comparator to sort newList in reverse alphabetical order and Print
        newList.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted the newList in reverse alphabetic order: "+newList);
    }
}