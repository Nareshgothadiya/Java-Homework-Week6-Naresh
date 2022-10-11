package javahomeworkweek6naresh;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.


import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        int first1, second1, third1, sum;
        Scanner average = new Scanner(System.in);
        System.out.println("Enter the first number:");
        first1 = average.nextInt();
        System.out.println("Enter the second number:");
        second1 = average.nextInt();
        System.out.println("Enter the third number:");
        third1 = average.nextInt();
        sum = first1 + second1 + third1;
        double avg = sum / 3;
        System.out.println("Average of the numbers is " + avg);
        average.close();
    }
}
// Scanner average = new Scanner(System.in);
// System.out.print("Enter the first number: ");
// double first1 = average.nextDouble();
// System.out.print("Enter the second number: ");
// double second2 = average.nextDouble();
// System.out.print("Enter the third number: ");
// double third3 = average.nextDouble();
// average.close();
// System.out.print("The average of entered numbers is:" + avr(first1, second2, third3));
// }public static double avr(double a, double b, double c) {
//  return (a + b + c) / 3;
//  }


