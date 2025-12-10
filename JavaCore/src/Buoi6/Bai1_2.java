package Buoi6;

import java.util.Scanner;

public class Bai1_2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

            int[] a = Bai1_1.nhapMang(sc);

            boolean isToanChan = isToanChan(a);
            if (isToanChan == true) {
                System.out.println("mang toan chan");
            } else {
                System.out.println("mang khong toan chan");
            }

            boolean isSoNguyenTo = isSoNguyenTo(a);
            if (isSoNguyenTo == true) {
                System.out.println(" mang toan so nguyen to");
            } else System.out.println(" mang khong toan so nguyen to");


            boolean isMangTangDan = isMangTangDan(a);
            if(isMangTangDan==true){
                System.out.println("mang toan tang");
            } else System.out.println(" mang khong toan tang");

        }



        public static boolean isToanChan(int[] arr) {
            if (arr.length == 0)
                return false;
            for (int x : arr) {
                if (x % 2 != 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isSoNguyenTo(int[] arr) {
            if (arr.length == 0) return false;
            for (int x : arr) {
                if (x < 2) return false;
                for (int i = 2; i <= Math.sqrt(x); i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }
            }
            return true;
        }

    public static boolean isMangTangDan(int[] arr) {
        if (arr.length < 2)
            return true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    }





