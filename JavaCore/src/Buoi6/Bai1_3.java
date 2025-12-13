package Buoi6;

import java.util.Scanner;

public class Bai1_3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = Bai1_1.nhapMang(sc);

        int soluongPhanTuLe = demPhanTuLe(a);
        System.out.println("so luong phan tu le" + soluongPhanTuLe);

        int tongPhanTuLe = tongPhanTuLe(a);
        System.out.println("tong phan tu le" + tongPhanTuLe);
    }

    public static int demPhanTuLe(int[] arr) {
        if (arr.length == 0)
            System.out.println("mang rong");
        int soluong = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                soluong++;
            }
        }
        return soluong;
    }

    public static int tongPhanTuLe(int[] arr) {
        int Tong = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                Tong = Tong + arr[i];
            }
        }
        return Tong;
    }

    public static int soluongChiaHetCho4KhongChiaHetCho5(int[] arr) {
        int soluong = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 && arr[i] % 5 == 0) {
                soluong++;
            }
        }
        return soluong;
    }

    public static int tongSoNguyenTo(int[] arr) {
        int Tong = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    Tong = Tong + arr[i];
                }
            }
        }
        return Tong;
    }
}
