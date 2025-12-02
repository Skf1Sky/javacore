package buoi3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("nhap vao n");
        int n = sc.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
