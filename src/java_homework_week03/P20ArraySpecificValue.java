package java_homework_week03;
/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
public class P20ArraySpecificValue {

    public static boolean specific(int[] array, int item){
        for(int n : array){
            if (item == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array1 = {
                1456,245,654,1256,74,7789,45688,192,3876};

        System.out.println(specific(my_array1, 1256));
        System.out.println(specific(my_array1, 556));

    }
}
