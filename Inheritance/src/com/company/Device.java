package com.company;

/**
 *  <h1>Device Hierarchy</h1>
 *  <p>In this assignment we created an inheritance hierarchy for the following classes: Device, Android, iOS.
 *  In this Device class, we define instance variables, constructor, setters, getters, and toString methods.
 * </p>
 *
 * @author Jana Batiya
 * @version 1.0
 * @since 2021-11-12
 */
public class Device {

    // instance variables
    private String company;
    private int releaseDate;

    // constructor
    public Device(String company, int releaseDate){
        setCompany(company);
        setReleaseDate(releaseDate);
    }

    //method returns company
    public String getCompany() {
        return company;
    }

    // method sets company
    public void setCompany(String company) {
        this.company = company;
    }

    // method returns releaseDate
    public int getReleaseDate() {
        return releaseDate;
    }

    // method sets releaseDate
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    // return String representation of Device object.
    @Override
    public String toString() {
        return  "Device is manufactured by " + getCompany() + "."
                + " It was released in " + getReleaseDate() +
                ". ";
    }
}
