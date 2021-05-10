package com.company;

//employee class storing an employee's information

public class Employee {
    String firstName;
    String lastName;
    String title;
    int socialSecurityNumber;
    double salary;

    // Constructor initializing instance variables

    public Employee(String firstName, String lastName, String title, int socialSecurityNumber, double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.title=title;
        this.socialSecurityNumber=socialSecurityNumber;
        this.salary=salary;
    }
//this is our setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
//this is our getter
    public String getFirstName() {
        return firstName;
    }
    //this is our setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //this is our getter
    public String getLastName() {
        return lastName;
    }

    //this is our setter
    public void setTitle(String title) {
        this.title = title;
    }
    //this is our getter
    public String getTitle() {
        return title;
    }
    //this is our setter
    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    //this is our getter
    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    //this is our setter
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //this is our getter
    public double getSalary() {
        return salary;
    }

    /**
     * This method is used to calculate a 10% salary raise.
     * @param nothing
     * @return salary.
     */
    public double GiveRaise(){

        this.salary+=(this.salary*0.10);

        return salary;
    }
}

