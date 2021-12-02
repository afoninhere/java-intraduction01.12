package com.hillel.classwork.lesson2;

public class Variables {
    public static void main(String[] args) {
        byte myByte = 101;
        System.out.println("this is byte: " + myByte);

        short myShort = 30000;
        System.out.println("this is short: " + myShort);

        int myInt = 345_457_567;
        System.out.println("this is int: " + myInt);

        long myLong = 100_000_000_000L;
        System.out.println("this is long!: " + myLong);

        float myFloat = 45.890F;
        System.out.println(myFloat);

        double myDouble = 4234324333.32423433;
        System.out.println(myDouble);

        boolean isValid = false;
        System.out.println(isValid);

        char myChar = '$';
        System.out.println(myChar);

        char myNumericChar = 236;
        System.out.println(myNumericChar);

        char ch3 = '\u0054';
        System.out.println(ch3);

        String string = "test";
        System.out.println("this is string: " + string);

        int resoult = myByte - myShort;
        System.out.println(resoult);



    }
}
