package Buoi2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luongcoban = 650000;
        int TNCT;
        System.out.println("nhap vao TNCT");
        TNCT = sc.nextInt();
        if(TNCT<12){
            System.out.println("luong "+ 1.92*luongcoban);
        } else if (12<=TNCT&&TNCT<36) {
            System.out.println("luong" + 2.34*luongcoban);            
        } else if (36<=TNCT&&TNCT<60) {
            System.out.println("luong" +3*luongcoban);
        }
        else if(TNCT>=60){
            System.out.println("luong "+4.5*luongcoban);
        }
    }
}
