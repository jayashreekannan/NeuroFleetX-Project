package Javaexercises;

public class MaximumOfArray {
     public static void main(String[] args) {
        int[] arr = {5, 9, 3, 12, 7};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println("Maximum: " + max);
    }
}
