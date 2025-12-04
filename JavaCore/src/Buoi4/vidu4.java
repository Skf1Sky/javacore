package Buoi4;

import java.awt.*;
import java.util.Scanner;

public class vidu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a");
        int a = sc.nextInt();
        System.out.println("nhap vao b");
        int b = sc.nextInt();
        ptb1(a,b);
    }
    public static void ptb1(double a,double b){
        //ax+b=0
        if(a==0&&b==0){
            System.out.println("phuong trinh vo so nghiem");
        }
        else if (a==0&&b!=0){
            System.out.println("phuong trinh vo nghiem");
        }
        else {
            System.out.println("x= " + -b/a);
        }
    }
}
