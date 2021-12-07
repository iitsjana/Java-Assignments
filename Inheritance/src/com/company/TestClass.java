package com.company;

/**
 *  <h1> Device Hierarchy</h1>
 *  <p>In this assignment we created an inheritance hierarchy for the following classes: Device, Android, iOS.
 *  In this TestClass, we create Device, Android, and iOS objects and then call their toString methods to print information accordingly.
 * </p>
 *
 * @author Jana Batiya
 * @version 1.0
 * @since 2021-11-12
 */

public class TestClass {
/**
 * This is the main method which makes use of TestClass.
 * @param args Unused.
 **/
    public static void main(String[] args) {

    Device device1 = new Device("Samsung",2001); // creates Device object, assigns it to device1, and initializes values.
    Device device2 = new Device("HTC",2013); // creates Device object, assigns it to device2, and initializes values.
    Device device3 = new Device("Apple",2018); // creates Device object, assigns it to device3, and initializes values.
	Android android = new Android(false, 5.1f); // creates Android object, assigns it to android, and initializes values.
	iOS ios = new iOS("iPhone XR",123456); // creates iOS object, assigns it to ios, and initializes values.

	System.out.printf("%s\n%s%s\n%s%s\n", device1, device2, android, device3, ios); // calls for each object's toString method.
    }
}
