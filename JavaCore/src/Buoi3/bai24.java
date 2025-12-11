package Buoi3;

import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập giá tiền món hàng: ");
        int price = scanner.nextInt();

        System.out.print("Nhập tiền khách đưa: ");
        int paid = scanner.nextInt();

        if (paid < price) {
            System.out.println("Khách đưa không đủ tiền!");
            return;
        }

        int change = paid - price;

        System.out.println("Tiền cần thối: " + change + " đồng");

        // Các mệnh giá tiền
        int[] menhGia = {500000, 200000, 100000, 50000, 20000, 10000, 5000, 2000, 1000};

        System.out.println("\nSố tờ tiền thối lại:");

        // Duyệt từng mệnh giá để thối tiền tối ưu
        for (int mg : menhGia) {
            if (change >= mg) {
                int count = change / mg;
                change %= mg;

                System.out.println(mg + "đ : " + count + " tờ");
            }
        }
    }
    }

