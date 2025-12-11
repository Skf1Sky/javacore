package Buoi3;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
        for(int i=0;i<=n; i++){
            for (int dem=1;dem==i;dem++){
                System.out.println(-i);
            }
        }
    }
}
