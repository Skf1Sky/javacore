package Buoi6;

import java.util.Scanner;

public class vidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập xuất mảng
        //b1: nhập phần từ
        int n = sc.nextInt();
        //b2" new mảng
        int[] arr = new int[n];

        //b3: nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào arr [%d]:", i);
            arr[i] = sc.nextInt();
        }
        //b4: xuất mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }

    }
}
