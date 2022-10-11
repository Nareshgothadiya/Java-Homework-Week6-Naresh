package javahomeworkweek6naresh;

// 8. Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        double radius, area;
        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter the radius of the triandle");
        radius = triangle.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("area of the triangle is " + area);
        triangle.close();
    }

}

