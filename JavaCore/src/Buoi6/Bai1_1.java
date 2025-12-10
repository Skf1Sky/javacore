package Buoi6;

import java.util.Scanner;

public class Bai1_1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] a= nhapMang(sc);
        xuatMang(a);
    }
    public static int[] nhapMang(Scanner sc) {
        int n;
        do {
            System.out.println("Nhap vao so phan tu ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Phan tu nho hon 0 vui long nhap lai");
            }
        } while (n < 0);
        int[] arr = new int[n];
        System.out.println("nhap vao phan tu cua mang");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= ", i, arr[i]);
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void xuatMang(int[] arr){
        System.out.println("mang vua nhap");
        for ( int phantu :arr){
            System.out.println(phantu + "");
        }
        System.out.println();
    }
    }
