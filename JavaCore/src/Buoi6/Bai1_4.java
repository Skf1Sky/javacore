package Buoi6;

import java.util.ArrayList;
import java.util.Scanner;
import Util.isPrime;

public class Bai1_4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = Bai1_1.nhapMang(sc);

        int vitriCuoi = vitriCuoiCungCuaX(a);
        if (vitriCuoi != -1) {
            System.out.println("Vi tri cuoi cung cua x: " + vitriCuoi);
        } else {
            System.out.println("Khong tim thay x trong mang");
        }

        int minPos = findMinPositive(a);
        if (minPos == Integer.MAX_VALUE) {
            System.out.println("Khong co so duong trong mang");
        } else {
            System.out.println("So duong nho nhat: " + minPos);
        }

        System.out.print("Nhap k de tim cac vi tri xuat hien: ");
        int k = sc.nextInt();
        ArrayList<Integer> listK = findElementInArray(a, k);
        if (listK.isEmpty()) {
            System.out.println("So " + k + " khong co trong mang");
        } else {
            System.out.println("Cac vi tri cua " + k + ": " + listK);
        }

        System.out.println("Gia tri Max: " + findMax(a));
        System.out.println("Gia tri Min: " + findMin(a));
    }

    public static int vitriCuoiCungCuaX(int[] arr) {
        System.out.print("Nhap vao phan tu x can tim vi tri cuoi: ");
        int x = sc.nextInt();
        int vitri = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                vitri = i;
            }
        }
        return vitri;
    }

    public static int viTriDauTienSoNguyenTo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime.isPrime(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int findMinPositive(int[] arr) {
        int minPositive = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < minPositive) {
                minPositive = arr[i];
            }
        }
        return minPositive;
    }

    public static ArrayList<Integer> findElementInArray(int[] arr, int k) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) return 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) return 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}