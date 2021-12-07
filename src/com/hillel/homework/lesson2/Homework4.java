package com.hillel.homework.lesson2;

public class Homework4 {
    public static void main(String[] args) {

        byte ball1 = 1;
        double ball2 = 0.5;
        double ball3 = 0.2;
        double convert = 0.7;

        double sb1 = (4 / 3F) * (Math.PI * Math.sqrt(ball1));
        System.out.println("snowBall3: " + sb1);

        double sb2 = (4 / 3F) * (Math.PI * Math.sqrt(ball2));
        System.out.println("snowBall3: " + sb2);

        double sb3 = (4 / 3F) * (Math.PI * Math.sqrt(ball3));
        System.out.println("snowBall3: " + sb3);

        double massa1 = sb1 * convert;
        System.out.println(massa1);

        double massa2 = sb2 * convert;
        System.out.println(massa2);

        double massa3 = sb3 * convert;
        System.out.println(massa3);

        double result = massa1 + massa2 + massa3;

        String sss = String.format("%.2f",result);
        System.out.println("Massa snowman: " + sss + " kg");

    }

}
