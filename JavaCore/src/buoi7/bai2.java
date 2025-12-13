package buoi7;

import Util.ArrayUtil;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

        int[] a = {1, 2, 8, 7, 3, 7, 4, 2, 1};
        Scanner sc = new Scanner(System.in);

        System.out.print("Mang Goc: ");

        ArrayUtil.printArray(a);
        System.out.println("-----------------------------");



        int[] bArr = ArrayUtil.insertZeroAfterPrimes(a);
        System.out.print("b. Chen 0 sau SNT: ");
        ArrayUtil.printArray(bArr);


        int[] dArr = ArrayUtil.removeAllPrimes(a);
        System.out.print("d. Xoa tat ca SNT: ");
        ArrayUtil.printArray(dArr);


        System.out.print("(*) Nhap gia tri k can xoa (vd: 7): ");
        int kDelete = sc.nextInt();

        int[] cArr = ArrayUtil.removeAllValues(a, kDelete);
        System.out.print("c. Mang sau khi xoa " + kDelete + ": ");
        ArrayUtil.printArray(cArr);


        System.out.println("\ne. Chen so 999 vao vi tri k=2 (Mat so cuoi cung):");
        ArrayUtil.insertAtPositionFixed(a, 999, 2);
        System.out.print("   Mang a hien tai: ");
        ArrayUtil.printArray(a);


        ArrayUtil.replacePrimesWithZero(a);
        System.out.print("a. Sua SNT thanh 0: ");
        ArrayUtil.printArray(a);
    }
}