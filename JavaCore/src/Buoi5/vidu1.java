package Buoi5;

//https://docs.google.com/spreadsheets/d/1PqokYTFpunkp-fgtKVL111UNOZ87f1T54pqZnxyfM9o/edit?gid=2060246725#gid=2060246725
//Scanner input = new Scanner(System.in);
//        int n, m;
//
//        do {
//            do {
//                System.out.print("please enter n and m number to get string: ");
//                n = input.nextInt();
//
//                if (n < 0) {
//                    System.out.println("\u001B[31m" + "n number must be greater than zero, please enter again" + "\u001b[0m");
//                }
//            }
//            while (n < 0);
//
//            do {
//                System.out.print("please enter m number to get string: ");
//                m = input.nextInt();
//                if (m < 0) {
//                    System.out.println("\u001b[31m" + "m number must be greater than zero, please enter again" + "\u001b[0m");
//                }
//            }
//            while (m < 0);
//
//            if (n > m){
//                System.out.println("\u001b[31m"+"Err: m must be greater than n, please enter again: " + "\u001b[0m");
//            }
//        }
//        while (n > m);

import java.util.Scanner;

public class vidu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao n");
        int n = nhapVaoTriSo();


    }

    public static int nhapVaoTriSo() {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chi so ");
        a = sc.nextInt();
        if (a < 0) {
            System.out.println("\u001b[31m" + "m number must be greater than zero, please enter again" + "\u001b[0m");
        }
        while (a < 0);

        return a;
    }
}