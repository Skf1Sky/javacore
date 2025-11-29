package Buoi2;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào 1 ký tự chữ cái: ");
        String input = scanner.next();
        char c = input.charAt(0);
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            System.out.println("Ký tự ban đầu: " + c);
            if (c >= 'A' && c <= 'Z') {
                c += 32;
                System.out.println("Sau khi đổi: " + c);
            } else {
                c -= 32;
                System.out.println("Sau khi đổi: " + c);
            }

        } else {
            System.out.println("Bạn đã nhập sai! Vui lòng chỉ nhập chữ cái (a-z, A-Z).");
        }
    }
    }

