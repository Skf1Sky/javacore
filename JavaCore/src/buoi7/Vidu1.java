package buoi7;

import Util.isPrime;

import java.util.Arrays;
import java.util.Scanner;

public class Vidu1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap vao so phan tu cua mang");
//        int n =sc.nextInt();
//        input(n);
        int [] arr ={1,2,3,4,5};
//        arr=addNumber(arr,0);
//        System.out.println(Arrays.toString(arr));

        arr =addNumber2(arr,2);
        System.out.println(Arrays.toString(arr));


    }
    public static int[] input(int n){
        System.out.println("nhap vao so phan tu cua mang");
         n =sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static int[] addNumber(int [] arr, int number){
        for(int i=0;i<=arr.length-1;i++){
            if (isPrime.isPrime(arr[i])){
                arr =Add.add(arr,number,i+1);
            }
        }

        return arr;
    }

    public static int[] addNumber2(int [] arr, int number){
        for(int i=0;i<=arr.length-1;i++){
            if (isPrime.isPrime(arr[i])){
                arr =Add.add(arr,number,i+1);
                i++;
            }
        }

        return arr;
    }


}
