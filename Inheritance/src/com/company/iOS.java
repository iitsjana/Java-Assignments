package com.company;
/**
 *  <h1>Device Hierarchy</h1>
 *  <p>In this assignment we created an inheritance hierarchy for the following classes: Device, Android, iOS.
 *  In this iOS class, we define instance variables, constructor, setters, getters, and toString methods.
 * </p>
 *
 * @author Jana Batiya
 * @version 1.0
 * @since 2021-11-12
 */
public class iOS extends Device{

    // instance variables
    private String model;
    private int SEID;

    // constructor
    public iOS(String model, int SEID) {
        super("",0);// explicit call to superclass Device constructor
        setModel(model);
        setSEID(SEID);
    }

    // method returns model
    public String getModel() {
        return model;
    }

    // method sets model
    public void setModel(String model) {
        this.model = model;
    }

    // method returns SEID
    public int getSEID() {
        return SEID;
    }

    //method sets SEID
    public void setSEID(int SEID) {
        this.SEID = SEID;
    }

    // return String representation of iOS object.
    @Override
    public String toString() {
        return "It is an "+ getModel() +
                " with a SEID of " + getSEID();
    }
}
