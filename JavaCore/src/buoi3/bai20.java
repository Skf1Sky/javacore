package buoi3;

import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập c: ");
        int c = scanner.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
            return;
        }

        long fa = 1, fb = 1, fc = 1;

        // Tính a!
        for (int i = 1; i <= a; i++) {
            fa *= i;
        }

        // Tính b!
        for (int i = 1; i <= b; i++) {
            fb *= i;
        }

        // Tính c!
        for (int i = 1; i <= c; i++) {
            fc *= i;
        }

        long S = fa + fb + fc;

        System.out.println("S = " + S);
    }
}
