package com.hillel.homework.lesson2;

public class homework3 {

    public static void main(String[] args) {

        byte myByte = 101;

        byte myByte2 = 55;

        byte myByte3 = myByte;

        myByte = myByte2;
        System.out.println(myByte);

        myByte2 = myByte3;
        System.out.println(myByte2);

    }
}
