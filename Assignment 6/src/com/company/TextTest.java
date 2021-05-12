/**<h1>Text Analysis<h1/>
 * <p>In this assignment we are going to create a phrase analyzer that
 * will receive a string of text as input and print out a table of
 * occurrence for the letters of the alphabet in that given text.<p/>
 * @author : Jana Batiya
 * @since : 12/12/2020
 * @version : 1.0*/


package com.company;

import java.util.Scanner;

/**
 * This method is used to demonstrate the text object
 * @return args unused*/
public class TextTest {
    /**
     * This is the main method which makes use of the EmployeeTest method
     * @param args
     * @return args unused*/
    public static void main(String[] args) {
        TextAnalyzer text = new TextAnalyzer(""); // initializing a new text object from textAnalyzer
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a text\n");

        String sentence = input.nextLine();
        sentence.toLowerCase(); // converts all letters to lower case

       text.setText(sentence); // assigning sentence to the setter method

        System.out.println("****************");
        System.out.println("Table of Frequency");
        System.out.println("****************");
        System.out.println("Characters\tFrequency");
        text.FrequencyCalculator(sentence); // calls the FrequencyCalculator method while taking sentence as an argument


        }

    }



