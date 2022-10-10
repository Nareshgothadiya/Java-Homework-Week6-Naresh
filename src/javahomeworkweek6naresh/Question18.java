package javahomeworkweek6naresh;
//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.println("Input the First number");
        int n1 = sum.nextInt();
        System.out.println("Input the Second number");
        int n2 = sum.nextInt();
        // System.out.println(n1+n2);
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2)); //addition
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2)); //subtract
        System.out.println(n1 + " * " + n2 + " = " + (n1 * n2)); //multiply
        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2)); //divide
        System.out.println(n1 + " % " + n2 + " = " + (n1 % n2)); //mod
    }
}
