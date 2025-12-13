package buoi7;

import java.util.Arrays;

public class Add {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9};
        arr = add(arr, 100, 2);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] add(int[] arr, int x) {
        int[] brr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        brr[arr.length] = x;
        return brr;
    }

    public static int[] add(int[] arr, int x, int index) {
        int[] brr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            brr[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            brr[i + 1] = arr[i];
        }
        brr[index] = x;
        return brr;
    }

}

