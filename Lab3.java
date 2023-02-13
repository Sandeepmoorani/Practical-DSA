import java.util.Scanner;

// Lab3 Task-01 

public class Lab3 {

    public static String LinearSearch_1DArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return ("\nThe searched element at index [" + i + "]");

            }
        }
        return "Not found";
    }

    public static String LinearSearch_2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    return ("\nThe searched element at index [" + i + "]" + "[" + j + "]");
                }
            }

        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 3, 4, 56, 6, 78, 89, 90, 67, 34, 23 };
        int[][] arr_2d = { { 12, 43, 65 }, { 78, 5, 8 }, { 3, 56, 978 }, { 3, 6, 8 } };
        System.out.println("Enter the number to search in array");
        int x = sc.nextInt();
        System.out.println("searching the element in the 1-D array using Linear search ");
        System.out.println(LinearSearch_1DArray(arr, x));
        System.out.println("\nsearching the element in the 2-D array using Linear search ");
        System.out.println(LinearSearch_2DArray(arr_2d, x));
    }
}
