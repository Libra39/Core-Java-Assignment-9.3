/**
 * 
 */
package Assignment_9;									// Package declared
public class HDTV {										// class declared
	private int size;									// private integer variable declared 
    private String Brandname;

    public HDTV(int size, String Brandname) {			// Parameterized constructor created
           this.size = size;							// This keyword is used to distinguish between class variables and instance variables
           this.Brandname = Brandname;}					// This keyword is used to distinguish between class variables and instance variables	

    public int getSizeDiff() {							// getter created
           return size;}

    public void setSizeDiff(int size) {					// setter created	
           this.size = size;}

    public String getBrandname() {						// getter created
           return Brandname;}

    public void setBrandname(String Brandname) {		// setter created
           this.Brandname = Brandname;}
}														// class HDTV closed
