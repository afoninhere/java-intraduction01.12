package com.hillel.classwork.lesson3;

public class TypeCasting {
    public static void main(String[] args) {

        byte a = 120;
        System.out.println("byte " + a);

        short sh = a;
        System.out.println("short " + sh);

        int i = 2_000_000;
        System.out.println("int " + i);

        a = (byte) i;
        System.out.println("byte " + a);

        a = (byte) (a + 1);
        System.out.println("byte +1 " + a);

        float f = 34.67F;

        byte fleatToByte = (byte) f;
        System.out.println("floattobyte " + fleatToByte);

    }
}
