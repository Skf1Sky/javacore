package buoi3;

import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
            return;
        }

        String binary = "";
        int temp = n;

        if (n == 0) {
            binary = "0";
        } else {
            while (temp > 0) {
                binary = (temp % 2) + binary;
                temp /= 2;
            }
        }

        System.out.println("Hệ nhị phân của " + n + " là: " + binary);
    }
}
