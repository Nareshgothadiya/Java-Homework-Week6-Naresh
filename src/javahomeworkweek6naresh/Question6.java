package javahomeworkweek6naresh;

// 6. Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        double radius, area;
        Scanner circlearea = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = circlearea.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is " + area);
        circlearea.close();
    }

}
