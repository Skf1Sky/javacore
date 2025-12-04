package buoi3;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập n > 0!");
            return;
        }

        int f1 = 1, f2 = 2;

        System.out.print("Dãy Fibonacci: ");

        // In số đầu tiên
        if (n >= 1) System.out.print(f1 + " ");
        // In số thứ hai
        if (n >= 2) System.out.print(f2 + " ");

        // In các số còn lại
        for (int i = 3; i <= n; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");

            f1 = f2;
            f2 = f3;
        }
    }
    }

