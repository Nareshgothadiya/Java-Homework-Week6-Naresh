package javahomeworkweek6naresh;

//Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {
        int number;
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter decimal number :");
        number = convert.nextInt();
        String binarystr = Integer.toBinaryString(number);
        System.out.println("Binary value is : " + binarystr);

    }

}