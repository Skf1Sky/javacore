package Buoi4;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }

    public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Vui long nhap so nguyen duong > 0.");
            return;
        }


        long f0 = 0;
        long f1 = 1;

        System.out.println("\n" + n + " phan tu dau tien cua day Fibonacci la:");

        if (n >= 1) {
            System.out.print(f0);
        }

        // Xử lý n=2
        if (n >= 2) {
            System.out.print(", " + f1);
        }

        for (int i = 3; i <= n; i++) {
            long next = f0 + f1;

            System.out.print(", " + next);


            f0 = f1;
            f1 = next;
        }
        System.out.println();
    }
}
