package Buoi3;

import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập n
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương > 0");
            return;
        }

        int original = n;  // lưu số ban đầu

        // a) Kiểm tra số đối xứng
        int reversed = 0, temp = n;
        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }
        boolean isPalindrome = (reversed == original);

        // b) Kiểm tra số nguyên tố
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // c) Kiểm tra chữ số tăng dần
        temp = n;
        boolean isIncreasing = true;

        int lastDigit = temp % 10; // chữ số cuối (bên phải)
        temp /= 10;

        while (temp > 0) {
            int currentDigit = temp % 10; // lấy chữ số kế tiếp

            if (currentDigit >= lastDigit) {
                isIncreasing = false;
                break;
            }

            lastDigit = currentDigit;
            temp /= 10;
        }

        // Xuất kết quả
        System.out.println("a. Số đối xứng? " + (isPalindrome ? "Có" : "Không"));
        System.out.println("b. Số nguyên tố? " + (isPrime ? "Có" : "Không"));
        System.out.println("c. Các chữ số tăng dần? " + (isIncreasing ? "Có" : "Không"));
    }
}
