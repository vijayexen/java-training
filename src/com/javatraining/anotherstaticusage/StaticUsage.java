package com.javatraining.anotherstaticusage;

public class StaticUsage {

    //    static variable
    static int a = 3;
    static int b = 0;
    static boolean dbInitialised = false;

    //    static block
    static {
        System.out.println("Connecting to Employee database");
        System.out.println("Logging into DB");
        boolean error = connectToDB();
        if (error) {
            dbInitialised = false;
        } else {
            dbInitialised = true;
        }
    }

    //    static method
    static boolean connectToDB() {
//        return true for error
//        return false for non error
        return false;
    }


    //    static class
    public static void main(String[] args) {
        if (!dbInitialised) {
            System.out.println("Error connecting to DB");
        } else {
            System.out.println("Accessing employee details");
        }
    }
}
