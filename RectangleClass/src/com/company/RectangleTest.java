/**
 * <h>Assignment 8- Rectangle class</h>
 * <p>In this assignment we are asked to create three objects
 * and to check if the object is a rectangle or a square
 * then finally, to display the information using toString</p>
 * @author: Jana Batiya
 * @version: 1.0
 * @since: 31/12/2020*/

package com.company;

/**
 * This method is used to display the functionality of the Rectangle class
 **/
public class RectangleTest {

/**This is the main method which makes use of the Rectangle class
 * @param args unused
 **/
    public static void main(String[] args) {

//  Creating three Rectangle objects with different arguments passed
	Rectangle r1 = new Rectangle(7,7);
	Rectangle r2 = new Rectangle(20,34);
	Rectangle r3 = new Rectangle(95,100);


//  Returns strings coming from r1, r2, and r3
	    System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
