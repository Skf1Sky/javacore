package Buoi1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao so luong san pham");
        int a=sc.nextInt();
        System.out.println("nhap vao gia tien 1 san pham");
        int b=sc.nextInt();
        System.out.println("thue cua doanh nghiep "+((a*b)*10/100));
    }
}
