package com.premkumar.DSA.NullObjectDesignPattern;

public class VechileFactory {
   static public Vechile getVechileObject(String str)
    {
        if("Car".equals(str)) return new Car();
        else if("Bike".equals(str)) return new Bike();
        else return new NullVechile();
    }

}
