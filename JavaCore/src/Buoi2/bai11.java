package Buoi2;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        int d = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int m = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int y = scanner.nextInt();
        int maxDay = timSoNgayTrongThang(m, y);
        if (d < 1 || d > maxDay || m < 1 || m > 12 || y < 1) {
            System.out.println("NGÀY KHÔNG HỢP LỆ!");
        } else {
            System.out.println("Ngày hợp lệ!");
            timNgayKeTiep(d, m, y, maxDay);
            timNgayTruocDo(d, m, y);
        }
    }

    public static int timSoNgayTrongThang(int thang, int nam) {
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0))
                    return 29;
                else
                    return 28;
            default:
                return 0;
        }
    }
    public static void timNgayKeTiep(int d, int m, int y, int maxDay) {
        int nextD = d + 1;
        int nextM = m;
        int nextY = y;
        if (nextD > maxDay) {
            nextD = 1;
            nextM++;
            if (nextM > 12) {
                nextM = 1;
                nextY++;
            }
        }
        System.out.println("Ngày kế tiếp: " + nextD + "/" + nextM + "/" + nextY);
    }
    public static void timNgayTruocDo(int d, int m, int y) {
        int prevD = d - 1;
        int prevM = m;
        int prevY = y;
        if (prevD == 0) {
            prevM--;
            if (prevM == 0) {
                prevM = 12;
                prevY--;
            }
            prevD = timSoNgayTrongThang(prevM, prevY);
        }
        System.out.println("Ngày trước đó: " + prevD + "/" + prevM + "/" + prevY);
    }
    }

