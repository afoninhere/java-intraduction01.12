package com.hillel.classwork.lesson4;

public class Exercise {
    public static void main(String[] args) {

        int ppl1 = 3000;
        int ppl2 = 4500;
        int ppl3 = 5800;
        double proc = 0.05;
        byte years = 10;
        byte months = 12;
        byte allppl = 3;

        long resppl1 = ppl1 * months * years;
        System.out.println("Зарплата первого работника за 10 лет: " + resppl1 + "грн.");
        double nalog1ppl = ppl1 * proc;
        System.out.println("Налог 5% в месяц: " + nalog1ppl + "грн.");

        long resppl2 = ppl2 * months * years;
        System.out.println("Зарплата 2 работника за 10 лет: " + resppl2 + "грн.");
        double nalog2ppl = ppl2 * proc;
        System.out.println("Налог 5% в месяц: " + nalog2ppl + "грн.");

        long resppl3 = ppl3 * months * years;
        System.out.println("Зарплата 3 работника за 10 лет: " + resppl3 + "грн.");
        double nalog3ppl = ppl3 * proc;
        System.out.println("Налог 5% в месяц: " + nalog3ppl + "грн.");

        double resmid = (resppl1 + resppl2 + resppl3 - nalog1ppl - nalog2ppl - nalog3ppl) / allppl;
        System.out.println("Средняя зарплата за 10 лет 3х сотрудников: " + resmid);

    }
}
