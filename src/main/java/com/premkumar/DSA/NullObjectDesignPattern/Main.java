package com.premkumar.DSA.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
       Vechile vechile= VechileFactory.getVechileObject("Bike");
       Vechile vechile1= VechileFactory.getVechileObject("BUSS");
       printObject(vechile);
       printObject(vechile1);
    }
    static void printObject(Vechile vechile)
    {
        System.out.println(vechile.getTank());
        System.out.println(vechile.getSeats());
    }
}
