package com.company;
/**
 *  <h1> Device Hierarchy</h1>
 *  <p>In this assignment we created an inheritance hierarchy for the following classes: Device, Android, iOS.
 *  In this Android class, we define instance variables, constructor, setters, getters, dev, and toString methods.
 * </p>
 *
 * @author Jana Batiya
 * @version 1.0
 * @since 2021-11-12
 */
public class Android extends Device {

    // instance variables
    private boolean devmode;
    private float version;

    // constructor
    public Android(boolean devmode, float version){
        super("",0); // explicit call to superclass Device constructor
        setDevmode(devmode);
        setVersion(version);
    }

    // boolean devmode method
    public boolean isDevmode() {
       return devmode;
    }

    // method sets devmode
    public void setDevmode(boolean devmode) {
        this.devmode = devmode;
    }

    // method returns version
    public float getVersion() {
        return version;
    }

    // method sets version
    public void setVersion(float version) {
        this.version = version;
    }
    /**
     * This is the dev method which indicates if the device can be used for app development
     * @return String output based on the condition
     */
    public String dev(){
        if (isDevmode()){ // if isDevmode() method is true
            return ("It is suitable for development");
        }
        else{
            return ("It is not suitable for development"); // when isDevmode() is false
        }
    }

    // return String representation of Android object.
    @Override
    public String toString() {
        return "It has Android mobile operating system version "
                + getVersion() + ". " + dev()+".";

    }
}
