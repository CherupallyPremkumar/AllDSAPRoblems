package com.premkumar.DSA.Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BuyStock {
    public static void main(String[] args) {
        stock(new int[]{10, 4, 9, 15, 77});
        anagrams(new String[]{"text", "tet", "xtet", "tte", "ttex"});
    }
    public static void stock(int[] arr)
    {
        if(arr== null || arr.length<2) return;
        int minprice=arr[0];
        int max=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minprice)
            {
                minprice=arr[i];
            }
            else {
                int score=arr[i]-minprice;
               max= Math.max(max,score);
            }
        }
        System.out.println(max);
    }
    public static void anagrams(String[] s)
    {
        Map<Object, List<String>> a= Arrays.stream(s).collect(Collectors.groupingBy(BuyStock::sortArray));
        System.out.println(a);
    }

    private static String sortArray(String s1) {
        char[] chars=s1.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }

}
interface InterfaceA {
    default void someMethod() {
        System.out.println("Default implementation from InterfaceA");
    }
}

interface InterfaceB {
    default void someMethod() {
        System.out.println("Default implementation from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Option 1: Do Nothing
    // Compiler error will occur if you don't provide your own implementation.

    // Option 2: Override and Provide Custom Implementation
    @Override
    public void someMethod() {
        System.out.println("Custom implementation in MyClass");
    }

    // Option 3: Explicitly Choose One Interface's Default Method
    public void callInterfaceADefaultMethod() {
        InterfaceA.super.someMethod();
    }

    public void callInterfaceBDefaultMethod() {
        InterfaceB.super.someMethod();
    }
}

 class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Option 1: Do Nothing
        // obj.someMethod(); // Compiler error

        // Option 2: Override and Provide Custom Implementation
        obj.someMethod(); // Output: Custom implementation in MyClass

        // Option 3: Explicitly Choose One Interface's Default Method
        obj.callInterfaceADefaultMethod(); // Output: Default implementation from InterfaceA
        obj.callInterfaceBDefaultMethod(); // Output: Default implementation from InterfaceB
    }
}
abstract class Shape {
    protected int sides;

    public Shape(int sides) {
        this.sides = sides;
    }

    public abstract void calculateArea();

    public void displayInfo() {
        System.out.println("This shape has " + sides + " sides.");
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super(3); // Invoke the constructor of the abstract class

        this.base = base;
        this.height = height;
    }

    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle area: " + area);
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super(4); // Invoke the constructor of the abstract class

        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = width * height;
        System.out.println("Rectangle area: " + area);
    }
}

 class Mainn {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5.0, 3.0);
        triangle.displayInfo();
        triangle.calculateArea();

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.displayInfo();
        rectangle.calculateArea();
    }
}
 class ZeroSort {
    public static void sortZerosToLeft(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] != 0) {
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 0, 2, 0, 0, 6, 9, 0, 4};

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sortZerosToLeft(arr);

        System.out.println("\nAfter sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

