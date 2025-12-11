package Util;

import java.util.Scanner;

public class nhapMangString1{
    static Scanner sc = new Scanner(System.in);
    static void main() {
        String[] ten = nhapMangString(sc, "ho va ten");
    }
    public static String[] nhapMangString(Scanner sc , String tieuDe){
        System.out.println("nhap vao so luong" + tieuDe );
        int n=sc.nextInt();
        sc.nextLine();
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            // Ghép biến tieuDe vào câu thông báo
            System.out.print("Nhap " + tieuDe + " thu " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        return arr;
    }
}
