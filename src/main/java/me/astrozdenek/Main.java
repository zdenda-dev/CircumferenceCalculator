package me.astrozdenek;

import java.util.Scanner;

public class Main {
    public static double constantPi(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);

        System.out.println("Enter radius of the circle:");
        double output = constantPi(radius.nextDouble());

        Scanner whatUnits = new Scanner(System.in);

        System.out.println("Enter units:");
        String units = whatUnits.nextLine();

        System.out.println("========================");

        System.out.println("OUTPUT:\no = " + output + " " + units);

        System.out.println("========================");

    }
}