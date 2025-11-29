package Buoi2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        int max1, min1;
        if (a > b) {
            max1 = a;
            min1 = b;
        } else {
            max1 = b;
            min1 = a;
        }
        System.out.println("\n--- Kết quả (Cách 1: If-Else) ---");
        System.out.println("Số lớn nhất (Max): " + max1);
        System.out.println("Số nhỏ nhất (Min): " + min1);
        int max2 = Math.max(a, b);
        int min2 = Math.min(a, b);

        System.out.println("\n--- Kết quả (Cách 2: Math Library) ---");
        System.out.println("Số lớn nhất (Max): " + max2);
        System.out.println("Số nhỏ nhất (Min): " + min2);
    }
    }

