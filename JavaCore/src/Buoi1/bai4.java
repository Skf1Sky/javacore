package Buoi1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao diem toan");
        int a=sc.nextInt();
        System.out.println("nhap vao diem van");
        int b= sc.nextInt();
        System.out.println("diem trung binh "+ ((a+b)/2));
    }
}
