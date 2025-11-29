package Buoi1;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ban kinh");
        int r = sc.nextInt();
        System.out.println("chu vi la " + (r*2)*3.14);
        System.out.println("dien tinh la "+ (r*r*3.14));
    }
}
