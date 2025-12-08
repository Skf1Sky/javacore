package Buoi4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("nhap vao a,b lan luot");
        a = sc.nextInt();
        b = sc.nextInt();
        int uscln= USCLN(a,b);
        System.out.println("USCLN" + uscln);

    }
    public static int USCLN(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max % min == 0) {
            // USCLN chính là min
            return min;
        }
        for (int i = min / 2; i >= 1; i--) {
            // Kiểm tra xem i có phải là ước chung của cả a và b không
            if (a % i == 0 && b % i == 0) {
                // i chính là USCLN đầu tiên tìm thấy (lớn nhất)
                return i;
            }
        }
        return 1;
    }
}
