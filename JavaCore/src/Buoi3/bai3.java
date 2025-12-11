package Buoi3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=2;
        System.out.println("nhap vao n");
        int n = sc.nextInt();
        while(i<=n){
            if(i%4==0){
                System.out.println(-i);
            }
            else {
                System.out.println(i);
            }
            i=i+2;
        }
    }
}
