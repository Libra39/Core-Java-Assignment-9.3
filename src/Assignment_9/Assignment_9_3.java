/**
 * 
 */
package Assignment_9;																// Package Declared
import java.util.ArrayList;															// The java.util.ArrayList class provides re-sizable array and implements the List interface.
import java.util.Collections;														// Collections class consists entirely of static methods which are used to operate on collections like List, Set. Common operations like sorting a List or finding an element from a List can easily be done using the Collections class.
/**
 * Write a program to create a class HDTV with the properties:
 * • Brandname
 * • Size
 * Create Another class having an ArrayList and add 3 objects of HDTV into it.
 * Display HDTV objects in sorted order of size (Use Comparator)
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com
 */	
public class Assignment_9_3 {														// Class Declared
public static void main(String[] args) {											// Main method started	
		System.out.println("\nList of HDTV's according to the Size : ");			// Print statement
        HDTV newProduct1 = new HDTV(55, "LG");										// new object newProduct1 created and integer and string value is assigned 
        HDTV newProduct2 = new HDTV(32, "Intex");									// new object newProduct2 created and integer and string value is assigned
        HDTV newProduct3 = new HDTV(43, "MicroMax");								// new object newProduct3 created and integer and string value is assigned
        ArrayList<HDTV> newArrayList = new ArrayList<HDTV>();						// Initialization of an ArrayList  
        newArrayList.add(newProduct1);												// add() method is used for adding an element to the ArrayList. 
        newArrayList.add(newProduct2);												// add() method is used for adding an element to the ArrayList. 
        newArrayList.add(newProduct3);												// add() method is used for adding an element to the ArrayList. 
        Collections.sort(newArrayList, new Size());									// Sort Sets in ArrayList by Size
        for (HDTV newProductList : newArrayList) {									
               System.out.println(newProductList.getBrandname()); }					// print statement
	}																				// Main method closed
}																					//  class Assignment_9_3 closed
