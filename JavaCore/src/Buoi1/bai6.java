package Buoi1;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập 5 số cuối của biển xe (VD: 56789): ");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        int soNut = sum % 10;
        System.out.println("Tổng các chữ số là: " + sum);
        System.out.println("Số nút của biển xe là: " + soNut);
        // Mở rộng: Xét trường hợp đặc biệt (ví dụ 20 điểm thường gọi là 10 nút/bù)
        if (soNut == 0 && sum > 0) {
            System.out.println("Đánh giá: 10 nút (hoặc Bù - tùy cách gọi)");
        }
    }
}
