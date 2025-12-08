package Buoi4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so ");
        int n = sc.nextInt();
        System.out.println("so dao la " + reversedNumber(n));
        System.out.println("la so doi xung "+isSymmetricalNumber(n));
        System.out.println("la so chinh phuong "+isSymmetricalNumber(n));
        System.out.println("la so nguyen to "+ isPrimeNumber(n));
        System.out.println("tong cac so le "+calculateTotalOddDigits(n));
        System.out.println("tong cac so chinh phuog "+ calculateTotalSquareDigits(n));


    }

    public static int reversedNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
    public static boolean isSymmetricalNumber(int a){
        return reversedNumber(a)==a;
    }
    public static boolean isSquareNumber(int a){
        return reversedNumber(a)%a==0;
    }
    public static boolean isPrimeNumber(int a){
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static int calculateTotalOddDigits(int n){
        int total = 0;
        for(int i = 1; i <= n; i++){
            total += i;
        }
        return total;
    }
    public static int calculateTotalSquareDigits(int n){
        int total = 0;
        for(int i = 1; i <= n; i++){
            total += i;
        }
        return total;
    }
}
