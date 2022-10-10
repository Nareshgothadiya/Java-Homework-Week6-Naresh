package javahomeworkweek6naresh;

// 9. Write a program to convert the upper case to lower case.


//String name = "NARESH";
// System.out.println(name.toLowerCase());
// System.out.println(name.toUpperCase());

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        char ch, ch2;
        System.out.println("Enter Lower Case Letter");
        Scanner convert = new Scanner(System.in);
        ch = convert.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') ;
        ch2 = (Character.toUpperCase(ch));
        System.out.println("Uppercase " + ch2);

        /* ch2 = Character.toLowerCase(ch);
        System.out.println("Lowercase " + ch2);*/
    }
}

