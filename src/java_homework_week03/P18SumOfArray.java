package java_homework_week03;
/**
 * 18. Write a Java program to sum values of an array.
 */

public class P18SumOfArray {

    public static void main(String[] args) {

        int[] number = {
                55,67,252,645,121,1052,98,567};
        int sum = 0;
        for (int i : number){
            sum = sum + i;
        }
        System.out.println("Sum of array is : " + sum);
    }
}
