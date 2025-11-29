package Buoi2;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng (1-12): ");
        int thang = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();
        int soNgay = 0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            case 2:
                if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
            default:
                System.out.println("Tháng nhập không hợp lệ!");
                return;
        }
        System.out.println("Tháng " + thang + " năm " + nam + " có " + soNgay + " ngày.");
    }
}

