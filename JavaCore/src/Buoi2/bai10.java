package Buoi2;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương x: ");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println(x + " không phải là số chính phương (vì là số âm).");
            return;
        }
        double sqrtX = Math.sqrt(x);
        long phanNguyen = (long) sqrtX;
        if (phanNguyen * phanNguyen == x) {
            System.out.println(x + " LÀ số chính phương.");
        } else {
            System.out.println(x + " KHÔNG phải là số chính phương.");
        }
    }
    }
