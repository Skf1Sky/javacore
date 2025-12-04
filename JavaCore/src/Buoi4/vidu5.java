package Buoi4;

import java.util.Scanner;

public class vidu5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a");
        int a = sc.nextInt();
        System.out.println("so dao cua a" + soDao(a));
        System.out.println("a la so doi xung "+ doiXung(a));
    }

    public static int soDao(int a) {
        int sole = 0;
        while (a > 0) {
            sole = sole * 10 + a % 10;
            a /= 10;
        }
        return sole;
    }

    public static boolean doiXung(int a) {
        return soDao(a)==a ;
    }
//    public static void soChinhPhuong(int a){
//
//    }
//    public static void soNguyenTo(int a){
//
//    }
//    public static int tongCacSoLe(int a){
//        return
//    }
//    public static int tongCacSoNguyenTo(int a){
//
//    }
//    public static int tongCacSoChinhPhuong(int a){
//
//    }
}
