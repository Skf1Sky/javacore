package buoi3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n");
        int n=sc.nextInt();
        int i =1;
        while (i<=n){
            System.out.println(i);
            i=i+2;
        }
    }
}
