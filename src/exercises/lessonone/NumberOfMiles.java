package exercises;

import java.util.Scanner;

public class NumberOfMiles {


    public static void main(String[] args) {
        System.out.println("Please enter the number of miles you've driven: ");
        Scanner input = new Scanner(System.in);
        double numOfMiles = input.nextDouble();
        System.out.println("Now please enter the amount of gas consumed in gallons: ");
        double gasConsumed = input.nextDouble();

        double milesPerGallonDriven = numOfMiles / gasConsumed;

        System.out.println("Miles per gallon: " + milesPerGallonDriven);




    }
}
