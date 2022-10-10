package javahomeworkweek6naresh;

//Write a Java program to print the area and perimeter of a rectangle.
//Test Data: Width = 5.5 Height = 8.5

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {

        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;

        Scanner rectangle = new Scanner(System.in);
        System.out.println("Enter the Width of Rectangle");
        width = rectangle.nextInt();
        System.out.println("Enter the Height of Rectangle");
        height = rectangle.nextInt();

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.println("The Area of Rectangle is:" + area);
        System.out.println("The Perimeter of Rectsngle is:" + perimeter);


    }
}



/*  System.out.print("Area is : ");
//  System.out.println(a * b);
//
//  System.out.print("Perimeter is : ");
//  System.out.println(2 * (a + b));*/