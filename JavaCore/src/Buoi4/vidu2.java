package Buoi4;

import java.util.Scanner;

public class vidu2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao a");
        int a = sc.nextInt();
        System.out.println("nhap vao b");
        int b = sc.nextInt();
        System.out.println("tong" + tinhTong(a,b));

    }
    public static int tinhTong(int a,int b){
        return a+b;
    }
}
