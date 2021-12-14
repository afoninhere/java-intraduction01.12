package com.hillel.homework.lesson2;

public class Homework7 {
    public static void main(String[] args) {

        int snoopdogs = 24;
        int nyancats = 8;
        int portion = 50;
        int coast = 2;
        int days = 30;

        int catsMonth = calculateFoodPerMonth(nyancats, portion, days);
        System.out.println("Количество корма котам в месяц: " + catsMonth + "гр.");
        int dogsMonth = calculateFoodPerMonth(snoopdogs, portion, days);
        System.out.println("Количество корма собакам в месяц: " + dogsMonth + "гр.");
        int moneyFinal = moneyPerMonth(catsMonth, dogsMonth, portion, coast);
        System.out.println("Количество денег для содержания приюта: " + moneyFinal + "$$$");

    }

    public static int calculateFoodPerMonth(int animals, int portion, int days) {
        return  (animals * portion) * days;
    }
    public static int moneyPerMonth(int catsMonth,int dogsMonth, int portion, int coast) {
        return  (catsMonth + dogsMonth) / portion * coast;
    }

}
