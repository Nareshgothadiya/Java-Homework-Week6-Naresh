package javahomeworkweek6naresh;
//Write a Java program to swap two variables.

public class Question15 {

    public static void main(String[] args) {
        int a = 20;
        int b = 40;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}

// c = a;
// a = b;
// b = c;