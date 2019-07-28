package com.company;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCantimeters(6,1);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchesToCantimeters(73);
    }

    public static double calcFeetAndInchesToCantimeters(double feet, double inches){
        if((inches >= 0 && inches <= 12) && feet >= 0){
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cms");
            return centimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCantimeters(double inches){
        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCantimeters(feet, remainingInches);
    }
}
