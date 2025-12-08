package Buoi4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n");
        int n = sc.nextInt();
        System.out.println("tong cua S = 1 + 2 + … + n " + sumN(n));
        System.out.println("tong cua S = 1^2 + 2^2 + … + n^2 " + sumOfSquares(n));
        System.out.println(" tong cua S = 1 + 1/2 + … + 1/n " + sumOfInverses(n));
        System.out.println("tich cua S = 1 * 2 * … * n " + productN(n));
        System.out.println(" tong cua S = 1! + 2! + … + n! "+ sumOfFactorials(n));

    }
    public static long sumN(int n) {
        long sum = 0; // Dùng long để tránh tràn số (overflow) nếu n lớn
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static long sumOfSquares(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            // Tính bình phương của i: i * i
            long square = (long) i * i;
            sum += square;
        }
        return sum;
    }
    public static double sumOfInverses(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            // Phép chia 1.0 / i sẽ đảm bảo kết quả là số thực (double)
            sum += 1.0 / i;
        }
        return sum;
    }
    public static long productN(int n) {
        long product = 1; // Khởi tạo tích bằng 1
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    public static long sumOfFactorials(int n) {
        long totalSum = 0;
        long currentFactorial = 1; // Biến lưu trữ giá trị giai thừa hiện tại (i!)

        for (int i = 1; i <= n; i++) {
            // Cập nhật giá trị giai thừa hiện tại: i! = (i-1)! * i
            currentFactorial *= i;

            // Cộng giai thừa hiện tại vào tổng
            totalSum += currentFactorial;
        }
        return totalSum;
    }
}
