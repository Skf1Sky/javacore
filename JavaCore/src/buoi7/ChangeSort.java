package buoi7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeSort {
    public static void main(String[] args) {
        int[] arr={-1,-3,-7,5,6,8};
        interchangeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void interchangeSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
