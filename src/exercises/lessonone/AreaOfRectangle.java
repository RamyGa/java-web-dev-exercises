package exercises;

import java.util.Scanner;

public class AreaOfRectangle {



    public static void main(String[] args) {

        System.out.println("provide the length of the rectangle: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();

        System.out.println("provide the width of the rectangle: ");

        double width = input.nextDouble();

        System.out.println("The area of the rectangle is: "+ length * width);



    }

}
