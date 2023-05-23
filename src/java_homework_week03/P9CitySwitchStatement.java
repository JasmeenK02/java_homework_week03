package java_homework_week03;
/**
 * 9. Same as above program-8 using switch statement.
 */


import java.util.Scanner;

public class P9CitySwitchStatement {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any alphabet starts with 'A' to 'F':");
        char alphabet = s1.next().charAt(0);

        switch (alphabet){

            case 'A':
                System.out.println("Aberdeen");
                break;
            case 'B':
                System.out.println("Bristol");
                break;
            case 'C':
                System.out.println("Coventry");
                break;
            case 'D':
                System.out.println("Derby");
                break;
            case 'E':
                System.out.println("Exeter");
                break;
            case 'F':
                System.out.println("Florida");
                break;

            default:
                System.out.println("Invalid entry!");

        }

    }
}
