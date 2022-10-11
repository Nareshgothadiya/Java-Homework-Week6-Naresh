package javahomeworkweek6naresh;

// 5. Write a program for a calculator with addition, subtraction, multiplication
// and division methods all with parameters and use string concatenation methods
// (Note: Two static and Two instance methods.)

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        int p1, p2, p3, op;
        Scanner adj = new Scanner(System.in);
        System.out.println("Input the First number");
        p1 = adj.nextInt();
        System.out.println("Input the Second number");
        p2 = adj.nextInt();

        System.out.println("Options Available");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter Your Options");
        op = adj.nextInt();
        switch (op) {

            case 1:
                p3 = p1 + p2;
                System.out.println("Addition =" + p3);
                break;
            case 2:
                p3 = p1 - p2;
                System.out.println("Subtraction =" + p3);
                break;
            case 3:
                p3 = p1 * p2;
                System.out.println("Multiplication =" + p3);
                break;
            case 4:
                p3 = p1 / p2;
                System.out.println("Division =" + p3);
                break;
            default:
                System.out.println("You have enter wrong Option");
        }


    }

}
