package com.hillel.homework.lesson2;

public class Homework6 {

    public static void main(String[] args) {

        String airplaneType = "Raptor";
        String airplaneModel = "Airliner";
        int economyClassSeats = 22;
        int businessClassSeats = 12;

        printAirplaneInfo(airplaneType, airplaneModel);
        printAirplaneInfo(airplaneType, airplaneModel, economyClassSeats);
        printAirplaneInfo(airplaneType, airplaneModel, economyClassSeats, businessClassSeats);

    }

    public static void printAirplaneInfo(String airplaneType, String airplaneModel) {
        System.out.println("Тип самалета: " + airplaneType + ",модель: " + airplaneModel);
    }
    public static void printAirplaneInfo(String airplaneType, String airplaneModel, int economyClassSeats) {
        System.out.println("Тип самалета: " + airplaneType + ",модель: " + airplaneModel + " кол. пасажиров эконом класса: " + economyClassSeats);
    }
    public static void printAirplaneInfo(String airplaneType, String airplaneModel, int economyClassSeats, int businessClassSeats) {
        System.out.println("Тип самалета: " + airplaneType + ",модель: " + airplaneModel + " кол. пасажиров эконом класса: " + economyClassSeats + " кол. мест в бизнесс классе: " + businessClassSeats);
    }

}