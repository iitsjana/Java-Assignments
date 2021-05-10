/**
* <h1>Employee Objects with Loops</h1>
* The EmployeeTest program implements an application that
* takes employee information; firstname, lastname, title,
* social security number, and salary from the user using loops
* gives the employee a 10% raise and prints the information using loops
* @author: Jana Batiya
* @since: 2020-11-6
* @version: 1.0
* */


package com.company;
import java.util.Scanner;
import java.util.ArrayList;
/**
* This method is used to demonstrate the employee object
* @param nothing
* @return args unused*/
public class EmployeeTest {
    /**
     * This is the main method which makes use of the EmployeeTest method
     * @param nothing
     * @return args unused*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //creates EmployeeTest objects for each employee, set to initial values.
        Employee employee1 = new Employee("","","",0,0);
        Employee employee2 = new Employee("","","",0,0);
        Employee employee3 = new Employee("","","",0,0);

//create a new ArrayList of Employee
        ArrayList<Employee> list = new ArrayList<>();
        //appending items to the list
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

//for each loop for asking each employee for input and assigning it to setter methods
        for (Employee employee : list) {

            System.out.printf("Employee %d%n",list.indexOf(employee));
            System.out.println("Please enter your first name ");
            String firstName = input.nextLine();
            employee.setFirstName(firstName);

            System.out.println("Please enter your last name ");
            String lastName = input.nextLine();
            employee.setLastName(lastName);

            System.out.println("Please enter your title ");
            String title = input.nextLine();
            employee.setTitle(title);

            System.out.println("Please enter your Social security number ");
            int socialSecurityNumber = input.nextInt();
            employee.setSocialSecurityNumber(socialSecurityNumber);

            System.out.println("Please enter your salary amount ");
            double salary = input.nextDouble();
            employee.setSalary(salary);

            System.out.println("----------------------");
            input.nextLine();
        }
//for each loop for displaying results for each employee in the Employee object
        for (Employee employee : list) {
            System.out.printf("Employee- %d%n%nFirstname: %s%nLastname: %s%nTitle: %s%nSocial Security Number: %d%nSalary: $%.2f%n%n",
                    list.indexOf(employee), employee.getFirstName(), employee.getLastName(), employee.getTitle(), employee.getSocialSecurityNumber(), employee.getSalary());

        }

//for each loop for calling the GiveRaise method and displaying the 10% raised salary of each employee
            for (Employee employee : list) {
                System.out.printf("%nThe employee %d's raised salary is: $%.2f%n", list.indexOf(employee), employee.GiveRaise());

        }
    }
}
