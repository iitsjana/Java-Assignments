/**
 * <h1>The Final Exam Implementation</h1>
 * <p>We are asked to create an application related to files</p>
 * @author : Jana Batiya
 * @version : 1.0
 * @since : 01.19.21*/

package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;


import java.util.Scanner;

/**
 * this class uses the Student class objects to implement the program*/
public class StudentTest {

    /**
     * the main class which makes use of the StudentTest class
     * @param args   */
    public static void main(String[] args) throws IOException {

        // opens, reads, and closes the file
        try (Scanner input = new Scanner(Paths.get("file.txt"))) {

            System.out.printf("%-10s%-12s%-12s%-10s%10s%n", "ID", "First Name", "Middle Name", "Surname", "Grade"); // formatted print statement

            ArrayList<Student> array = new ArrayList<>(); // array for storing Student objects
            Student newStudent = new Student();// creating new Student objects

            // while there's more data to read
            while (input.hasNext()) {
                try {
                    // assigning the input variables to the setters accordingly
                    // and adding each object to the newStudent arraylist
                    String ID = input.next();
                    String FirstName = input.next();
                    String MiddleName = input.next();
                    String SurName = input.next();
                    Double Grade = input.nextDouble();

                    newStudent.setID(ID);
                    array.add(newStudent);
                    newStudent.setFirstname(FirstName);
                    array.add(newStudent);
                    newStudent.setMiddlename(MiddleName);
                    array.add(newStudent);
                    newStudent.setSurname(SurName);
                    array.add(newStudent);
                    newStudent.setGrade(Grade);
                    array.add(newStudent);

                    // displaying information using getters
                    System.out.println("\n");
                    System.out.printf("%-10s%-12s%-12s%-10s%10.2f%n",newStudent.getID(), newStudent.getFirstname(),newStudent.getMiddlename(),newStudent.getSurname(),newStudent.getGrade());
                }
                // handling errors without crashing the program
                catch (Exception e) {
                    System.out.println("ERROR");
                }
            }
        }
    }
}









