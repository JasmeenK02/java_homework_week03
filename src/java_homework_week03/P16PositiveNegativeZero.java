package java_homework_week03;
/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
import java.util.Scanner;

public class P16PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        float x = s1.nextFloat();
        posinegazero(x);
        s1.close();

    }

    public static void posinegazero(float x){

        if (x>0) {
            System.out.println(x+ " is a positive number");
        } else if (x<0) {
            System.out.println(x+ " is a negative number");
        } else {
            System.out.println(x+ " is zero");
        }

    }
}
