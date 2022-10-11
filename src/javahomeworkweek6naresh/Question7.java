package javahomeworkweek6naresh;

// 7. Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        double F, cel;
        Scanner tempurature = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahreneit :");
        F = tempurature.nextFloat();
        cel = (F - 32) / 1.8;
        System.out.println("degree celcius is : " + cel);
        tempurature.close();
    }
}
