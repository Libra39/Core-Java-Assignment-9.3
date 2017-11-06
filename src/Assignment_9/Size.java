/**
 * 
 */
package Assignment_9;													// Package Declared
import java.util.Comparator;											// 
public class Size implements Comparator<HDTV> {							// Class declared  The compare( ) method, shown here, compares two elements for order
	       @Override													// annotation
	       public int compare(HDTV newProduct1, HDTV newProduct2) {		// compare() method is an interface which is used for sorting objects
	              int newProduct1Size = newProduct1.getSizeDiff();		// new object declared
	              int newProduct2Size = newProduct2.getSizeDiff();		// new object declared
	              int productSizeDiff= newProduct1Size-newProduct2Size; // tell the difference in the size of new product
	              if (productSizeDiff !=0)									
	            	  return productSizeDiff;
				return 0;												// if result of comparison is true then return 0
	       }															// method closed
	}																	// class Size closed
