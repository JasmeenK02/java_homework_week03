package java_homework_week03;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class P1InputOddOrEven {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = s1.nextInt();

        oodOrEven(num);
    }

    public static void oodOrEven(int num) {

        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd + " number");
    }
}


