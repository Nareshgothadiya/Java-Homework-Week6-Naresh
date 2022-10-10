package javahomeworkweek6naresh;

//Write a Java program to add two binary numbers.

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter thr first binary number");
        String a = add.next();
        System.out.println("Enter the second binary number");
        String b = add.next();
        int b1 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int b3 = b1 + b2;

        System.out.println("Addition of Binary is" + Integer.toBinaryString(b3));

          /*int b4 = b1-b2
          System.out.println("Substraction of binary is" + Integer.toBinaryString(b4));*/
    }
}

