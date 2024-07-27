package com.hands_on;

import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        // 1. Adding Elements:
        System.out.println("Created a Vector named flowerVector");
        Vector<String> flowerVector = new Vector<String>();
        //      1.Add the following flowers to the flowerVector: Rose, Lily, Tulip, Daisy.
        flowerVector.add("Rose");
        flowerVector.add("Lily");
        flowerVector.add("Tulip");
        flowerVector.add("Daisy");
        // 2. Removing Elements:
        //      1.Remove the flower at the second position from the flowerVector.
        System.out.println("Removed the index at the 2.");
        flowerVector.remove(2);
        //      2.Remove the first occurrence of the flower "Lily" from the flowerVector.
        System.out.println("Removed the value first occurrence of Lily.");
        flowerVector.remove("Lily");
        // 3. Accessing Elements:
        //      1.Print out the flower stored at the second position in the flowerVector.
        try{
            System.out.println("The flower stored in second position is "+ flowerVector.get(2));
        } catch (Exception e){
            System.out.println(e);
        }
        //      2.Replace the flower at the first position in the flowerVector with "Sunflower".
        System.out.println("The flower in the first position get replaced with Sunflower");
        flowerVector.set(0, "Sunflower");
        // 4. Searching and Checking:
        //      1.Check if the flower "Tulip" exists in the flowerVector and print the result.
        System.out.println("Is the flower Tulip exists or not: "+ flowerVector.contains("Tulip"));
        //      2.Identify and print the index of the last occurrence of the flower "Daisy" in the flowerVector.
        System.out.println("The Last occurrence of the flower 'Daisy' is "+ flowerVector.lastIndexOf("Daisy"));
        //      3.Check whether the flowerVector is empty and print the result.
        System.out.println("Is Empty: " + flowerVector.isEmpty());
        // 5. Iteration and Conversion:
        //      1.Iterate through the elements of the flowerVector using a for-each loop and print each flower.
        System.out.print("Iteration using for-each loop: ");
        for (String flower : flowerVector) {
            System.out.print(flower + " ");
        }
        //      2.Create a sublist of the flowerVector containing elements from the second to the fourth position and print it.
        try{
            System.out.println("\nSublist of the flowerVector"+flowerVector.subList(2,4));
        } catch (Exception e){
            System.out.println("\n"+ e);
        }
        //      3.Convert the flowerVector into an array and print the resulting array.
        String[] flowerArray = flowerVector.toArray(new String[0]);
        System.out.print("flowerVector converted into array: ");
        for (String flower : flowerArray) {
            System.out.print(flower + " ");
        }
        // 6. Size and Capacity:
        //      1.Determine and print the size of the flowerVector.
        System.out.println("The Size of flowerVector: "+flowerVector.size());
        //      2.Print the current capacity of the flowerVector.
        System.out.println("The Capacity of flowerVector: "+flowerVector.capacity());
        // 7. Dynamic Array Operations:
        //      1.Add two more flowers ("Orchid" and "Carnation") to the flowerVector.
        flowerVector.add("Orchid");
        flowerVector.add("Carnation");
        //      2.Check and print the new capacity of the flowerVector after adding the flowers.
        System.out.println("New Capacity: "+ flowerVector.capacity());
        //      3.Remove the flower at index 3 from the flowerVector.
        flowerVector.remove(3);
        //      4.Print the size of the flowerVector after removal.
        System.out.println("Size after removal: "+ flowerVector.size());
    }
}