package com.company;
/**
 * <p>This class is used to calculate the area,
 * check if the object is a square or rectangle,
 * and to display information using toString method</p>
 **/
public class Rectangle {

//  These are our private instance variables
    private int length;
    private int width;

//  Default constructor that sets both length and width to zero

    Rectangle() {
        length = 0;
        width = 0;
    }

//  Constructor that initializes both variables
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

/**
 * This method calculates the area
 * @return  width * length
 * */
    public int getArea() {
        return width * length;
    }

 /**
  * this method checks if length equals width, if it is
  * @return true*/
    public boolean isSquare() {
        return length == width;
    }

/**
 * this method displays the information
 * if the object is a square it displays that it is a square
 * otherwise, it displays that it is a rectangle
 * @return a string to display information accordingly*/
    public String toString() {
        if (isSquare()) {
            return "A new object defined.\n" +
                    "Length: " + length + "\n" +
                    "Width: " + width + "\n" +
                    "Area: " + getArea() + "\n" +
                    "This object is a square.\n";
        } else {
            return "A new object defined.\n" +
                    "Length: " + length + "\n" +
                    "Width: " + width + "\n" +
                    "Area: " + getArea() + "\n" +
                    "This object is a rectangle.\n";
        }
    }
}
