package Buoi6;

import java.util.Scanner;

public class vidu2 {
    public static void main(String[] args) {
        //nhập mảng//
        Scanner sc = new Scanner(System.in);
        //Nhập xuất mảng
        //b1: nhập phần từ
        int n = sc.nextInt();
        //b2" new mảng
        int[] arr = new int[n];

        //b3: nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào arr [%d]:", i);
            arr[i] = sc.nextInt();
        }
        for (int j=0;j<=arr.length;j++){
            if(arr[j]%2!=0){
                System.out.println("mang khong toan chan");
                break;
            }
            else {
                System.out.println("mang toan chan");
                break;
            }
        }
        //in ra màn hình kết quả


    }
        //duyệt qua mảng + if else chia 2 lấy dư 0//

    }

