package com.manny;

public class Main {

    public static void main(String[] args) {
	// These 8 types are what we call primitive types in Java defined by "keyword"
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

    // A String is a sequence of characters
        // String is actually a class and is treated differently than a primitive (extremely powerful)

        String myString = "This is my string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2018";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);
    }
}
