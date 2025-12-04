package buoi3;

import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        // Nhập a và b, đảm bảo b > a
        System.out.print("Nhập a: ");
        a = scanner.nextInt();

        System.out.print("Nhập b: ");
        b = scanner.nextInt();

        if (a <= 0 || b <= 0 || b <= a) {
            System.out.println("Vui lòng nhập a, b là số nguyên dương và b > a!");
            return;
        }

        int countPalindrome = 0, sumPalindrome = 0;
        int countSquare = 0, sumSquare = 0;
        int countPrime = 0, sumPrime = 0;

        // Duyệt từ a đến b
        for (int n = a; n <= b; n++) {

            // --- Kiểm tra số đối xứng ---
            int temp = n;
            int reversed = 0;
            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }
            if (reversed == n) {
                countPalindrome++;
                sumPalindrome += n;
            }

            // --- Kiểm tra số chính phương ---
            int r = (int) Math.sqrt(n);
            if (r * r == n) {
                countSquare++;
                sumSquare += n;
            }

            // --- Kiểm tra số nguyên tố ---
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
            if (isPrime) {
                countPrime++;
                sumPrime += n;
            }
        }

        // --- Xuất kết quả ---
        System.out.println("Kết quả trong đoạn [" + a + ", " + b + "]:");

        System.out.println("1. Số đối xứng: " + countPalindrome + ", Tổng = " + sumPalindrome);
        System.out.println("2. Số chính phương: " + countSquare + ", Tổng = " + sumSquare);
        System.out.println("3. Số nguyên tố: " + countPrime + ", Tổng = " + sumPrime);
    }
}
